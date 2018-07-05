package forgingaura.forgeyourworld.fdecostuff.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by AlasDiablo on 31/08/2017.
 */
public class EndStoneBrickCracked extends Block{

    public EndStoneBrickCracked(String unlocalizedName) {
        super(Material.ROCK);
        setUnlocalizedName(unlocalizedName);
        setRegistryName(unlocalizedName);
        setHardness(3.0F);
        setHarvestLevel("pickaxe", 0);
    }
}
