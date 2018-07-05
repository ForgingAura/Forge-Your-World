package forgingaura.forgeyourworld.ffoods.item;

import forgingaura.forgeyourworld.FFoods;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;

public class CerealsBowl extends ItemFood {
	
	public CerealsBowl(String unlocalizedName) {
		super(8, 1.0F, false);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(FFoods.MODID, unlocalizedName));
		setMaxStackSize(1);
	}

}
