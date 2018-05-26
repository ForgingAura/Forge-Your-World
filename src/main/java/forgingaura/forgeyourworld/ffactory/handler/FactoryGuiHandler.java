package forgingaura.forgeyourworld.ffactory.handler;

import forgingaura.forgeyourworld.FFactory;
import forgingaura.forgeyourworld.ffactory.Container.ContainerBarrel;
import forgingaura.forgeyourworld.ffactory.Container.ContainerSteampunkFurnace;
import forgingaura.forgeyourworld.ffactory.gui.GuiBarrel;
import forgingaura.forgeyourworld.ffactory.gui.GuiSteampunkFurnace;
import forgingaura.forgeyourworld.ffactory.tileentity.TileEntityBarrel;
import forgingaura.forgeyourworld.ffactory.tileentity.TileEntitySteampunkFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class FactoryGuiHandler implements IGuiHandler {
    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == FFactory.GUI_BARREL) return new ContainerBarrel(player.inventory, (TileEntityBarrel) world.getTileEntity(new BlockPos(x, y, z)));
        //if (ID == FFactory.GUI_STEAMPUNK_FURNACE) return new ContainerSteampunkFurnace(player.inventory, (TileEntitySteampunkFurnace) world.getTileEntity(new BlockPos(x, y, z)));
        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == FFactory.GUI_BARREL) return new GuiBarrel(player.inventory, (TileEntityBarrel) world.getTileEntity(new BlockPos(x, y, z)));
        //if (ID == FFactory.GUI_STEAMPUNK_FURNACE) return new GuiSteampunkFurnace(player.inventory, (TileEntitySteampunkFurnace) world.getTileEntity(new BlockPos(x, y, z)));
        return null;
    }
}
