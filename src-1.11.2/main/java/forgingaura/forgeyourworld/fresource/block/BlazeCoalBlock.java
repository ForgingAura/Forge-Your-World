package forgingaura.forgeyourworld.fresource.block;


import forgingaura.forgeyourworld.FResource;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlazeCoalBlock extends Block {

	public BlazeCoalBlock(String unlocalizedName) {
		super(Material.IRON);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(FResource.MODID, unlocalizedName));
		this.setHardness(4.0F);
		this.setHarvestLevel("pickaxe", 0);
	}
	
}
