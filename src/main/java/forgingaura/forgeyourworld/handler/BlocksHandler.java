package forgingaura.forgeyourworld.handler;

import forgingaura.forgeyourworld.category.food.AppleJamJar;
import forgingaura.forgeyourworld.category.resource.BlazeCoalBlock;
import forgingaura.forgeyourworld.category.resource.BlazeCoalOre;
import forgingaura.forgeyourworld.category.resource.EnderiumOre;
import forgingaura.forgeyourworld.category.resource.TerilliumOre;
import forgingaura.forgeyourworld.category.thing.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlocksHandler {
	
	public static Block terilliumore;
	public static Block applejamjar;
	public static Block blazecoalblock;
	public static Block blazecoalore;
	public static Block enderiumore;
	public static Block andesitebrick;
	public static Block andesitebrickcarved;
	public static Block andesitebrickcracked;
	public static Block andesitebrickmossy;
	public static final BlockSlab andesite_slab_half = new SlabHalf("andesite_slab_half", Material.ROCK);
	public static final BlockSlab andesite_slab_double = new SlabDoubleAndesite("andesite_slab_double", Material.ROCK);
	public static Block dioritebrick;
	public static Block dioritebrickcarved;
	public static Block dioritebrickcracked;
	public static Block dioritebrickmossy;
	public static final BlockSlab diorite_slab_half = new SlabHalf("diorite_slab_half", Material.ROCK);
	public static final BlockSlab diorite_slab_double = new SlabDoubleDiorite("diorite_slab_double", Material.ROCK);
	public static Block granitebrick;
	public static Block granitebrickcarved;
	public static Block granitebrickcracked;
	public static Block granitebrickmossy;
	public static final BlockSlab granite_slab_half = new SlabHalf("granite_slab_half", Material.ROCK);
	public static final BlockSlab granite_slab_double = new SlabDoubleGranite("granite_slab_double", Material.ROCK);
	public static Block endstonebrickcarved;
	public static Block endstonebrickcracked;
	public static Block endstonebrickmossy;
	public static final BlockSlab endstone_slab_half = new SlabHalf("endstone_slab_half", Material.ROCK);
	public static final BlockSlab endstone_slab_double = new SlabDoubleEndStone("endstone_slab_double", Material.ROCK);

	public static void init() {
		terilliumore = new TerilliumOre();
		applejamjar = new AppleJamJar();
		blazecoalblock = new BlazeCoalBlock();
		blazecoalore = new BlazeCoalOre();
		enderiumore = new EnderiumOre();
		andesitebrick = new AndesiteBrick();
		andesitebrickcarved = new AndesiteBrickCarved();
		andesitebrickcracked = new AndesiteBrickCracked();
		andesitebrickmossy = new AndesiteBrickMossy();
		dioritebrick = new DioriteBrick();
		dioritebrickcarved = new DioriteBrickCarved();
		dioritebrickcracked = new DioriteBrickCracked();
		dioritebrickmossy = new DioriteBrickMossy();
		granitebrick = new GraniteBrick();
		granitebrickcarved = new GraniteBrickCarved();
		granitebrickcracked = new GraniteBrickCracked();
		granitebrickmossy = new GraniteBrickMossy();
		endstonebrickcarved = new EndStoneBrickCarved();
		endstonebrickcracked = new EndStoneBrickCracked();
		endstonebrickmossy = new EndStoneBrickMossy();
	}

	public static void register(){
		registerBlock(terilliumore);
		registerBlock(applejamjar);
		registerBlock(blazecoalblock);
		registerBlock(blazecoalore);
		registerBlock(enderiumore);
		registerBlock(andesitebrick);
		registerBlock(andesitebrickcarved);
		registerBlock(andesitebrickcracked);
		registerBlock(andesitebrickmossy);
		registerSlabHalf(andesite_slab_half, new ItemSlab(andesite_slab_half, andesite_slab_half, andesite_slab_double));
        registerBlock(andesite_slab_double);
        registerBlock(dioritebrick);
        registerBlock(dioritebrickcarved);
        registerBlock(dioritebrickcracked);
        registerBlock(dioritebrickmossy);
        registerSlabHalf(diorite_slab_half, new ItemSlab(diorite_slab_half, diorite_slab_half, diorite_slab_double));
        registerBlock(diorite_slab_double);
        registerBlock(granitebrick);
        registerBlock(granitebrickcarved);
        registerBlock(granitebrickcracked);
        registerBlock(granitebrickmossy);
        registerSlabHalf(granite_slab_half, new ItemSlab(granite_slab_half, granite_slab_half, granite_slab_double));
        registerBlock(granite_slab_double);
        registerBlock(endstonebrickcarved);
        registerBlock(endstonebrickcracked);
        registerBlock(endstonebrickmossy);
        registerSlabHalf(endstone_slab_half, new ItemSlab(endstone_slab_half, endstone_slab_half, endstone_slab_double));
        registerBlock(endstone_slab_double);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.findRegistry(Block.class).register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.findRegistry(Item.class).register(item);
	}

	private static void registerSlabHalf(Block slab, ItemSlab itemSlab){

		GameRegistry.findRegistry(Block.class).register(slab);
		itemSlab.setRegistryName(slab.getRegistryName());
		GameRegistry.findRegistry(Item.class).register(itemSlab);
	}
	public static void registerRenders() {
		registerRender(terilliumore);
		registerRender(applejamjar);
		registerRender(blazecoalblock);
		registerRender(blazecoalore);
		registerRender(enderiumore);
		registerRender(andesitebrick);
		registerRender(andesitebrickcarved);
		registerRender(andesitebrickcracked);
		registerRender(andesitebrickmossy);
		registerRender(andesite_slab_half);
		registerRender(dioritebrick);
		registerRender(dioritebrickcarved);
		registerRender(dioritebrickcracked);
		registerRender(dioritebrickcracked);
		registerRender(dioritebrickmossy);
		registerRender(diorite_slab_half);
		registerRender(granitebrick);
		registerRender(granitebrickcarved);
		registerRender(granitebrickcracked);
		registerRender(granitebrickmossy);
		registerRender(granite_slab_half);
		registerRender(endstonebrickcarved);
		registerRender(endstonebrickcracked);
		registerRender(endstonebrickmossy);
		registerRender(endstone_slab_half);
		registerRender(andesite_slab_double);
		registerRender(diorite_slab_double);
		registerRender(granite_slab_double);
		registerRender(endstone_slab_double);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
