package forgingaura.forgeyourworld.fdecostuff.init;

import forgingaura.forgeyourworld.FDecoStuff;
import forgingaura.forgeyourworld.fdecostuff.block.*;
import forgingaura.forgeyourworld.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
public class DecoStuffBlock {

    public static final BlockSlab endstone_slab_half = new SlabHalf("endstone_slab_half", Material.ROCK);
    public static final BlockSlab endstone_slab_double = new SlabDoubleEndStone("endstone_slab_double", Material.ROCK);
    public static Block endstonebrickcarved;
    public static Block endstonebrickcracked;
    public static Block endstonebrickmossy;
    public static final BlockSlab andesite_slab_half = new SlabHalf("andesite_slab_half", Material.ROCK);
    public static final BlockSlab andesite_slab_double = new SlabDoubleAndesite("andesite_slab_double", Material.ROCK);
    public static Block andesitebrick;
    public static Block andesitebrickcarved;
    public static Block andesitebrickcracked;
    public static Block andesitebrickmossy;
    public static final BlockSlab diorite_slab_half = new SlabHalf("diorite_slab_half", Material.ROCK);
    public static final BlockSlab diorite_slab_double = new SlabDoubleDiorite("diorite_slab_double", Material.ROCK);
    public static Block dioritebrick;
    public static Block dioritebrickcarved;
    public static Block dioritebrickcracked;
    public static Block dioritebrickmossy;
    public static final BlockSlab granite_slab_half = new SlabHalf("granite_slab_half", Material.ROCK);
    public static final BlockSlab granite_slab_double = new SlabDoubleGranite("granite_slab_double", Material.ROCK);
    public static Block granitebrick;
    public static Block granitebrickcarved;
    public static Block granitebrickcracked;
    public static Block granitebrickmossy;

    public static void init() {
        endstonebrickcarved = new EndStoneBrickCarved("endstonebrickcarved");
        endstonebrickcracked = new EndStoneBrickCracked("endstonebrickcracked");
        endstonebrickmossy = new EndStoneBrickMossy("endstonebrickmossy");
        andesitebrick = new AndesiteBrick("andesitebrick");
        andesitebrickcarved = new AndesiteBrickCarved("andesitebrickcarved");
        andesitebrickcracked = new AndesiteBrickCracked("andesitebrickcracked");
        andesitebrickmossy = new AndesiteBrickMossy("andesitebrickmossy");
        dioritebrick = new DioriteBrick("dioritebrick");
        dioritebrickcarved = new DioriteBrickCarved("dioritebrickcarved");
        dioritebrickcracked = new DioriteBrickCracked("dioritebrickcracked");
        dioritebrickmossy = new DioriteBrickMossy("dioritebrickmossy");
        granitebrick = new GraniteBrick("granitebrick");
        granitebrickcarved = new GraniteBrickCarved("granitebrickcarved");
        granitebrickcracked = new GraniteBrickCracked("granitebrickcracked");
        granitebrickmossy = new GraniteBrickMossy("granitebrickmossy");

    }

    public static void register() {
        registerSlabHalf(endstone_slab_half, new ItemSlab(endstone_slab_half, endstone_slab_half, endstone_slab_double));
        registerSlabDouble(endstone_slab_double);
        registerBlock(endstonebrickcarved);
        registerBlock(endstonebrickcracked);
        registerBlock(endstonebrickmossy);
        registerSlabHalf(andesite_slab_half, new ItemSlab(andesite_slab_half, andesite_slab_half, andesite_slab_double));
        registerSlabDouble(andesite_slab_double);
        registerBlock(andesitebrick);
        registerBlock(andesitebrickcarved);
        registerBlock(andesitebrickcracked);
        registerBlock(andesitebrickmossy);
        registerSlabHalf(diorite_slab_half, new ItemSlab(diorite_slab_half, diorite_slab_half, diorite_slab_double));
        registerSlabDouble(diorite_slab_double);
        registerBlock(dioritebrick);
        registerBlock(dioritebrickcarved);
        registerBlock(dioritebrickcracked);
        registerBlock(dioritebrickmossy);
        registerSlabHalf(granite_slab_half, new ItemSlab(granite_slab_half, granite_slab_half, granite_slab_double));
        registerSlabDouble(granite_slab_double);
        registerBlock(granitebrick);
        registerBlock(granitebrickcarved);
        registerBlock(granitebrickcracked);
        registerBlock(granitebrickmossy);

    }

    public static void registerRenders() {
        registerRender(endstone_slab_half);
        registerRender(endstone_slab_double);
        registerRender(endstonebrickcarved);
        registerRender(endstonebrickcracked);
        registerRender(endstonebrickmossy);
        registerRender(andesitebrick);
        registerRender(andesitebrickcarved);
        registerRender(andesitebrickcracked);
        registerRender(andesitebrickmossy);
        registerRender(andesite_slab_half);
        registerRender(andesite_slab_double);
        registerRender(dioritebrick);
        registerRender(dioritebrickcarved);
        registerRender(dioritebrickcracked);
        registerRender(dioritebrickcracked);
        registerRender(dioritebrickmossy);
        registerRender(diorite_slab_half);
        registerRender(diorite_slab_double);
        registerRender(granitebrick);
        registerRender(granitebrickcarved);
        registerRender(granitebrickcracked);
        registerRender(granitebrickmossy);
        registerRender(granite_slab_half);
        registerRender(granite_slab_double);

    }

    public static void registerBlock(Block block) {
        block.setCreativeTab(FDecoStuff.DECOSTUFF_TAB);
        GameRegistry.findRegistry(Block.class).register(block);
        GameRegistry.findRegistry(Item.class).register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        Utils.getLogger().info("Registered block: " + block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(
                new ResourceLocation(FDecoStuff.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
        Utils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
    }

    private static void registerSlabHalf(Block slab, ItemSlab itemSlab){
        slab.setCreativeTab(FDecoStuff.DECOSTUFF_TAB);
        GameRegistry.findRegistry(Block.class).register(slab);
        itemSlab.setRegistryName(slab.getRegistryName());
        GameRegistry.findRegistry(Item.class).register(itemSlab);
    }

    public static void registerSlabDouble(Block block) {
        GameRegistry.findRegistry(Block.class).register(block);
        GameRegistry.findRegistry(Item.class).register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        Utils.getLogger().info("Registered block: " + block.getUnlocalizedName().substring(5));
    }
}
