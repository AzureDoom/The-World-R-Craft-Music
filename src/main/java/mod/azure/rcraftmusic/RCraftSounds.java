package mod.azure.rcraftmusic;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class RCraftSounds {

	public static SoundEvent TONE_SOUND = ofSound("music.tone");
	public static SoundEvent PRAIRIECLEARWEATHER_SOUND = ofSound("music.prairieclearweather");
	public static SoundEvent PRAIRIECLOUDY_SOUND = ofSound("music.prairiecloudy");
	public static SoundEvent PRAIRIEEVENING_SOUND = ofSound("music.prairieevening");
	public static SoundEvent AVATARSPACE_SOUND = ofSound("music.avatarspace");
	public static SoundEvent DESKTOP_SOUND = ofSound("music.desktop");
	public static SoundEvent CASTLEDUNGEON_SOUND = ofSound("music.castledungeon");
	public static SoundEvent CAVEDUNGEON_SOUND = ofSound("music.cavedungeon");
	public static SoundEvent DESERTFIELD_SOUND = ofSound("music.desertfield");
	public static SoundEvent EARTHFIELD_SOUND = ofSound("music.earthfield");
	public static SoundEvent FORESTFIELD_SOUND = ofSound("music.forestfield");
	public static SoundEvent MEATWALLDUNGEON_SOUND = ofSound("music.meatwalldungeon");
	public static SoundEvent PRAIRIERAIN_SOUND = ofSound("music.prairierain");
	public static SoundEvent SCORCHINGFIELD_SOUND = ofSound("music.scorchingfield");
	public static SoundEvent SNOWFIELDNIGHTFIELD_SOUND = ofSound("music.snowfieldnightfield");
	public static SoundEvent STONEWALLDUNGEON_SOUND = ofSound("music.stonewalldungeon");
	public static SoundEvent WASTELANDFIELD_SOUND = ofSound("music.wastelandfield");
	public static SoundEvent WILDERNESSFIELD_SOUND = ofSound("music.wildernessfield");
	public static SoundEvent MENUOPEN_SOUND = ofSound("music.menuopen");
	public static SoundEvent GATEOPEN_SOUND = ofSound("music.gateopen");
	public static SoundEvent GATECLOSE_SOUND = ofSound("music.gateclose");
	public static SoundEvent LUMINA_SOUND = ofSound("music.lumina");
	public static SoundEvent DESERTCLEAR_SOUND = ofSound("music.desertclear");
	public static SoundEvent DESERTCLOUDY_SOUND = ofSound("music.desertcloudy");
	public static SoundEvent DESERTNIGHTTIME_SOUND = ofSound("music.desertnighttime");
	public static SoundEvent DOLDONNA_SOUND = ofSound("music.doldonna");
	public static SoundEvent BREGEPONA_SOUND = ofSound("music.bregepona");
	public static SoundEvent TATARGANETSLUM_SOUND = ofSound("music.tatarganetslum");
	public static SoundEvent FORESTOFPAIN_SOUND = ofSound("music.forestofpain");
	public static SoundEvent ARCHEKLOENWATERFALL_SOUND = ofSound("music.archekloenwaterfall");
	public static SoundEvent BALBOLARTMUSEUM_SOUND = ofSound("music.balbolartmuseum");
	public static SoundEvent BRIONAGWYDEONTHEDRAGONBEINRANGE_SOUND = ofSound("music.brionagwydeonthedragonbeinrange");
	public static SoundEvent CITYOFDAWNARSELRAY_SOUND = ofSound("music.cityofdawnarselray");
	public static SoundEvent COITEBODHARBATTLEFIELD_SOUND = ofSound("music.coitebodharbattlefield");
	public static SoundEvent DEADWORLDOFINDIEGLUTLUGH_SOUND = ofSound("music.deadworldofindieglutlugh");
	public static SoundEvent GREATTEMPLEOFCAERLEONMEDB_SOUND = ofSound("music.greattempleofcaerleonmedb");
	public static SoundEvent HULLEGRANZCATHEDRAL_SOUND = ofSound("music.hullegranzcathedral");
	public static SoundEvent HYBRASIL_SOUND = ofSound("music.hybrasil");
	public static SoundEvent INVERTEDCITYMEGINFI_SOUND = ofSound("music.invertedcitymeginfi");
	public static SoundEvent ISLANDOFKINGSHYBRASIL_SOUND = ofSound("music.islandofkingshybrasil");
	public static SoundEvent MORRIGUBARROWWALL_SOUND = ofSound("music.morrigubarrowwall");
	public static SoundEvent SUGARMANSIONSIFBURG_SOUND = ofSound("music.sugarmansionsifburg");
	public static SoundEvent WAILINGCAPITALWALDUBERLISTERIN_SOUND = ofSound("music.wailingcapitalwalduberlisterin");
	public static SoundEvent WARP_SOUND = ofSound("music.warp");
	public static SoundEvent LIAFAIL_SOUND = ofSound("music.liafail");
	public static SoundEvent FORTOUPH_SOUND = ofSound("music.fortouph");
	public static SoundEvent MACANUR1_SOUND = ofSound("music.macanur1");
	public static SoundEvent CARMINAGADELICA_SOUND = ofSound("music.carminagadelica");
	public static SoundEvent DUNLORIAG_SOUND = ofSound("music.dunloriag");
	public static SoundEvent EPITAPHOFTHETWILIGHT_SOUND = ofSound("music.epitaphofthetwilight");
	public static SoundEvent MACANUR2_SOUND = ofSound("music.macanur2");

	static SoundEvent ofSound(String id) {
		SoundEvent sound = SoundEvent.createVariableRangeEvent(new ResourceLocation(RCraftMusicMod.MODID, id));
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation(RCraftMusicMod.MODID, id), sound);
		return sound;
	}
}
