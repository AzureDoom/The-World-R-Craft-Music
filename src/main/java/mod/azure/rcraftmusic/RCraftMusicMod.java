package mod.azure.rcraftmusic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RCraftMusicMod.MODID, version = RCraftMusicMod.VERSION, dependencies = RCraftMusicMod.DEPENDENCIES)
public class RCraftMusicMod {
	
	public static final String MODID = "rcraftmusic";
	public static final String MODNAME = "The World R:Craft Music";
	public static final String VERSION = "1.0.0";
	public static final String DEPENDENCIES = "required:forge;required:customnpcs";
	private static final Logger LOGGER = LogManager.getLogger();
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		LOGGER.debug("Loading Music...");
	}
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		LOGGER.debug("Setting up the speakers...");	
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		LOGGER.debug("This shindig looks like the bomb-diggity");		
	}
}