package forgingaura.forgeyourworld.fresource.item;

import forgingaura.forgeyourworld.FResource;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class BlazeCoal extends Item{
	
	public BlazeCoal(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(FResource.MODID, unlocalizedName));
	}

}
