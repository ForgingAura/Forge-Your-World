package forgingaura.forgeyourworld.fmagic;

import forgingaura.forgeyourworld.fmagic.init.MagicItem;
import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
public class MagicTab extends CreativeTabs {

    public MagicTab() {
        super("tabMagic");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(MagicItem.witherfragment);
    }
}
