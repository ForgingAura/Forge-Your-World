package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.category.FYWSlab;
import forgingaura.forgeyourworld.handler.BlocksHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

/**
 * Created by AlasDiablo on 31/08/2017.
 */
public class SlabDoubleEndStone extends FYWSlab{

    public SlabDoubleEndStone(String name, Material materialIn) {
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
        return new ItemStack(BlocksHandler.granite_slab_half).getItem();

    }
}
