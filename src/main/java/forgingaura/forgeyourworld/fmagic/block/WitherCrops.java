package forgingaura.forgeyourworld.fmagic.block;

import forgingaura.forgeyourworld.FMagic;
import forgingaura.forgeyourworld.fmagic.init.MagicItem;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
public class WitherCrops extends BlockCrops{

    public WitherCrops(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FMagic.MODID, unlocalizedName));

    }

    @Override
    protected Item getSeed() {
        return MagicItem.witherseed;
    }

    @Override
    protected Item getCrop() {
        ItemStack stackcrop= new ItemStack(Items.SKULL, 1, 1);
        Item crop = stackcrop.getItem();
        return crop;
    }
}
