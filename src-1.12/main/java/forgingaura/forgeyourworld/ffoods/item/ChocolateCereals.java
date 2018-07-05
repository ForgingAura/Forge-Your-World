package forgingaura.forgeyourworld.ffoods.item;

import forgingaura.forgeyourworld.FFoods;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;

public class ChocolateCereals extends ItemFood {
	
	public ChocolateCereals(String unlocalizedName) {
		super(5, 0.7F, false);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(FFoods.MODID, unlocalizedName));
	}

}
