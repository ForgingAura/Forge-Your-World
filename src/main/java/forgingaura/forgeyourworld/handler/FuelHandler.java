package forgingaura.forgeyourworld.handler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		
		Block blockFuel = Block.getBlockFromItem(fuel.getItem());
		Item itemFuel = fuel.getItem();

		if (blockFuel == BlocksHandler.blazecoalblock) {
			return 36000;
		} else if (itemFuel == ItemsHandler.blazecoal) {
			return 4000;
		} else {
			return 0;
		}
	}

}
