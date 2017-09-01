package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class TerilliumHoe extends ItemHoe {
	
	public TerilliumHoe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(MainHandler.FYWItems.TERILLIUMHOE.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.TERILLIUMHOE.getRegistryName());
		setCreativeTab(ForgeYourWorld.TOOL_TAB);
	}

}
