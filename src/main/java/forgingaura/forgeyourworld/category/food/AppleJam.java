package forgingaura.forgeyourworld.category.food;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AppleJam extends ItemFood {

	public AppleJam() {
		super(5, 0.4F, false);
		setUnlocalizedName(MainHandler.FYWItems.APPLEJAM.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.APPLEJAM.getRegistryName());
		setCreativeTab(ForgeYourWorld.FOOD_TAB);
		setContainerItem(Items.GLASS_BOTTLE);
	}
	
	//public class EatEvent {
	//	
	//	@SubscribeEvent
	//	public void onPlayerUseItem(LivingEntityUseItemEvent event) {
	//		
	//		if(event.item.getItem() == inititems.applejam) {
	//			event.entityPlayer.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE, 1));
	//		}
	//	}
	//}

}
