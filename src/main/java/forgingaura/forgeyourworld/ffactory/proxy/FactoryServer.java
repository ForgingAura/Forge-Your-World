package forgingaura.forgeyourworld.ffactory.proxy;

import forgingaura.forgeyourworld.FFactory;
import forgingaura.forgeyourworld.ffactory.tileentity.TileEntityIronFurnace;
import forgingaura.forgeyourworld.ffactory.tileentity.TileEntitySteampunkFurnace;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
public class FactoryServer implements FactoryCommon {

    @Override
    public void preInit() {
    }

    @Override
    public void init() {
    }

    @Override
    public void registerRenders() {

    }

    @Override
    public void registerTileEntity() {
        GameRegistry.registerTileEntity(TileEntityIronFurnace.class, FFactory.MODID + ":ironfurnace");
        GameRegistry.registerTileEntity(TileEntitySteampunkFurnace.class, FFactory.MODID + ":steampunkfurnace");
    }
}
