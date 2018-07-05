package forgingaura.forgeyourworld.ffoods.item;

import forgingaura.forgeyourworld.FFoods;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.ResourceLocation;

public class BarleySeed extends ItemSeeds {

    public BarleySeed(Block crops, Block soil, String unlocalizedName) {
        super(crops, soil);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FFoods.MODID, unlocalizedName));
    }
}
