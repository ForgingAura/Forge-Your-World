package forgingaura.forgeyourworld.fdecostuff;

import forgingaura.forgeyourworld.fdecostuff.init.DecoStuffBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
public class DecoStuffTab extends CreativeTabs{

    public DecoStuffTab() {
        super("tabDecoStuff");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(DecoStuffBlock.endstone_slab_half));
    }
}
