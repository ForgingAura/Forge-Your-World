package forgingaura.forgeyourworld.category.resource;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlazeCoalBlock extends Block {

	public BlazeCoalBlock() {
		super(Material.IRON);
		setUnlocalizedName(MainHandler.FYWBlocks.BLAZECOALBLOCK.getRegistryName());
		setRegistryName(MainHandler.FYWBlocks.BLAZECOALBLOCK.getRegistryName());
		setHardness(4.0F);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(ForgeYourWorld.RESOURCE_TAB);
	}
	
}
