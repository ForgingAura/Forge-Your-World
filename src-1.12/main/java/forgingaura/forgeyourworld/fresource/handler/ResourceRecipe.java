package forgingaura.forgeyourworld.fresource.handler;

import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ResourceRecipe {

    public static void register() {
        GameRegistry.addSmelting(ResourceBlock.blazecoalore, new ItemStack(ResourceItem.blazecoal, 1), 0.2F);
        GameRegistry.addSmelting(ResourceBlock.terilliumore, new ItemStack(ResourceItem.terillium, 1), 0.5F);
        GameRegistry.addSmelting(ResourceBlock.enderiumore, new ItemStack(ResourceItem.enderiumingot, 1), 0.8F);

        GameRegistry.addSmelting(ResourceBlock.copperore, new ItemStack(ResourceItem.copperingot, 1), 0.2F);
        GameRegistry.addSmelting(ResourceBlock.tinore, new ItemStack(ResourceItem.tiningot, 1), 0.2F);

    }
}
