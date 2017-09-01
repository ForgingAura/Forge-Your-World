package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class TerilliumChestPlate extends ItemArmor {
	
	public TerilliumChestPlate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(MainHandler.FYWItems.TERILLIUMCHESTPLATE.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.TERILLIUMCHESTPLATE.getRegistryName());
		setCreativeTab(ForgeYourWorld.TOOL_TAB);
	}

}
