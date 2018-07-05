package forgingaura.forgeyourworld.fresource.block;

import forgingaura.forgeyourworld.FResource;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BasicBlockOre extends Block{

    public BasicBlockOre(Material blockMaterialIn, String unlocalizedName, int HarvestLevel, float Hardness, float LightLevel) {
        super(blockMaterialIn);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FResource.MODID, unlocalizedName));
        this.setHardness(Hardness);
        this.setHarvestLevel("pickaxe", HarvestLevel);
        this.setLightLevel(LightLevel);
    }
}
