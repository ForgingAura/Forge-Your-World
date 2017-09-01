package forgingaura.forgeyourworld.category.resource;

import forgingaura.forgeyourworld.handler.ItemsHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ResouceTab extends CreativeTabs{
	
	public ResouceTab() {
		super("tabResource");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemsHandler.rawterillium);
	}

}
