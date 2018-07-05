package forgingaura.forgeyourworld.fdecostuff.block;

import forgingaura.forgeyourworld.fdecostuff.init.DecoStuffBlock;
import forgingaura.forgeyourworld.util.UtilsSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

/**
 * Created by Mami Sabeth on 13/08/2017.
 */
public class SlabDoubleAndesite extends UtilsSlab{

    public SlabDoubleAndesite(String name, Material materialIn) {
        super(name, materialIn);
    }

    @Override
    public boolean isDouble() {
        return true;
    }

    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
        return 2;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return new ItemStack(DecoStuffBlock.andesite_slab_half).getItem();

    }
}
