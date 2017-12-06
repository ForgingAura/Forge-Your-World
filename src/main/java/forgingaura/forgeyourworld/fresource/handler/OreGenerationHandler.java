package forgingaura.forgeyourworld.fresource.handler;

import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;


/**
 * Created by AlasDiablo on 30/10/2017.
 */
public class OreGenerationHandler implements IWorldGenerator{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        switch (world.provider.getDimensionType()) {

            case OVERWORLD:
                generateSurface(world, random, chunkX*16, chunkZ*16);

            case NETHER:
                generateNether(world, random, chunkX*16, chunkZ*16);

            case THE_END:
                generateEnd(world, random, chunkX*16, chunkZ*16);

        }

    }

    private void generateEnd(World world, Random random, int x, int z) {
        generateOre(ResourceBlock.enderiumore.getDefaultState(), world, random, x, z, 1, 80, 4, 64, BlockMatcher.forBlock(Blocks.END_STONE));
    }

    private void generateSurface(World world, Random random, int x, int z) {
        //generateOre(ModsBlocks.BlockOre.getDefaultState(), world, random, x, z, valeur minY, valeur maxY, valuer maxVienSize, valeur chances, BlockMatcher.forBlock(Block Remplacer));
        generateOre(ResourceBlock.terilliumore.getDefaultState(), world, random, x, z, 4, 20, 4, 8, BlockMatcher.forBlock(Blocks.STONE));
    }

    private void generateNether(World world, Random random, int x, int z) {
        generateOre(ResourceBlock.blazecoalore.getDefaultState(), world, random, x, z, 4, 127, 16, 64, BlockMatcher.forBlock(Blocks.NETHERRACK));
        generateOre(ResourceBlock.reddiamondore.getDefaultState(), world, random, x, z, 4, 127, 4, 16, BlockMatcher.forBlock(Blocks.NETHERRACK));
    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int maxVeinSize, int chances, BlockMatcher blockChanging) {
        int deltaY = maxY - minY;
        int vienSize = random.nextInt(maxVeinSize + 1);

        for (int i = 0; i < chances; i++) {
            BlockPos pos = new BlockPos( x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, vienSize, blockChanging);
            generator.generate(world, random, pos);
        }
    }
}
