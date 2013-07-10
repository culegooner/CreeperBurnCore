package mod.culegooner.CreeperBurnCore;

import java.util.Arrays;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CBDummyContainer extends DummyModContainer {

	public CBDummyContainer() {

		super(new ModMetadata());
		ModMetadata meta = getMetadata();
		meta.modId = "CreeperBurnCore";
		meta.name = "CreeperBurnCore";
		meta.version = "@VERSION@"; //String.format("%d.%d.%d.%d", majorVersion, minorVersion, revisionVersion, buildVersion);
		meta.credits = "Roll Credits ...";
		meta.authorList = Arrays.asList("culegooner");
		meta.description = "";
		meta.url = "https://github.com/culegooner/CreeperBurnCore";
		meta.updateUrl = "";
		meta.screenshots = new String[0];
		meta.logoFile = "";

	}

	@Override
	public boolean registerBus(EventBus bus, LoadController controller) {
		bus.register(this);
		return true;
	}

	@Subscribe
	public void preInit(FMLPreInitializationEvent evt) {

	}

	@Subscribe
	public void postInit(FMLPostInitializationEvent evt) {

	}

}
