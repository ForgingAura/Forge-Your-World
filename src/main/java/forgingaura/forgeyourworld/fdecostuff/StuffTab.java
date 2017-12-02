package forgingaura.forgeyourworld.fdecostuff;

import forgingaura.forgeyourworld.fdecostuff.init.DecoStuffBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class StuffTab extends CreativeTabs {

    public StuffTab() {
        super("tabStuff");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(Blocks.DIRT));
    }
}
