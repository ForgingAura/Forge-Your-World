package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class TerilliumLeggings extends ItemArmor {

	public TerilliumLeggings(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(MainHandler.FYWItems.TERILLIUMLEGGINGS.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.TERILLIUMLEGGINGS.getRegistryName());
		setCreativeTab(ForgeYourWorld.TOOL_TAB);
	}

}
