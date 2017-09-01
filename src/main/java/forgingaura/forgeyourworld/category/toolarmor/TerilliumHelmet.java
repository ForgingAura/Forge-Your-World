package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class TerilliumHelmet extends ItemArmor {

	public TerilliumHelmet(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(MainHandler.FYWItems.TERILLIUMHELMET.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.TERILLIUMHELMET.getRegistryName());
		setCreativeTab(ForgeYourWorld.TOOL_TAB);
	}

}
