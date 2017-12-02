package forgingaura.forgeyourworld.fdecostuff.init;

import forgingaura.forgeyourworld.FDecoStuff;
import forgingaura.forgeyourworld.fmagic.MagicUtils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DecoStuffItem {



    public static void init() {

    }

    public static void register() {


    }

    public static void registerRenders() {

    }

    public static void registerItem(Item item) {
        //item.setCreativeTab(FDecoStuff.STUFF_TAB); //Sets the creative tab
        GameRegistry.findRegistry(Item.class).register(item);
        MagicUtils.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(FDecoStuff.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
        MagicUtils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
    }
}
