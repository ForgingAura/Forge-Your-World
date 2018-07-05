package forgingaura.forgeyourworld.fmagic.handler;

import forgingaura.forgeyourworld.fmagic.init.MagicItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class MagicGrassDrop {

    public static void registerMagicGrassDrop() {
        MinecraftForge.addGrassSeed(new ItemStack(MagicItem.witherseed), 1);

    }
}
