package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AndesiteBrickMossy extends Block{
	
	public AndesiteBrickMossy() {
		super(Material.ROCK);
		setUnlocalizedName(MainHandler.FYWBlocks.ANDESITEBRICKMOSSY.getRegistryName());
		setRegistryName(MainHandler.FYWBlocks.ANDESITEBRICKMOSSY.getRegistryName());
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(ForgeYourWorld.THING_TAB);
	}

}
