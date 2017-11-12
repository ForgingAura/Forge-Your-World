package forgingaura.forgeyourworld.ffoods.init;

import forgingaura.forgeyourworld.FFoods;
import forgingaura.forgeyourworld.ffoods.FoodsUtils;
import forgingaura.forgeyourworld.ffoods.block.AppleJamJar;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 10/11/2017.
 */
public class FoodsBlock {

    public static Block applejamjar;

    public static void init() {
        applejamjar = new AppleJamJar("applejamjar");

    }

    public static void register() {
        registerBlock(applejamjar);

    }

    public static void registerRenders() {
        registerRender(applejamjar);

    }

    public static void registerBlock(Block block) {
        block.setCreativeTab(FFoods.FOODS_TAB);
        GameRegistry.findRegistry(Block.class).register(block);
        GameRegistry.findRegistry(Item.class).register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        FoodsUtils.getLogger().info("Registered block: " + block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(
                new ResourceLocation(FFoods.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
        FoodsUtils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
    }
}
