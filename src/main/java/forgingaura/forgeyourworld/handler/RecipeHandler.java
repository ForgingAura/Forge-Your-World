package forgingaura.forgeyourworld.handler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {

	public static void register() {
		/*
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsHandler.flour), new Object[] { Items.STICK, Items.WHEAT });

		BUG GameRegistry.addShapedRecipe(new ItemStack(ItemsHandler.toast, 4), "K", "B", 'K', ItemsHandler.kitchenknife.setContainerItem(ItemsHandler.kitchenknife), 'B', Items.BREAD);
		*/
		GameRegistry.addSmelting(new ItemStack(ItemsHandler.flour, 4), new ItemStack(Items.BREAD), 1);
		/*
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsHandler.applejam), new Object[] { Items.APPLE, Items.SUGAR, Items.GLASS_BOTTLE });

		GameRegistry.addShapelessRecipe(new ItemStack(ItemsHandler.appletoast), new Object[] { ItemsHandler.applejam, ItemsHandler.toast });

		GameRegistry.addShapedRecipe(new ItemStack(BlocksHandler.applejamjar), "AAA", "AGA", "AAA", 'G', Blocks.GLASS, 'A', ItemsHandler.applejam);

		GameRegistry.addShapedRecipe(new ItemStack(ItemsHandler.terillium), " G ", "RTR", " G ", 'G', Items.GLOWSTONE_DUST, 'R', Items.REDSTONE, 'T', ItemsHandler.rawterillium);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsHandler.appletoast, 8),  "TTT", "TJT", "TTT", 'T', ItemsHandler.toast, 'J', BlocksHandler.applejamjar);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsHandler.cereals), new Object[] { Items.SUGAR, ItemsHandler.flour });
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsHandler.chocolatecereals), new Object[] { Items.SUGAR, new ItemStack(Items.DYE, 1 , 3), ItemsHandler.flour });
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsHandler.cerealsbowl), new Object[] { Items.BOWL, Items.MILK_BUCKET, ItemsHandler.cereals });
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsHandler.chocolatecerealsbowl), new Object[] { Items.BOWL, Items.MILK_BUCKET, ItemsHandler.chocolatecereals });
		GameRegistry.addShapedRecipe(new ItemStack(ItemsHandler.terilliumaxe), "TT", "TS", " S", 'T', ItemsHandler.terillium, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsHandler.terilliumboots), "T T", "T T", 'T', ItemsHandler.terillium);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsHandler.terilliumchestplate), "T T", "TTT","TTT", 'T', ItemsHandler.terillium);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsHandler.terilliumhelmet), "TTT", "T T", 'T', ItemsHandler.terillium);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsHandler.terilliumhoe), "TT", " S", " S", 'T', ItemsHandler.terillium, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsHandler.terilliumleggings), "TTT", "T T", "T T", 'T', ItemsHandler.terillium);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsHandler.terilliumpickaxe), "TTT", " S ", " S ", 'T', ItemsHandler.terillium, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsHandler.terilliumshovel), "T", "S", "S", 'T', ItemsHandler.terillium, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsHandler.terilliumsword), "T", "T", "S", 'T', ItemsHandler.terillium, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksHandler.blazecoalblock), "BBB", "BBB", "BBB", 'B', ItemsHandler.blazecoal);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsHandler.blazecoal, 9), new Object[] { BlocksHandler.blazecoalblock });
		GameRegistry.addShapedRecipe(new ItemStack(ItemsHandler.kitchenknife), "CCS", " I ", 'C', Blocks.COBBLESTONE, 'S', Items.STICK, 'I', Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksHandler.andesitebrick), "AA", "AA", 'A', new ItemStack(Blocks.STONE, 1, 6));
		*/
		GameRegistry.addSmelting(new ItemStack(BlocksHandler.andesitebrick), new ItemStack(BlocksHandler.andesitebrickcracked), 0.1F);
		/*
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksHandler.andesitebrickmossy), new Object[] { Blocks.VINE, BlocksHandler.andesitebrick });
		GameRegistry.addShapedRecipe(new ItemStack(BlocksHandler.andesite_slab_half, 6), "AAA", 'A', new ItemStack(BlocksHandler.andesitebrick));
		GameRegistry.addShapedRecipe(new ItemStack(BlocksHandler.andesitebrickcarved), "A", "A", 'A', new ItemStack(BlocksHandler.andesite_slab_half));
		GameRegistry.addShapedRecipe(new ItemStack(BlocksHandler.dioritebrick), "AA", "AA", 'A', new ItemStack(Blocks.STONE, 1, 4));
		*/
		GameRegistry.addSmelting(new ItemStack(BlocksHandler.dioritebrick), new ItemStack(BlocksHandler.dioritebrickcracked), 0.1F);
		/*
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksHandler.dioritebrickmossy), new Object[] { Blocks.VINE, BlocksHandler.dioritebrick });
		GameRegistry.addShapedRecipe(new ItemStack(BlocksHandler.diorite_slab_half, 6), "AAA", 'A', new ItemStack(BlocksHandler.dioritebrick));
		GameRegistry.addShapedRecipe(new ItemStack(BlocksHandler.dioritebrickcarved), "A", "A", 'A', new ItemStack(BlocksHandler.diorite_slab_half));
		GameRegistry.addShapedRecipe(new ItemStack(BlocksHandler.granitebrick), "AA", "AA", 'A', new ItemStack(Blocks.STONE, 1, 2));
		*/
		GameRegistry.addSmelting(new ItemStack(BlocksHandler.granitebrick), new ItemStack(BlocksHandler.granitebrickcracked), 0.1F);
		/*
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksHandler.granitebrickmossy), new Object[] { Blocks.VINE, BlocksHandler.granitebrick });
		GameRegistry.addShapedRecipe(new ItemStack(BlocksHandler.granite_slab_half, 6), "AAA", 'A', new ItemStack(BlocksHandler.granitebrick));
		GameRegistry.addShapedRecipe(new ItemStack(BlocksHandler.granitebrickcarved), "A", "A", 'A', new ItemStack(BlocksHandler.granite_slab_half));
		*/
	} 

}
