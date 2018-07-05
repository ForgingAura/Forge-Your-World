package forgingaura.forgeyourworld.ffoods;

import forgingaura.forgeyourworld.ffoods.init.FoodsBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by AlasDiablo on 10/11/2017.
 */
public class FoodsTab extends CreativeTabs {

    public FoodsTab() {
        super("tabFoods");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(FoodsBlock.applejamjar));
    }
}
