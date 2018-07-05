package forgingaura.forgeyourworld.fmagic.item;

import forgingaura.forgeyourworld.FMagic;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.ResourceLocation;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
public class WitherSeed extends ItemSeeds {

    public WitherSeed(Block crops, Block soil, String unlocalizedName) {
        super(crops, soil);
        setUnlocalizedName(unlocalizedName);
        setRegistryName(new ResourceLocation(FMagic.MODID, unlocalizedName));
    }
}
