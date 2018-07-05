package forgingaura.forgeyourworld.fresource.event;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSkull;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerSkull {

    @SubscribeEvent
    public void onLivingDeathEvent(LivingDeathEvent event) {

        if(event.getEntityLiving() instanceof EntityPlayer){

            // On créer 2 NBTTagCompound pour ensuite ajouter le 2ème au 1er

            NBTTagCompound compound = new NBTTagCompound();

            NBTTagCompound compound1 = new NBTTagCompound();

            Item item = Items.SKULL;

            ItemStack stack = new ItemStack(item, 1, 3);

            ((ItemSkull)item).updateItemStackNBT(compound1);

            EntityPlayer player = (EntityPlayer)event.getEntityLiving(); // Ou EntityPlayerMP

            //ItemStack stack = new ItemStack(compound1);

            stack.setTagCompound(compound1);

            stack.writeToNBT(compound);

            compound1.setString("SkullOwner", player.getName());

            compound.setTag("tag", compound1);

            player.world.spawnEntity(new EntityItem(player.world, player.posX, player.posY, player.posZ, stack));

        }

    }
}
