package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class TerilliumShovel extends ItemSpade {
	
	public TerilliumShovel(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(MainHandler.FYWItems.TERILLIUMSHOVEL.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.TERILLIUMSHOVEL.getRegistryName());
		setCreativeTab(ForgeYourWorld.TOOL_TAB);
	}

}
