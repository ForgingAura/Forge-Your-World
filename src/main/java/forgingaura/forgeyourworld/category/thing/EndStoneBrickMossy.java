package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by AlasDiablo on 31/08/2017.
 */
public class EndStoneBrickMossy extends Block{

    public EndStoneBrickMossy() {
        super(Material.ROCK);
        setUnlocalizedName(MainHandler.FYWBlocks.ENDSTONEBRICKMOSSY.getRegistryName());
        setRegistryName(MainHandler.FYWBlocks.ENDSTONEBRICKMOSSY.getRegistryName());
        setHardness(3.0F);
        setHarvestLevel("pickaxe", 0);
        setCreativeTab(ForgeYourWorld.THING_TAB);
    }
}
