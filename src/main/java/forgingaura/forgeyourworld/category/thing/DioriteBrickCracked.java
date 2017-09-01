package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

/**
 * Created by Mami Sabeth on 13/08/2017.
 */
public class DioriteBrickCracked extends Block{

    public DioriteBrickCracked() {
        super(Material.ROCK);
        setUnlocalizedName(MainHandler.FYWBlocks.DIORITEBRICKCRACKED.getRegistryName());
        setRegistryName(MainHandler.FYWBlocks.DIORITEBRICKCRACKED.getRegistryName());
        setHardness(3.0F);
        setHarvestLevel("pickaxe", 0);
        setCreativeTab(ForgeYourWorld.THING_TAB);
    }
}
