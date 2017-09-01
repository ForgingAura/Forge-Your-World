package forgingaura.forgeyourworld.category.thing;


import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Mami Sabeth on 11/07/2017.
 */
public class DioriteBrickCarved extends Block{

    public DioriteBrickCarved() {
        super(Material.ROCK);
        setUnlocalizedName(MainHandler.FYWBlocks.DIORITEBRICKCARVED.getRegistryName());
        setRegistryName(MainHandler.FYWBlocks.DIORITEBRICKCARVED.getRegistryName());
        setHardness(3.0F);
        setHarvestLevel("pickaxe", 0);
        setCreativeTab(ForgeYourWorld.THING_TAB);
    }
}
