package mod.azure.rcraftmusic;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Rarity;

public class RCraftRecordItem extends MusicDiscItem {

	public RCraftRecordItem(SoundEvent soundSupplier) {
		super(1, soundSupplier,
				(new Item.Settings()).maxCount(1).rarity(Rarity.RARE), 60);
	}

	@Override
	public boolean hasGlint(ItemStack stack) {
		return false;
	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		return Rarity.EPIC;
	}

}