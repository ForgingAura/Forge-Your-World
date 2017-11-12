package forgingaura.forgeyourworld.fresource.handler;

import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

/**
 * Created by AlasDiablo on 12/11/2017.
 */
public class FuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel) {

        Block blockFuel = Block.getBlockFromItem(fuel.getItem());
        Item itemFuel = fuel.getItem();

        if (blockFuel == ResourceBlock.blazecoalblock) {
            return 36000;
        } else if (itemFuel == ResourceItem.blazecoal) {
            return 4000;
        } else {
            return 0;
        }
    }
}
