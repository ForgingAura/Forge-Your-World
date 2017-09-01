package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class TerilliumPickaxe extends ItemPickaxe {
	
	public TerilliumPickaxe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(MainHandler.FYWItems.TERILLIUMPICKAXE.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.TERILLIUMPICKAXE.getRegistryName());
		setCreativeTab(ForgeYourWorld.TOOL_TAB);
	}

}
