package forgingaura.forgeyourworld.fresource.init;

import forgingaura.forgeyourworld.FResource;
import forgingaura.forgeyourworld.fresource.ResourceUtils;
import forgingaura.forgeyourworld.fresource.block.BlazeCoalBlock;
import forgingaura.forgeyourworld.fresource.block.BlazeCoalOre;
import forgingaura.forgeyourworld.fresource.block.EnderiumOre;
import forgingaura.forgeyourworld.fresource.block.TerilliumOre;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
public class ResourceBlock {

    public static Block blazecoalblock;
    public static Block blazecoalore;
    public static Block enderiumore;
    public static Block terilliumore;

    public static void init() {
        blazecoalblock = new BlazeCoalBlock("blazecoalblock");
        blazecoalore = new BlazeCoalOre("blazecoalore");
        enderiumore = new EnderiumOre("enderiumore");
        terilliumore = new TerilliumOre("terilliumore");

    }

    public static void register() {
        registerBlock(blazecoalblock);
        registerBlock(blazecoalore);
        registerBlock(enderiumore);
        registerBlock(terilliumore);

    }

    public static void registerRenders() {
        registerRender(blazecoalblock);
        registerRender(blazecoalore);
        registerRender(enderiumore);
        registerRender(terilliumore);

    }

    public static void registerBlock(Block block) {
        block.setCreativeTab(FResource.RESOURCE_TAB);
        GameRegistry.findRegistry(Block.class).register(block);
        GameRegistry.findRegistry(Item.class).register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        ResourceUtils.getLogger().info("Registered block: " + block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(
                new ResourceLocation(FResource.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
        ResourceUtils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
    }
}
