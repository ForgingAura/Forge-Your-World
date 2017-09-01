package forgingaura.forgeyourworld.category.resource;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class EnderiumOre extends Block{
	
	public EnderiumOre() {
		super(Material.IRON);
		setUnlocalizedName(MainHandler.FYWBlocks.ENDERIUMORE.getRegistryName());
		setRegistryName(MainHandler.FYWBlocks.ENDERIUMORE.getRegistryName());
		setHardness(4.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(ForgeYourWorld.RESOURCE_TAB);
	}

}
