package forgingaura.forgeyourworld.ffoods.item;

import forgingaura.forgeyourworld.FFoods;
import forgingaura.forgeyourworld.ffoods.init.FoodsItem;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class KitchenKnife extends ItemSword {

    public KitchenKnife(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FFoods.MODID, unlocalizedName));
        this.setContainerItem(FoodsItem.kitchenknife);
    }
}
