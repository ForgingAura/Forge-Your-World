package forgingaura.forgeyourworld.farmory.weapontoolitem;

import forgingaura.forgeyourworld.FArmory;
import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;

/**
 * Created by AlasDiablo on 30/10/2017.
 */
public class TerilliumShovel extends ItemSpade {
    public TerilliumShovel(String unlocalizedName,ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FArmory.MODID, unlocalizedName));
    }
}
