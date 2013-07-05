package mod.culegooner;

import java.io.File;
import java.util.Map;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

public class CBFMLLoadingPlugin implements IFMLLoadingPlugin {

	
	public static File location;
	
	@Override
	public String[] getLibraryRequestClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getASMTransformerClass() {
		//return new String[]{CBClassTransformer.class.getName()};
		return new String[] { "mod.culegooner.CBClassTransformer" };
	}

	@Override
	public String getModContainerClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSetupClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
		location = (File) data.get("coremodLocation");

	}

}
