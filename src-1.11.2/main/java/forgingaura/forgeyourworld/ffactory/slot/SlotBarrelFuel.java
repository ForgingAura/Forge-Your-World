package forgingaura.forgeyourworld.ffactory.slot;

import forgingaura.forgeyourworld.ffactory.tileentity.TileEntityBarrel;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotBarrelFuel extends Slot{
    public SlotBarrelFuel(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return TileEntityBarrel.isItemFuel(stack);
    }

    @Override
    public int getItemStackLimit(ItemStack stack) {
        return super.getItemStackLimit(stack);
    }
}
