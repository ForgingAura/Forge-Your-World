package forgingaura.forgeyourworld.farmory.item;

import forgingaura.forgeyourworld.FArmory;
import forgingaura.forgeyourworld.farmory.init.ArmoryItem;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

/**
 * Created by AlasDiablo on 30/10/2017.
 */
public class BasicHoe extends ItemHoe {

    public BasicHoe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FArmory.MODID, unlocalizedName));
        this.canRepair = true;
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        if (net.minecraftforge.oredict.OreDictionary.itemMatches(new ItemStack(ResourceItem.terillium), repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
}
