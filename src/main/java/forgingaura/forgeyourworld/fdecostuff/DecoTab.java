package forgingaura.forgeyourworld.fdecostuff;

import forgingaura.forgeyourworld.fdecostuff.init.DecoStuffBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
public class DecoTab extends CreativeTabs{

    public DecoTab() {
        super("tabDeco");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(DecoStuffBlock.endstone_slab_half));
    }
}
