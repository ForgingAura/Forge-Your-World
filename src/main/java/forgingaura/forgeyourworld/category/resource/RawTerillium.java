package forgingaura.forgeyourworld.category.resource;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.item.Item;

public class RawTerillium extends Item {
	
	public RawTerillium() {
		setUnlocalizedName(MainHandler.FYWItems.RAWTERILLIUM.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.RAWTERILLIUM.getRegistryName());
		setCreativeTab(ForgeYourWorld.RESOURCE_TAB);
	}

}
