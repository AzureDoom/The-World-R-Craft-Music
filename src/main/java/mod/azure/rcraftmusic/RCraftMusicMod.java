package mod.azure.rcraftmusic;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RCraftMusicMod implements ModInitializer {

	public static final String MODID = "rcraftmusic";
	public static RCraftItems ITEMS;
	public static RCraftSounds SOUNDS;

	public static final ItemGroup RcraftItemGroup = FabricItemGroupBuilder.create(new Identifier(MODID, "rcraftmusic"))
			.icon(() -> new ItemStack(RCraftItems.TONE_ITEM)).build();

	@Override
	public void onInitialize() {
		ITEMS = new RCraftItems();
		SOUNDS = new RCraftSounds();
	}
}