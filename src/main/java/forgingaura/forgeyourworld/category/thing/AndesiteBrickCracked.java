package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AndesiteBrickCracked extends Block{
	
	public AndesiteBrickCracked() {
		super(Material.ROCK);
		setUnlocalizedName(MainHandler.FYWBlocks.ANDESITEBRICKCRACKED.getRegistryName());
		setRegistryName(MainHandler.FYWBlocks.ANDESITEBRICKCRACKED.getRegistryName());
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(ForgeYourWorld.THING_TAB);
	}

}
