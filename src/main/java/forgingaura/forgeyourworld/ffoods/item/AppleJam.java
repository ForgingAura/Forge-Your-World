package forgingaura.forgeyourworld.ffoods.item;

import forgingaura.forgeyourworld.FFoods;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;

public class AppleJam extends ItemFood {

	public AppleJam(String unlocalizedName) {
		super(5, 0.4F, false);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(FFoods.MODID, unlocalizedName));
		setContainerItem(Items.GLASS_BOTTLE);
	}

}
