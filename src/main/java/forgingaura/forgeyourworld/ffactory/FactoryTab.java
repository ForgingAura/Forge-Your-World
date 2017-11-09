package forgingaura.forgeyourworld.ffactory;

import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
public class FactoryTab extends CreativeTabs{

    public FactoryTab() {
        super("tabFactory");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(ResourceBlock.blazecoalblock));
    }
}
