package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by AlasDiablo on 30/08/2017.
 */
public class GraniteBrickMossy extends Block{

    public GraniteBrickMossy() {
        super(Material.ROCK);
        setUnlocalizedName(MainHandler.FYWBlocks.GRANITEBRICKMOSSY.getRegistryName());
        setRegistryName(MainHandler.FYWBlocks.GRANITEBRICKMOSSY.getRegistryName());
        setHardness(3.0F);
        setHarvestLevel("pickaxe", 0);
        setCreativeTab(ForgeYourWorld.THING_TAB);
    }
}
