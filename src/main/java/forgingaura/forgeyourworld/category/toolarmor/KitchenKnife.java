package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.ItemsHandler;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class KitchenKnife extends ItemSword {
	
	public KitchenKnife(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(MainHandler.FYWItems.KITCHENKNIFE.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.KITCHENKNIFE.getRegistryName());
		setCreativeTab(ForgeYourWorld.TOOL_TAB);
		setContainerItem(ItemsHandler.kitchenknife);
	}

}
