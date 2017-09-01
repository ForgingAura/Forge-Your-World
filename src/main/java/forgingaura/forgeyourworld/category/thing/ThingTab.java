package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.handler.BlocksHandler;
import forgingaura.forgeyourworld.handler.ItemsHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ThingTab extends CreativeTabs {

	public ThingTab() {
		super("tabThings");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(BlocksHandler.andesitebrick);
	}

}
