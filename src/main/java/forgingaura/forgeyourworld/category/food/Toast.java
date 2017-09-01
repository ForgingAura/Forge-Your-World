package forgingaura.forgeyourworld.category.food;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.item.ItemFood;

public class Toast extends ItemFood {
	
	public Toast() {
		super(2, 0.3F, false);
		setUnlocalizedName(MainHandler.FYWItems.TOAST.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.TOAST.getRegistryName());
		setCreativeTab(ForgeYourWorld.FOOD_TAB);
	}

}
