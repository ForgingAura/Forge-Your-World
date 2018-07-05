package forgingaura.forgeyourworld.ffoods.handler;

import forgingaura.forgeyourworld.ffoods.init.FoodsItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class FoodsGrassDrop {

    public static void registerFoodsGrassDrop() {
        MinecraftForge.addGrassSeed(new ItemStack(FoodsItem.barleyseed), 8);

    }
}
