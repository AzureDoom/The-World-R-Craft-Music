package mod.azure.rcraftmusic;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RCraftMusicMod implements ModInitializer {

	public static final String MODID = "rcraftmusic";
	public static RCraftItems ITEMS;
	public static RCraftSounds SOUNDS;
	
	public static final ItemGroup RcraftItemGroup = FabricItemGroup.builder(new Identifier(MODID, "rcraftmusic"))
		    .icon(() -> new ItemStack(RCraftItems.TONE_ITEM))
		    .entries((enabledFeatures, entries, operatorEnabled) -> {
		        entries.add(RCraftItems.TONE_ITEM);
		        entries.add(RCraftItems.PRAIRIECLEARWEATHER_ITEM);
		        entries.add(RCraftItems.PRAIRIECLOUDY_ITEM);
		        entries.add(RCraftItems.PRAIRIEEVENING_ITEM);
		        entries.add(RCraftItems.AVATARSPACE_ITEM);
		        entries.add(RCraftItems.DESKTOP_ITEM);
		        entries.add(RCraftItems.CASTLEDUNGEON_ITEM);
		        entries.add(RCraftItems.CAVEDUNGEON_ITEM);
		        entries.add(RCraftItems.DESERTFIELD_ITEM);
		        entries.add(RCraftItems.EARTHFIELD_ITEM);
		        entries.add(RCraftItems.FORESTFIELD_ITEM);
		        entries.add(RCraftItems.MEATWALLDUNGEON_ITEM);
		        entries.add(RCraftItems.PRAIRIERAIN_ITEM);
		        entries.add(RCraftItems.SCORCHINGFIELD_ITEM);
		        entries.add(RCraftItems.SNOWFIELDNIGHTFIELD_ITEM);
		        entries.add(RCraftItems.STONEWALLDUNGEON_ITEM);
		        entries.add(RCraftItems.WASTELANDFIELD_ITEM);
		        entries.add(RCraftItems.WILDERNESSFIELD_ITEM);
		        entries.add(RCraftItems.MENUOPEN_ITEM);
		        entries.add(RCraftItems.GATEOPEN_ITEM);
		        entries.add(RCraftItems.GATECLOSE_ITEM);
		        entries.add(RCraftItems.LUMINA_ITEM);
		        entries.add(RCraftItems.DESERTCLEAR_ITEM);
		        entries.add(RCraftItems.DESERTCLOUDY_ITEM);
		        entries.add(RCraftItems.DESERTNIGHTTIME_ITEM);
		        entries.add(RCraftItems.DOLDONNA_ITEM);
		        entries.add(RCraftItems.BREGEPONA_ITEM);
		        entries.add(RCraftItems.TATARGANETSLUM_ITEM);
		        entries.add(RCraftItems.FORESTOFPAIN_ITEM);
		        entries.add(RCraftItems.ARCHEKLOENWATERFALL_ITEM);
		        entries.add(RCraftItems.BALBOLARTMUSEUM_ITEM);
		        entries.add(RCraftItems.BRIONAGWYDEONTHEDRAGONBEINRANGE_ITEM);
		        entries.add(RCraftItems.CITYOFDAWNARSELRAY_ITEM);
		        entries.add(RCraftItems.COITEBODHARBATTLEFIELD_ITEM);
		        entries.add(RCraftItems.DEADWORLDOFINDIEGLUTLUGH_ITEM);
		        entries.add(RCraftItems.GREATTEMPLEOFCAERLEONMEDB_ITEM);
		        entries.add(RCraftItems.HULLEGRANZCATHEDRAL_ITEM);
		        entries.add(RCraftItems.HYBRASIL_ITEM);
		        entries.add(RCraftItems.INVERTEDCITYMEGINFI_ITEM);
		        entries.add(RCraftItems.ISLANDOFKINGSHYBRASIL_ITEM);
		        entries.add(RCraftItems.MORRIGUBARROWWALL_ITEM);
		        entries.add(RCraftItems.SUGARMANSIONSIFBURG_ITEM);
		        entries.add(RCraftItems.WAILINGCAPITALWALDUBERLISTERIN_ITEM);
		        entries.add(RCraftItems.WARP_ITEM);
		        entries.add(RCraftItems.LIAFAIL_ITEM);
		        entries.add(RCraftItems.FORTOUPH_ITEM);
		        entries.add(RCraftItems.MACANUR1_ITEM);
		        entries.add(RCraftItems.CARMINAGADELICA_ITEM);
		        entries.add(RCraftItems.DUNLORIAG_ITEM);
		        entries.add(RCraftItems.EPITAPHOFTHETWILIGHT_ITEM);
		        entries.add(RCraftItems.MACANUR2_ITEM);
		    })
		    .build();

	@Override
	public void onInitialize() {
		ITEMS = new RCraftItems();
		SOUNDS = new RCraftSounds();
	}
}