package forgingaura.forgeyourworld.ffoods.item;

import forgingaura.forgeyourworld.FFoods;
import forgingaura.forgeyourworld.ffoods.init.FoodsItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Beer extends ItemFood {

    public Beer(String unlocalizedName) {
        super(2, 0.6F, false);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FFoods.MODID, unlocalizedName));
        this.setMaxStackSize(8);
    }

    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;
    }

    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        player.addItemStackToInventory(new ItemStack(FoodsItem.beermug));
    }
}
