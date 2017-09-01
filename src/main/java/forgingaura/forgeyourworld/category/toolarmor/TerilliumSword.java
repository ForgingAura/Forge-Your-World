package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class TerilliumSword extends ItemSword{
	
	public TerilliumSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(MainHandler.FYWItems.TERILLIUMSWORD.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.TERILLIUMSWORD.getRegistryName());
		setCreativeTab(ForgeYourWorld.TOOL_TAB);
	}
	
	

}
