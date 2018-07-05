package forgingaura.forgeyourworld.fmagic.item;

import forgingaura.forgeyourworld.FMagic;
import forgingaura.forgeyourworld.FResource;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
public class WitherFragment extends Item {

    public WitherFragment(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FMagic.MODID, unlocalizedName));
    }
}
