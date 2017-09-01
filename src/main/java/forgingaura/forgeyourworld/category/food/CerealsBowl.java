package forgingaura.forgeyourworld.category.food;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;

public class CerealsBowl extends ItemFood {
	
	public CerealsBowl() {
		super(8, 1.0F, false);
		setUnlocalizedName(MainHandler.FYWItems.CEREALSBOWL.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.CEREALSBOWL.getRegistryName());
		setCreativeTab(ForgeYourWorld.FOOD_TAB);
		setMaxStackSize(1);
	}

}
