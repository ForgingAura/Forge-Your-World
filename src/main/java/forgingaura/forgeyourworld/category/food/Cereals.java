package forgingaura.forgeyourworld.category.food;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;

public class Cereals extends ItemFood {
	
	public Cereals() {
		super(5, 0.5F, false);
		setUnlocalizedName(MainHandler.FYWItems.CEREALS.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.CEREALS.getRegistryName());
		setCreativeTab(ForgeYourWorld.FOOD_TAB);
	}

}
