package forgingaura.forgeyourworld.category.resource;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.item.Item;

public class BlazeCoal extends Item{
	
	public BlazeCoal() {
	setUnlocalizedName(MainHandler.FYWItems.BLAZECOAL.getUnlocalizedName());
	setRegistryName(MainHandler.FYWItems.BLAZECOAL.getRegistryName());
	setCreativeTab(ForgeYourWorld.RESOURCE_TAB);
	}

}
