package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by AlasDiablo on 31/08/2017.
 */
public class EndStoneBrickCarved extends Block{

    public EndStoneBrickCarved() {
        super(Material.ROCK);
        setUnlocalizedName(MainHandler.FYWBlocks.ENDSTONEBRICKCARVED.getRegistryName());
        setRegistryName(MainHandler.FYWBlocks.ENDSTONEBRICKCARVED.getRegistryName());
        setHardness(3.0F);
        setHarvestLevel("pickaxe", 0);
        setCreativeTab(ForgeYourWorld.THING_TAB);
    }
}
