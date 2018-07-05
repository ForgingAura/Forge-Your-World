package forgingaura.forgeyourworld.fmagic.init;

import forgingaura.forgeyourworld.FMagic;
import forgingaura.forgeyourworld.fmagic.MagicUtils;
import forgingaura.forgeyourworld.fmagic.block.WitherCrops;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
public class MagicBlock {

    public static Block withercrops;

    public static void init() {
        withercrops = new WitherCrops("withercrops");

    }

    public static void register() {
        GameRegistry.findRegistry(Block.class).register(withercrops);

    }

    public static void registerRenders() {
        registerRender(withercrops);

    }

    public static void registerBlock(Block block) {
        block.setCreativeTab(FMagic.MAGIC_TAB);
        GameRegistry.findRegistry(Block.class).register(block);
        GameRegistry.findRegistry(Item.class).register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        MagicUtils.getLogger().info("Registered block: " + block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(
                new ResourceLocation(FMagic.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
        MagicUtils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
    }
}
