package forgingaura.forgeyourworld.fresource.block;

import forgingaura.forgeyourworld.FResource;
import forgingaura.forgeyourworld.fresource.ResourceUtils;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class TerilliumOre extends Block {

	public TerilliumOre(String unlocalizedName) {
		super(Material.IRON);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(FResource.MODID, unlocalizedName));
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.1F);
	}
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return ResourceUtils.Fortuneitemhandler(fortune, 1);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return new ItemStack(ResourceItem.rawterillium).getItem();
	}

	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		return ResourceUtils.Fortunexphandler(fortune, 4);
	}
}
