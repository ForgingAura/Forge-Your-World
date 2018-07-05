package forgingaura.forgeyourworld.fresource;

import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
public class ResourceTab extends CreativeTabs {

    public ResourceTab() {
        super("tabResource");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(ResourceBlock.blazecoalblock));
    }

}
