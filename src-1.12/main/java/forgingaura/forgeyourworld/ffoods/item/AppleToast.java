package forgingaura.forgeyourworld.ffoods.item;

import forgingaura.forgeyourworld.FFoods;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;

public class AppleToast extends ItemFood {
	
	public AppleToast(String unlocalizedName) {
		super(7, 0.7F, false);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(FFoods.MODID, unlocalizedName));
	}

}
