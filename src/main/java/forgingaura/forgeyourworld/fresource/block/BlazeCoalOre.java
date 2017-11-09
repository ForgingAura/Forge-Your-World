package forgingaura.forgeyourworld.fresource.block;


import forgingaura.forgeyourworld.FResource;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlazeCoalOre extends Block {

	public BlazeCoalOre(String unlocalizedName) {
		super(Material.IRON);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(FResource.MODID, unlocalizedName));
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 2);
	}
	/*
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return 1;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return new ItemStack(ItemsHandler.blazecoal).getItem();
	}
*/
}
