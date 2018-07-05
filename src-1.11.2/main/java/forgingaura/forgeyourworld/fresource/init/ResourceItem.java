package forgingaura.forgeyourworld.fresource.init;

import forgingaura.forgeyourworld.FResource;
import forgingaura.forgeyourworld.fresource.ResourceUtils;
import forgingaura.forgeyourworld.fresource.item.BasicIngotGemItem;
import forgingaura.forgeyourworld.fresource.item.BlazeCoal;
import forgingaura.forgeyourworld.fresource.item.RawTerillium;
import forgingaura.forgeyourworld.fresource.item.Terillium;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
public class ResourceItem {

    public static Item blazecoal;
    public static Item rawterillium;
    public static Item terillium;
    public static Item enderiumingot;
    public static Item reddiamond;
    public static Item copperingot;
    public static Item tiningot;
    public static Item bronzeingot;

    public static void init() {
        blazecoal = new BlazeCoal("blazecoal");
        rawterillium = new RawTerillium("rawterillium");
        terillium = new Terillium("terillium");
        enderiumingot = new BasicIngotGemItem("enderiumingot");
        reddiamond = new BasicIngotGemItem("reddiamond");
        copperingot = new BasicIngotGemItem("copperingot");
        tiningot = new BasicIngotGemItem("tiningot");
        bronzeingot = new BasicIngotGemItem("bronzeingot");

    }

    public static void register() {
        registerItem(blazecoal);
        registerItem(rawterillium);
        registerItem(terillium);
        registerItem(enderiumingot);
        registerItem(reddiamond);
        registerItem(copperingot);
        registerItem(tiningot);
        registerItem(bronzeingot);

    }

    public static void registerRenders() {
        registerRender(blazecoal);
        registerRender(rawterillium);
        registerRender(terillium);
        registerRender(enderiumingot);
        registerRender(reddiamond);
        registerRender(copperingot);
        registerRender(tiningot);
        registerRender(bronzeingot);

    }

    public static void registerItem(Item item) {
        item.setCreativeTab(FResource.RESOURCE_TAB); //Sets the creative tab
        GameRegistry.findRegistry(Item.class).register(item);
        ResourceUtils.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(FResource.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
        ResourceUtils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
    }

}
