package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by AlasDiablo on 05/07/2017.
 */
public class DioriteBrick extends Block{

    public DioriteBrick() {
        super(Material.ROCK);
        setUnlocalizedName(MainHandler.FYWBlocks.DIORITEBRICK.getRegistryName());
        setRegistryName(MainHandler.FYWBlocks.DIORITEBRICK.getRegistryName());
        setHardness(3.0F);
        setHarvestLevel("pickaxe", 0);
        setCreativeTab(ForgeYourWorld.THING_TAB);
    }
}
