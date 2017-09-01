package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AndesiteBrick extends Block{
	
	public AndesiteBrick() {
		super(Material.ROCK);
		setUnlocalizedName(MainHandler.FYWBlocks.ANDESITEBRICK.getRegistryName());
		setRegistryName(MainHandler.FYWBlocks.ANDESITEBRICK.getRegistryName());
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(ForgeYourWorld.THING_TAB);
	}

}
