package forgingaura.forgeyourworld.category.food;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.item.ItemFood;

public class AppleToast extends ItemFood {
	
	public AppleToast() {
		super(7, 0.7F, false);
		setUnlocalizedName(MainHandler.FYWItems.APPLETOAST.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.APPLETOAST.getRegistryName());
		setCreativeTab(ForgeYourWorld.FOOD_TAB);
	}

}
