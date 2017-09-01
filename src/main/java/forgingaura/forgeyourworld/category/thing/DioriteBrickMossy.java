package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Mami Sabeth on 13/08/2017.
 */
public class DioriteBrickMossy extends Block {

    public DioriteBrickMossy() {
        super(Material.ROCK);
        setUnlocalizedName(MainHandler.FYWBlocks.DIORITEBRICKMOSSY.getRegistryName());
        setRegistryName(MainHandler.FYWBlocks.DIORITEBRICKMOSSY.getRegistryName());
        setHardness(3.0F);
        setHarvestLevel("pickaxe", 0);
        setCreativeTab(ForgeYourWorld.THING_TAB);
    }
}
