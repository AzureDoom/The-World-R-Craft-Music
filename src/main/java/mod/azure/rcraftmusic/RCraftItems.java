package mod.azure.rcraftmusic;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RCraftItems {

	public static final RCraftRecordItem TONE_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.TONE_SOUND), "tone_disc");
	public static final RCraftRecordItem PRAIRIECLEARWEATHER_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.PRAIRIECLEARWEATHER_SOUND), "prairieclearweather_disc");
	public static final RCraftRecordItem PRAIRIECLOUDY_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.PRAIRIECLOUDY_SOUND), "prairiecloudy_disc");
	public static final RCraftRecordItem PRAIRIEEVENING_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.PRAIRIEEVENING_SOUND), "prairieevening_disc");
	public static final RCraftRecordItem AVATARSPACE_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.AVATARSPACE_SOUND), "avatarspace_disc");
	public static final RCraftRecordItem DESKTOP_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.DESKTOP_SOUND), "desktop_disc");
	public static final RCraftRecordItem CASTLEDUNGEON_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.CASTLEDUNGEON_SOUND), "castledungeon_disc");
	public static final RCraftRecordItem CAVEDUNGEON_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.CAVEDUNGEON_SOUND), "cavedungeon_disc");
	public static final RCraftRecordItem DESERTFIELD_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.DESERTFIELD_SOUND), "desertfield_disc");
	public static final RCraftRecordItem EARTHFIELD_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.EARTHFIELD_SOUND), "earthfield_disc");
	public static final RCraftRecordItem FORESTFIELD_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.FORESTFIELD_SOUND), "forestfield_disc");
	public static final RCraftRecordItem MEATWALLDUNGEON_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.MEATWALLDUNGEON_SOUND), "meatwalldungeon_disc");
	public static final RCraftRecordItem PRAIRIERAIN_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.PRAIRIERAIN_SOUND), "prairierain_disc");
	public static final RCraftRecordItem SCORCHINGFIELD_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.SCORCHINGFIELD_SOUND), "scorchingfield_disc");
	public static final RCraftRecordItem SNOWFIELDNIGHTFIELD_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.SNOWFIELDNIGHTFIELD_SOUND), "snowfieldnightfield_disc");
	public static final RCraftRecordItem STONEWALLDUNGEON_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.STONEWALLDUNGEON_SOUND), "stonewalldungeon_disc");
	public static final RCraftRecordItem WASTELANDFIELD_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.WASTELANDFIELD_SOUND), "wastelandfield_disc");
	public static final RCraftRecordItem WILDERNESSFIELD_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.WILDERNESSFIELD_SOUND), "wildernessfield_disc");
	public static final RCraftRecordItem MENUOPEN_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.MENUOPEN_SOUND), "menuopen_disc");
	public static final RCraftRecordItem GATEOPEN_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.GATEOPEN_SOUND), "gateopen_disc");
	public static final RCraftRecordItem GATECLOSE_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.GATECLOSE_SOUND), "gateclose_disc");
	public static final RCraftRecordItem LUMINA_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.LUMINA_SOUND), "lumina_disc");
	public static final RCraftRecordItem DESERTCLEAR_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.DESERTCLEAR_SOUND), "desertclear_disc");
	public static final RCraftRecordItem DESERTCLOUDY_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.DESERTCLOUDY_SOUND), "desertcloudy_disc");
	public static final RCraftRecordItem DESERTNIGHTTIME_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.DESERTNIGHTTIME_SOUND), "desertnighttime_disc");
	public static final RCraftRecordItem DOLDONNA_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.DOLDONNA_SOUND), "doldonna_disc");
	public static final RCraftRecordItem BREGEPONA_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.BREGEPONA_SOUND), "bregepona_disc");
	public static final RCraftRecordItem TATARGANETSLUM_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.TATARGANETSLUM_SOUND), "tatarganetslum_disc");
	public static final RCraftRecordItem FORESTOFPAIN_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.FORESTOFPAIN_SOUND), "forestofpain_disc");
	public static final RCraftRecordItem ARCHEKLOENWATERFALL_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.ARCHEKLOENWATERFALL_SOUND), "archekloenwaterfall_disc");
	public static final RCraftRecordItem BALBOLARTMUSEUM_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.BALBOLARTMUSEUM_SOUND), "balbolartmuseum_disc");
	public static final RCraftRecordItem BRIONAGWYDEONTHEDRAGONBEINRANGE_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.BRIONAGWYDEONTHEDRAGONBEINRANGE_SOUND), "brionagwydeonthedragonbeinrange_disc");
	public static final RCraftRecordItem CITYOFDAWNARSELRAY_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.CITYOFDAWNARSELRAY_SOUND), "cityofdawnarselray_disc");
	public static final RCraftRecordItem COITEBODHARBATTLEFIELD_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.COITEBODHARBATTLEFIELD_SOUND), "coitebodharbattlefield_disc");
	public static final RCraftRecordItem DEADWORLDOFINDIEGLUTLUGH_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.DEADWORLDOFINDIEGLUTLUGH_SOUND), "deadworldofindieglutlugh_disc");
	public static final RCraftRecordItem GREATTEMPLEOFCAERLEONMEDB_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.GREATTEMPLEOFCAERLEONMEDB_SOUND), "greattempleofcaerleonmedb_disc");
	public static final RCraftRecordItem HULLEGRANZCATHEDRAL_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.HULLEGRANZCATHEDRAL_SOUND), "hullegranzcathedral_disc");
	public static final RCraftRecordItem HYBRASIL_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.HYBRASIL_SOUND), "hybrasil_disc");
	public static final RCraftRecordItem INVERTEDCITYMEGINFI_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.INVERTEDCITYMEGINFI_SOUND), "invertedcitymeginfi_disc");
	public static final RCraftRecordItem ISLANDOFKINGSHYBRASIL_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.ISLANDOFKINGSHYBRASIL_SOUND), "islandofkingshybrasil_disc");
	public static final RCraftRecordItem MORRIGUBARROWWALL_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.MORRIGUBARROWWALL_SOUND), "morrigubarrowwall_disc");
	public static final RCraftRecordItem SUGARMANSIONSIFBURG_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.SUGARMANSIONSIFBURG_SOUND), "sugarmansionsifburg_disc");
	public static final RCraftRecordItem WAILINGCAPITALWALDUBERLISTERIN_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.WAILINGCAPITALWALDUBERLISTERIN_SOUND), "wailingcapitalwalduberlisterin_disc");
	public static final RCraftRecordItem WARP_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.WARP_SOUND), "warp_disc");
	public static final RCraftRecordItem LIAFAIL_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.LIAFAIL_SOUND), "liafail_disc");
	public static final RCraftRecordItem FORTOUPH_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.FORTOUPH_SOUND), "fortouph_disc");
	public static final RCraftRecordItem MACANUR1_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.MACANUR1_SOUND), "macanur1_disc");
	public static final RCraftRecordItem CARMINAGADELICA_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.CARMINAGADELICA_SOUND), "carminagadelica_disc");
	public static final RCraftRecordItem DUNLORIAG_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.DUNLORIAG_SOUND), "dunloriag_disc");
	public static final RCraftRecordItem EPITAPHOFTHETWILIGHT_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.EPITAPHOFTHETWILIGHT_SOUND), "epitaphofthetwilight_disc");
	public static final RCraftRecordItem MACANUR2_ITEM = ofItem(new RCraftRecordItem(RCraftSounds.MACANUR2_SOUND), "macanur2_disc");

	static <T extends Item> T ofItem(T c, String id) {
		Registry.register(Registries.ITEM, new Identifier(RCraftMusicMod.MODID, id), c);
		return c;
	}
}
