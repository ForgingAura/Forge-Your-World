package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by AlasDiablo on 30/08/2017.
 */
public class GraniteBrickCracked extends Block{

    public GraniteBrickCracked() {
        super(Material.ROCK);
        setUnlocalizedName(MainHandler.FYWBlocks.GRANITEBRICKCRACKED.getRegistryName());
        setRegistryName(MainHandler.FYWBlocks.GRANITEBRICKCRACKED.getRegistryName());
        setHardness(3.0F);
        setHarvestLevel("pickaxe", 0);
        setCreativeTab(ForgeYourWorld.THING_TAB);
    }
}
