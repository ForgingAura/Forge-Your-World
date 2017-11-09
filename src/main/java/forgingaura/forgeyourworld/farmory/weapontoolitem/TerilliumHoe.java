package forgingaura.forgeyourworld.farmory.weapontoolitem;

import forgingaura.forgeyourworld.FArmory;
import net.minecraft.item.ItemHoe;
import net.minecraft.util.ResourceLocation;

/**
 * Created by AlasDiablo on 30/10/2017.
 */
public class TerilliumHoe extends ItemHoe {
    public TerilliumHoe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FArmory.MODID, unlocalizedName));
    }
}
