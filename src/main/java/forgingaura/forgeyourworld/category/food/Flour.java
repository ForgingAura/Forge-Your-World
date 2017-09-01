package forgingaura.forgeyourworld.category.food;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.item.Item;

public class Flour extends Item{
	
	public Flour() {
		setUnlocalizedName(MainHandler.FYWItems.FLOUR.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.FLOUR.getRegistryName());
		setCreativeTab(ForgeYourWorld.FOOD_TAB);
	}

}
