package mod.azure.rcraftmusic;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class RCraftItems {

	public static final RecordItem TONE_ITEM = ofItem(new RecordItem(100, RCraftSounds.TONE_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "tone_disc");
	public static final RecordItem PRAIRIECLEARWEATHER_ITEM = ofItem(new RecordItem(101, RCraftSounds.PRAIRIECLEARWEATHER_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "prairieclearweather_disc");
	public static final RecordItem PRAIRIECLOUDY_ITEM = ofItem(new RecordItem(102, RCraftSounds.PRAIRIECLOUDY_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "prairiecloudy_disc");
	public static final RecordItem PRAIRIEEVENING_ITEM = ofItem(new RecordItem(103, RCraftSounds.PRAIRIEEVENING_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "prairieevening_disc");
	public static final RecordItem AVATARSPACE_ITEM = ofItem(new RecordItem(104, RCraftSounds.AVATARSPACE_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "avatarspace_disc");
	public static final RecordItem DESKTOP_ITEM = ofItem(new RecordItem(105, RCraftSounds.DESKTOP_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "desktop_disc");
	public static final RecordItem CASTLEDUNGEON_ITEM = ofItem(new RecordItem(106, RCraftSounds.CASTLEDUNGEON_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "castledungeon_disc");
	public static final RecordItem CAVEDUNGEON_ITEM = ofItem(new RecordItem(107, RCraftSounds.CAVEDUNGEON_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "cavedungeon_disc");
	public static final RecordItem DESERTFIELD_ITEM = ofItem(new RecordItem(108, RCraftSounds.DESERTFIELD_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "desertfield_disc");
	public static final RecordItem EARTHFIELD_ITEM = ofItem(new RecordItem(109, RCraftSounds.EARTHFIELD_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "earthfield_disc");
	public static final RecordItem FORESTFIELD_ITEM = ofItem(new RecordItem(110, RCraftSounds.FORESTFIELD_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "forestfield_disc");
	public static final RecordItem MEATWALLDUNGEON_ITEM = ofItem(new RecordItem(111, RCraftSounds.MEATWALLDUNGEON_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "meatwalldungeon_disc");
	public static final RecordItem PRAIRIERAIN_ITEM = ofItem(new RecordItem(112, RCraftSounds.PRAIRIERAIN_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "prairierain_disc");
	public static final RecordItem SCORCHINGFIELD_ITEM = ofItem(new RecordItem(113, RCraftSounds.SCORCHINGFIELD_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "scorchingfield_disc");
	public static final RecordItem SNOWFIELDNIGHTFIELD_ITEM = ofItem(new RecordItem(114, RCraftSounds.SNOWFIELDNIGHTFIELD_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "snowfieldnightfield_disc");
	public static final RecordItem STONEWALLDUNGEON_ITEM = ofItem(new RecordItem(115, RCraftSounds.STONEWALLDUNGEON_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "stonewalldungeon_disc");
	public static final RecordItem WASTELANDFIELD_ITEM = ofItem(new RecordItem(116, RCraftSounds.WASTELANDFIELD_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "wastelandfield_disc");
	public static final RecordItem WILDERNESSFIELD_ITEM = ofItem(new RecordItem(117, RCraftSounds.WILDERNESSFIELD_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "wildernessfield_disc");
	public static final RecordItem MENUOPEN_ITEM = ofItem(new RecordItem(118, RCraftSounds.MENUOPEN_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "menuopen_disc");
	public static final RecordItem GATEOPEN_ITEM = ofItem(new RecordItem(119, RCraftSounds.GATEOPEN_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "gateopen_disc");
	public static final RecordItem GATECLOSE_ITEM = ofItem(new RecordItem(120, RCraftSounds.GATECLOSE_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "gateclose_disc");
	public static final RecordItem LUMINA_ITEM = ofItem(new RecordItem(121, RCraftSounds.LUMINA_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "lumina_disc");
	public static final RecordItem DESERTCLEAR_ITEM = ofItem(new RecordItem(122, RCraftSounds.DESERTCLEAR_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "desertclear_disc");
	public static final RecordItem DESERTCLOUDY_ITEM = ofItem(new RecordItem(123, RCraftSounds.DESERTCLOUDY_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "desertcloudy_disc");
	public static final RecordItem DESERTNIGHTTIME_ITEM = ofItem(new RecordItem(124, RCraftSounds.DESERTNIGHTTIME_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "desertnighttime_disc");
	public static final RecordItem DOLDONNA_ITEM = ofItem(new RecordItem(125, RCraftSounds.DOLDONNA_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "doldonna_disc");
	public static final RecordItem BREGEPONA_ITEM = ofItem(new RecordItem(126, RCraftSounds.BREGEPONA_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "bregepona_disc");
	public static final RecordItem TATARGANETSLUM_ITEM = ofItem(new RecordItem(127, RCraftSounds.TATARGANETSLUM_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "tatarganetslum_disc");
	public static final RecordItem FORESTOFPAIN_ITEM = ofItem(new RecordItem(128, RCraftSounds.FORESTOFPAIN_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "forestofpain_disc");
	public static final RecordItem ARCHEKLOENWATERFALL_ITEM = ofItem(new RecordItem(129, RCraftSounds.ARCHEKLOENWATERFALL_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "archekloenwaterfall_disc");
	public static final RecordItem BALBOLARTMUSEUM_ITEM = ofItem(new RecordItem(130, RCraftSounds.BALBOLARTMUSEUM_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "balbolartmuseum_disc");
	public static final RecordItem BRIONAGWYDEONTHEDRAGONBEINRANGE_ITEM = ofItem(new RecordItem(131, RCraftSounds.BRIONAGWYDEONTHEDRAGONBEINRANGE_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "brionagwydeonthedragonbeinrange_disc");
	public static final RecordItem CITYOFDAWNARSELRAY_ITEM = ofItem(new RecordItem(132, RCraftSounds.CITYOFDAWNARSELRAY_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "cityofdawnarselray_disc");
	public static final RecordItem COITEBODHARBATTLEFIELD_ITEM = ofItem(new RecordItem(133, RCraftSounds.COITEBODHARBATTLEFIELD_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "coitebodharbattlefield_disc");
	public static final RecordItem DEADWORLDOFINDIEGLUTLUGH_ITEM = ofItem(new RecordItem(134, RCraftSounds.DEADWORLDOFINDIEGLUTLUGH_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "deadworldofindieglutlugh_disc");
	public static final RecordItem GREATTEMPLEOFCAERLEONMEDB_ITEM = ofItem(new RecordItem(135, RCraftSounds.GREATTEMPLEOFCAERLEONMEDB_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "greattempleofcaerleonmedb_disc");
	public static final RecordItem HULLEGRANZCATHEDRAL_ITEM = ofItem(new RecordItem(136, RCraftSounds.HULLEGRANZCATHEDRAL_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "hullegranzcathedral_disc");
	public static final RecordItem HYBRASIL_ITEM = ofItem(new RecordItem(137, RCraftSounds.HYBRASIL_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "hybrasil_disc");
	public static final RecordItem INVERTEDCITYMEGINFI_ITEM = ofItem(new RecordItem(138, RCraftSounds.INVERTEDCITYMEGINFI_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "invertedcitymeginfi_disc");
	public static final RecordItem ISLANDOFKINGSHYBRASIL_ITEM = ofItem(new RecordItem(139, RCraftSounds.ISLANDOFKINGSHYBRASIL_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "islandofkingshybrasil_disc");
	public static final RecordItem MORRIGUBARROWWALL_ITEM = ofItem(new RecordItem(140, RCraftSounds.MORRIGUBARROWWALL_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "morrigubarrowwall_disc");
	public static final RecordItem SUGARMANSIONSIFBURG_ITEM = ofItem(new RecordItem(141, RCraftSounds.SUGARMANSIONSIFBURG_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "sugarmansionsifburg_disc");
	public static final RecordItem WAILINGCAPITALWALDUBERLISTERIN_ITEM = ofItem(new RecordItem(142, RCraftSounds.WAILINGCAPITALWALDUBERLISTERIN_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "wailingcapitalwalduberlisterin_disc");
	public static final RecordItem WARP_ITEM = ofItem(new RecordItem(143, RCraftSounds.WARP_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "warp_disc");
	public static final RecordItem LIAFAIL_ITEM = ofItem(new RecordItem(144, RCraftSounds.LIAFAIL_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "liafail_disc");
	public static final RecordItem FORTOUPH_ITEM = ofItem(new RecordItem(145, RCraftSounds.FORTOUPH_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "fortouph_disc");
	public static final RecordItem MACANUR1_ITEM = ofItem(new RecordItem(146, RCraftSounds.MACANUR1_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "macanur1_disc");
	public static final RecordItem CARMINAGADELICA_ITEM = ofItem(new RecordItem(147, RCraftSounds.CARMINAGADELICA_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "carminagadelica_disc");
	public static final RecordItem DUNLORIAG_ITEM = ofItem(new RecordItem(148, RCraftSounds.DUNLORIAG_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "dunloriag_disc");
	public static final RecordItem EPITAPHOFTHETWILIGHT_ITEM = ofItem(new RecordItem(149, RCraftSounds.EPITAPHOFTHETWILIGHT_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "epitaphofthetwilight_disc");
	public static final RecordItem MACANUR2_ITEM = ofItem(new RecordItem(150, RCraftSounds.MACANUR2_SOUND, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60), "macanur2_disc");

	static <T extends Item> T ofItem(T c, String id) {
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(RCraftMusicMod.MODID, id), c);
		return c;
	}
}
