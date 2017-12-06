package forgingaura.forgeyourworld.farmory.item;

import forgingaura.forgeyourworld.FArmory;
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
}
