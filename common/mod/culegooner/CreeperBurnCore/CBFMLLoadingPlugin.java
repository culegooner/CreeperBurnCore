package mod.culegooner.CreeperBurnCore;

import java.io.File;
import java.util.Map;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;

@MCVersion(value = "1.6.2")
public class CBFMLLoadingPlugin implements cpw.mods.fml.relauncher.IFMLLoadingPlugin {

	
	public static File location;
	
	@Override
	public String[] getLibraryRequestClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getASMTransformerClass() {
	//This will return the name of the class "mod.culegooner.CreeperBurnCore.CBClassTransformer"
		return new String[]{CBClassTransformer.class.getName()};
	}

	@Override
	public String getModContainerClass() {
		//This is the name of our dummy container "mod.culegooner.CreeperBurnCore.CBDummyContainer"
		return CBDummyContainer.class.getName();
	}

	@Override
	public String getSetupClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
		//This will return the jar file of this mod CreeperBurnCore_dummy.jar"
		location = (File) data.get("coremodLocation");
		//System.out.println("*** Transformer jar location location.getName: " +location.getName());
	}

}
