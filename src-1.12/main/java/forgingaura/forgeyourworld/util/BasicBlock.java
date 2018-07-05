package forgingaura.forgeyourworld.util;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BasicBlock extends Block {

    public BasicBlock(Material blockMaterialIn, String unlocalizedName, int HarvestLevel, String ModID) {
        super(blockMaterialIn);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(ModID, unlocalizedName));
        this.setHarvestLevel("pickaxe", HarvestLevel);
    }
}
