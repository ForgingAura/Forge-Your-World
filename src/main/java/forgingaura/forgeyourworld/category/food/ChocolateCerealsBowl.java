package forgingaura.forgeyourworld.category.food;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;

public class ChocolateCerealsBowl extends ItemFood {
	
	public ChocolateCerealsBowl() {
		super(8, 1.0F, false);
		setUnlocalizedName(MainHandler.FYWItems.CHOCOLATECEREALSBOWL.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.CHOCOLATECEREALSBOWL.getRegistryName());
		setCreativeTab(ForgeYourWorld.FOOD_TAB);
		setMaxStackSize(1);
	}

}
