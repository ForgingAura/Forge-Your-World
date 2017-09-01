package forgingaura.forgeyourworld.category.resource;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Terillium extends Item {
	
	public Terillium() {
		setUnlocalizedName(MainHandler.FYWItems.TERILLIUM.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.TERILLIUM.getRegistryName());
		setCreativeTab(ForgeYourWorld.RESOURCE_TAB);
	}
}
