package forgingaura.forgeyourworld.ffoods.item;

import forgingaura.forgeyourworld.FFoods;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;

public class Toast extends ItemFood {
	
	public Toast(String unlocalizedName) {
		super(2, 0.3F, false);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(FFoods.MODID, unlocalizedName));
	}

}
