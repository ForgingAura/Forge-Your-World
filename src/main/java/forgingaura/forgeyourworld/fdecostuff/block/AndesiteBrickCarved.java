package forgingaura.forgeyourworld.fdecostuff.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AndesiteBrickCarved extends Block{
	
	public AndesiteBrickCarved(String unlocalizedName) {
		super(Material.ROCK);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(unlocalizedName);
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 0);
	}

}
