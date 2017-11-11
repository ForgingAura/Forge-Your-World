package forgingaura.forgeyourworld.fdecostuff.block;

import forgingaura.forgeyourworld.util.UtilsSlab;
import net.minecraft.block.material.Material;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
public class SlabHalf extends UtilsSlab {

    public SlabHalf(String unlocalizedName, Material materialIn) {
        super(unlocalizedName, materialIn);
    }

    @Override
    public boolean isDouble() {
        return false;
    }
}
