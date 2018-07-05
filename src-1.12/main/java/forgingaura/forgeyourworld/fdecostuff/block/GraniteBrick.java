package forgingaura.forgeyourworld.fdecostuff.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by AlasDiablo on 30/08/2017.
 */
public class GraniteBrick extends Block {

    public GraniteBrick(String unlocalizedName) {
        super(Material.ROCK);
        setUnlocalizedName(unlocalizedName);
        setRegistryName(unlocalizedName);
        setHardness(3.0F);
        setHarvestLevel("pickaxe", 0);
    }
}
