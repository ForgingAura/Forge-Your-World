package forgingaura.forgeyourworld.category.food;

import forgingaura.forgeyourworld.handler.ItemsHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FoodTab extends CreativeTabs{
	
	public FoodTab() {
		super("tabFood");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemsHandler.toast);
	}

}
