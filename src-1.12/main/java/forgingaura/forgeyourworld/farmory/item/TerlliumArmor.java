package forgingaura.forgeyourworld.farmory.item;

import forgingaura.forgeyourworld.FArmory;
import forgingaura.forgeyourworld.farmory.ArmoryConfig;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class TerlliumArmor extends ItemArmor {

    public TerlliumArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String unlocalizedName) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FArmory.MODID, unlocalizedName));
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if(ArmoryConfig.elementary_multi != 255) {
            player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 100, ArmoryConfig.elementary_multi));
        }
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        if (net.minecraftforge.oredict.OreDictionary.itemMatches(new ItemStack(ResourceItem.terillium), repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }

}
