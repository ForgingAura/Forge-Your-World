package forgingaura.forgeyourworld.ffoods.block;

import forgingaura.forgeyourworld.FFoods;
import forgingaura.forgeyourworld.ffoods.init.FoodsItem;
import forgingaura.forgeyourworld.fmagic.init.MagicItem;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class BarleyCrops extends BlockCrops {

    public BarleyCrops(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FFoods.MODID, unlocalizedName));

    }

    @Override
    protected Item getSeed() {
        return FoodsItem.barleyseed;
    }

    @Override
    protected Item getCrop() {
        ItemStack stackcrop= new ItemStack(FoodsItem.barley);
        Item crop = stackcrop.getItem();
        return crop;
    }
}
