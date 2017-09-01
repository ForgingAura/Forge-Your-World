package forgingaura.forgeyourworld.category.food;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;

public class ChocolateCereals extends ItemFood {
	
	public ChocolateCereals() {
		super(5, 0.7F, false);
		setUnlocalizedName(MainHandler.FYWItems.CHOCOLATECEREALS.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.CHOCOLATECEREALS.getRegistryName());
		setCreativeTab(ForgeYourWorld.FOOD_TAB);
	}

}
