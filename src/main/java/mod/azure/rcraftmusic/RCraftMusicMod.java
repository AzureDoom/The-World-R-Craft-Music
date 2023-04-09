package mod.azure.rcraftmusic;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RCraftMusicMod implements ModInitializer {

	public static final String MODID = "rcraftmusic";
	public static RCraftItems ITEMS;
	public static RCraftSounds SOUNDS;

	public static final CreativeModeTab RcraftItemGroup = FabricItemGroup.builder(new ResourceLocation(MODID, "rcraftmusic")).icon(() -> new ItemStack(RCraftItems.TONE_ITEM)).displayItems((context, entries) -> {
		entries.accept(RCraftItems.TONE_ITEM);
		entries.accept(RCraftItems.PRAIRIECLEARWEATHER_ITEM);
		entries.accept(RCraftItems.PRAIRIECLOUDY_ITEM);
		entries.accept(RCraftItems.PRAIRIEEVENING_ITEM);
		entries.accept(RCraftItems.AVATARSPACE_ITEM);
		entries.accept(RCraftItems.DESKTOP_ITEM);
		entries.accept(RCraftItems.CASTLEDUNGEON_ITEM);
		entries.accept(RCraftItems.CAVEDUNGEON_ITEM);
		entries.accept(RCraftItems.DESERTFIELD_ITEM);
		entries.accept(RCraftItems.EARTHFIELD_ITEM);
		entries.accept(RCraftItems.FORESTFIELD_ITEM);
		entries.accept(RCraftItems.MEATWALLDUNGEON_ITEM);
		entries.accept(RCraftItems.PRAIRIERAIN_ITEM);
		entries.accept(RCraftItems.SCORCHINGFIELD_ITEM);
		entries.accept(RCraftItems.SNOWFIELDNIGHTFIELD_ITEM);
		entries.accept(RCraftItems.STONEWALLDUNGEON_ITEM);
		entries.accept(RCraftItems.WASTELANDFIELD_ITEM);
		entries.accept(RCraftItems.WILDERNESSFIELD_ITEM);
		entries.accept(RCraftItems.MENUOPEN_ITEM);
		entries.accept(RCraftItems.GATEOPEN_ITEM);
		entries.accept(RCraftItems.GATECLOSE_ITEM);
		entries.accept(RCraftItems.LUMINA_ITEM);
		entries.accept(RCraftItems.DESERTCLEAR_ITEM);
		entries.accept(RCraftItems.DESERTCLOUDY_ITEM);
		entries.accept(RCraftItems.DESERTNIGHTTIME_ITEM);
		entries.accept(RCraftItems.DOLDONNA_ITEM);
		entries.accept(RCraftItems.BREGEPONA_ITEM);
		entries.accept(RCraftItems.TATARGANETSLUM_ITEM);
		entries.accept(RCraftItems.FORESTOFPAIN_ITEM);
		entries.accept(RCraftItems.ARCHEKLOENWATERFALL_ITEM);
		entries.accept(RCraftItems.BALBOLARTMUSEUM_ITEM);
		entries.accept(RCraftItems.BRIONAGWYDEONTHEDRAGONBEINRANGE_ITEM);
		entries.accept(RCraftItems.CITYOFDAWNARSELRAY_ITEM);
		entries.accept(RCraftItems.COITEBODHARBATTLEFIELD_ITEM);
		entries.accept(RCraftItems.DEADWORLDOFINDIEGLUTLUGH_ITEM);
		entries.accept(RCraftItems.GREATTEMPLEOFCAERLEONMEDB_ITEM);
		entries.accept(RCraftItems.HULLEGRANZCATHEDRAL_ITEM);
		entries.accept(RCraftItems.HYBRASIL_ITEM);
		entries.accept(RCraftItems.INVERTEDCITYMEGINFI_ITEM);
		entries.accept(RCraftItems.ISLANDOFKINGSHYBRASIL_ITEM);
		entries.accept(RCraftItems.MORRIGUBARROWWALL_ITEM);
		entries.accept(RCraftItems.SUGARMANSIONSIFBURG_ITEM);
		entries.accept(RCraftItems.WAILINGCAPITALWALDUBERLISTERIN_ITEM);
		entries.accept(RCraftItems.WARP_ITEM);
		entries.accept(RCraftItems.LIAFAIL_ITEM);
		entries.accept(RCraftItems.FORTOUPH_ITEM);
		entries.accept(RCraftItems.MACANUR1_ITEM);
		entries.accept(RCraftItems.CARMINAGADELICA_ITEM);
		entries.accept(RCraftItems.DUNLORIAG_ITEM);
		entries.accept(RCraftItems.EPITAPHOFTHETWILIGHT_ITEM);
		entries.accept(RCraftItems.MACANUR2_ITEM);
	}).build();

	@Override
	public void onInitialize() {
		ITEMS = new RCraftItems();
		SOUNDS = new RCraftSounds();
	}
}