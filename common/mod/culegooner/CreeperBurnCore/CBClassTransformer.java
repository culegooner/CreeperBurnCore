package mod.culegooner.CreeperBurnCore;

import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class CBClassTransformer implements net.minecraft.launchwrapper.IClassTransformer {

	@Override
	public byte[] transform(String arg0, String arg1, byte[] arg2) {
		
		//Check if the JVM is about to process the tc.class or the EntityCreeper.class
		if (arg0.equals("tc") || arg0.equals("net.minecraft.entity.monster.EntityCreeper")) {
			System.out.println("********* INSIDE CREEPER TRANSFORMER ABOUT TO PATCH: " + arg0);
			arg2 = patchClassInJar(arg0, arg2, arg0, CBFMLLoadingPlugin.location);
        }
        return arg2;
	}

	//a small helper method that takes the class name we want to replace and our jar file.
	//It then uses the java zip library to open up the jar file and extract the classes.
	//Afterwards it serializes the class in bytes and pushes it on to the JVM.
	//with the original bytes that JVM was about to process ignored completely

	 public byte[] patchClassInJar(String name, byte[] bytes, String ObfName, File location) {
	        try {
	        	//open the jar as zip
	            ZipFile zip = new ZipFile(location);
	          //find the file inside the zip that is called tc.class or net.minecraft.entity.monster.EntityCreeper.class
	          //replacing the . to / so it would look for net/minecraft/entity/monster/EntityCreeper.class
	            ZipEntry entry = zip.getEntry(name.replace('.', '/') + ".class");
	            if (entry == null) {
	                System.out.println(name + " not found in " + location.getName());
	            } else {
	            	//serialize the class file into the bytes array
	                InputStream zin = zip.getInputStream(entry);
	                bytes = new byte[(int) entry.getSize()];
	                zin.read(bytes);
	                zin.close();
	                System.out.println("[" + "CreeperBurnCore" + "]: " + "Class " + name + " patched!");
	            }
	            zip.close();
	        } catch (Exception e) {
	            throw new RuntimeException("Error overriding " + name + " from " + location.getName(), e);
	        }
	      //return the new bytes
	        return bytes;
	    }
}
