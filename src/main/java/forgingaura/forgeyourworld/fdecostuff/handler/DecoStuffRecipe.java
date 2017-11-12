package forgingaura.forgeyourworld.fdecostuff.handler;

import forgingaura.forgeyourworld.fdecostuff.init.DecoStuffBlock;
import forgingaura.forgeyourworld.ffoods.init.FoodsItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 12/11/2017.
 */
public class DecoStuffRecipe {

    public static void register() {
        GameRegistry.addSmelting(Blocks.END_BRICKS, new ItemStack(DecoStuffBlock.endstonebrickcracked, 1), 0.1F);
        GameRegistry.addSmelting(DecoStuffBlock.andesitebrick, new ItemStack(DecoStuffBlock.andesitebrickcracked, 1), 0.1F);
        GameRegistry.addSmelting(DecoStuffBlock.dioritebrick, new ItemStack(DecoStuffBlock.dioritebrickcracked, 1), 0.1F);
        GameRegistry.addSmelting(DecoStuffBlock.granitebrick, new ItemStack(DecoStuffBlock.granitebrickcracked, 1), 0.1F);

    }
}
