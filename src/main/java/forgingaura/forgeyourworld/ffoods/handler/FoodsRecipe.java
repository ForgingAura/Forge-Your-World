package forgingaura.forgeyourworld.ffoods.handler;

import forgingaura.forgeyourworld.ffoods.init.FoodsItem;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
public class FoodsRecipe {


    public static void register() {

        GameRegistry.addSmelting(Items.BREAD, new ItemStack(FoodsItem.toast, 4), 0.1F);

    }
}
