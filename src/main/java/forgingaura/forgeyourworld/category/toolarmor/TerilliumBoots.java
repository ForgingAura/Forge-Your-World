package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class TerilliumBoots extends ItemArmor{

	public TerilliumBoots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(MainHandler.FYWItems.TERILLIUMBOOTS.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.TERILLIUMBOOTS.getRegistryName());
		setCreativeTab(ForgeYourWorld.TOOL_TAB);
	}

}
