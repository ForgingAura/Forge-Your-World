package forgingaura.forgeyourworld.ffactory.init;

import forgingaura.forgeyourworld.FFactory;
import forgingaura.forgeyourworld.FResource;
import forgingaura.forgeyourworld.ffactory.FactoryUtils;
import forgingaura.forgeyourworld.ffactory.block.IronFurnace;
import forgingaura.forgeyourworld.ffactory.block.SteampunkFurnace;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FactoryBlock {

    public static Block ironfurnace;
    public static Block litironfurnace;
    public static Block steampunkfurnace;
    public static Block litsteampunkfurnace;

    public static void init() {
        ironfurnace = new IronFurnace(false).setUnlocalizedName("ironfurnace").setRegistryName(new ResourceLocation(FFactory.MODID, "ironfurnace"));
        litironfurnace = new IronFurnace(true).setUnlocalizedName("lit_ironfurnace").setRegistryName(new ResourceLocation(FFactory.MODID, "lit_ironfurnace"));
        steampunkfurnace = new SteampunkFurnace(false).setUnlocalizedName("steampunkfurnace").setRegistryName(new ResourceLocation(FFactory.MODID, "steampunkfurnace"));
        litsteampunkfurnace = new SteampunkFurnace(true).setUnlocalizedName("lit_steampunkfurnace").setRegistryName(new ResourceLocation(FFactory.MODID, "lit_steampunkfurnace"));

    }

    public static void register() {
        registerBlock(ironfurnace);
        GameRegistry.findRegistry(Block.class).register(litironfurnace);
        GameRegistry.findRegistry(Item.class).register(new ItemBlock(litironfurnace).setRegistryName(litironfurnace.getRegistryName()));
        registerBlock(steampunkfurnace);
        GameRegistry.findRegistry(Block.class).register(litsteampunkfurnace);
        GameRegistry.findRegistry(Item.class).register(new ItemBlock(litsteampunkfurnace).setRegistryName(litsteampunkfurnace.getRegistryName()));

    }

    public static void registerRenders() {
        registerRender(ironfurnace);
        registerRender(litironfurnace);
        registerRender(steampunkfurnace);
        registerRender(litsteampunkfurnace);

    }

    public static void registerBlock(Block block) {
        block.setCreativeTab(FFactory.FACTORY_TAB);
        GameRegistry.findRegistry(Block.class).register(block);
        GameRegistry.findRegistry(Item.class).register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        FactoryUtils.getLogger().info("Registered block: " + block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(
                new ResourceLocation(FFactory.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
        FactoryUtils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
    }
}
