package forgingaura.forgeyourworld.ffoods.item;

import forgingaura.forgeyourworld.FFoods;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class Flour extends Item{
	
	public Flour(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(FFoods.MODID, unlocalizedName));
	}

}
