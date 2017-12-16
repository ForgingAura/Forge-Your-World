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

/**
 * Created by Alas on 16/12/2017.
 */
public class RedDiamondArmor extends ItemArmor{

    public RedDiamondArmor(ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String unlocalizedName) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FArmory.MODID, unlocalizedName));
    }

    int postionResetTime;
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if(ArmoryConfig.elementary_multi != -1) {
            player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 100, ArmoryConfig.elementary_multi));
            if(postionResetTime == 250) {
                player.addPotionEffect(new PotionEffect(Potion.getPotionById(22), 100, ArmoryConfig.elementary_multi));
                postionResetTime = 0;
            }
            postionResetTime++;
        }
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        if (net.minecraftforge.oredict.OreDictionary.itemMatches(new ItemStack(ResourceItem.terillium), repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
}
