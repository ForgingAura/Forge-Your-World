package forgingaura.forgeyourworld.farmory;

import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by AlasDiablo on 30/10/2017.
 */
public class ArmoryTab extends CreativeTabs{

    public ArmoryTab() {
        super("tabArmory");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(ResourceBlock.blazecoalblock));
    }
}
