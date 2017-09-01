package forgingaura.forgeyourworld.category.toolarmor;

import java.util.Set;

import com.google.common.collect.Sets;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;

public class TerilliumAxe extends ItemTool {
	
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
	
	public TerilliumAxe(String name, ToolMaterial material) {
		super(material, EFFECTIVE_ON);
		setUnlocalizedName(MainHandler.FYWItems.TERILLIUMAXE.getUnlocalizedName());
		setRegistryName(MainHandler.FYWItems.TERILLIUMAXE.getRegistryName());
		setCreativeTab(ForgeYourWorld.TOOL_TAB);

	}
	
}
