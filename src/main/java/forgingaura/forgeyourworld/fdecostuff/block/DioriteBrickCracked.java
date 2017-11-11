package forgingaura.forgeyourworld.fdecostuff.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

/**
 * Created by Mami Sabeth on 13/08/2017.
 */
public class DioriteBrickCracked extends Block{

    public DioriteBrickCracked(String unlocalizedName) {
        super(Material.ROCK);
        setUnlocalizedName(unlocalizedName);
        setRegistryName(unlocalizedName);
        setHardness(3.0F);
        setHarvestLevel("pickaxe", 0);
    }
}
