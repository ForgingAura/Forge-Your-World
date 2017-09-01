package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.handler.ItemsHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ToolArmorTab extends CreativeTabs{

	public ToolArmorTab() {
		super("tabToolArmor");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemsHandler.terilliumchestplate);
	}

}
