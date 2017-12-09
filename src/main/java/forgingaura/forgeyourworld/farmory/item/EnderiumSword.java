package forgingaura.forgeyourworld.farmory.item;

import forgingaura.forgeyourworld.FArmory;
import forgingaura.forgeyourworld.farmory.init.ArmoryItem;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

public class EnderiumSword extends ItemSword {

    public EnderiumSword(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FArmory.MODID, unlocalizedName));
        this.canRepair = true;
    }

    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
        par2EntityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(18), 100,1));
        par2EntityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(25), 15,3));
        par2EntityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(24), 25,3));
        return super.hitEntity(par1ItemStack, par2EntityLiving, par3EntityLiving);
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        if (net.minecraftforge.oredict.OreDictionary.itemMatches(new ItemStack(ResourceItem.enderiumingot), repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
}
