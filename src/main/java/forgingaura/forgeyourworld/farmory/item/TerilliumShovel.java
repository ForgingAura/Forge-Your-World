package forgingaura.forgeyourworld.farmory.item;

import forgingaura.forgeyourworld.FArmory;
import forgingaura.forgeyourworld.farmory.init.ArmoryItem;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

/**
 * Created by AlasDiablo on 30/10/2017.
 */
public class TerilliumShovel extends ItemSpade {
    public TerilliumShovel(String unlocalizedName,ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FArmory.MODID, unlocalizedName));
        this.canRepair = true;
    }
}
