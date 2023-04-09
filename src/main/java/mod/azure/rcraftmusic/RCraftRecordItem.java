package mod.azure.rcraftmusic;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class RCraftRecordItem extends RecordItem {

	public RCraftRecordItem(SoundEvent soundSupplier) {
		super(1, soundSupplier, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 60);
	}

	@Override
	public boolean isFoil(ItemStack stack) {
		return false;
	}

	@Override
	public Rarity getRarity(ItemStack stack) {
		return Rarity.EPIC;
	}

}