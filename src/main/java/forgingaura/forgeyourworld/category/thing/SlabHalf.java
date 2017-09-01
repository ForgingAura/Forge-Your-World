package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.category.FYWSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SlabHalf extends FYWSlab{
	
	public SlabHalf(String name, Material materialIn) {
        super(name, materialIn);

        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setCreativeTab(ForgeYourWorld.THING_TAB);

    }

    @Override
    public boolean isDouble() {
        return false;
    }
}
