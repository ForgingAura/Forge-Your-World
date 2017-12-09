package forgingaura.forgeyourworld.farmory.item;

import java.util.Set;

import com.google.common.collect.Sets;

import forgingaura.forgeyourworld.FArmory;
import forgingaura.forgeyourworld.farmory.init.ArmoryItem;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;

/**
 * Created by AlasDiablo on 30/10/2017.
 */
public class BasicAxe extends ItemTool {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});

    public BasicAxe(String unlocalizedName, ToolMaterial material) {
        super(material, EFFECTIVE_ON);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FArmory.MODID, unlocalizedName));
        this.canRepair = true;
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        if (net.minecraftforge.oredict.OreDictionary.itemMatches(new ItemStack(ResourceItem.terillium), repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
}
