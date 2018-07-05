package forgingaura.forgeyourworld.farmory.item;

import forgingaura.forgeyourworld.FArmory;
import forgingaura.forgeyourworld.farmory.ArmoryConfig;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

public class RedDiamondSword extends ItemSword {

    public RedDiamondSword(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FArmory.MODID, unlocalizedName));
        this.canRepair = true;
    }

    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
        if(ArmoryConfig.elementary_multi != 255) {
            par2EntityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(20), 50, 3 * ArmoryConfig.elementary_multi));
            par2EntityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 50, 3 * ArmoryConfig.elementary_multi));
            par2EntityLiving.setFire(4 * ArmoryConfig.elementary_multi);
        }
        return super.hitEntity(par1ItemStack, par2EntityLiving, par3EntityLiving);
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        if (net.minecraftforge.oredict.OreDictionary.itemMatches(new ItemStack(ResourceItem.reddiamond), repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
}
