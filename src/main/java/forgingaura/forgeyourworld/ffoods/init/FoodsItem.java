package forgingaura.forgeyourworld.ffoods.init;

import forgingaura.forgeyourworld.FFoods;
import forgingaura.forgeyourworld.FResource;
import forgingaura.forgeyourworld.ffoods.item.*;
import forgingaura.forgeyourworld.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 10/11/2017.
 */
public class FoodsItem {

    public static Item applejam;
    public static Item appletoast;
    public static Item cereals;
    public static Item cerealsbowl;
    public static Item chocolatecereals;
    public static Item chocolatecerealsbowl;
    public static Item flour;
    public static Item toast;


    public static void init() {
        applejam = new AppleJam("applejam");
        appletoast = new AppleToast("appletoast");
        cereals = new Cereals("cereals");
        cerealsbowl = new CerealsBowl("cerealsbowl");
        chocolatecereals = new ChocolateCereals("chocolatecereals");
        chocolatecerealsbowl = new ChocolateCerealsBowl("chocolatecerealsbowl");
        flour = new Flour("flour");
        toast = new Toast("toast");

    }

    public static void register() {
        registerItem(applejam);
        registerItem(appletoast);
        registerItem(cereals);
        registerItem(cerealsbowl);
        registerItem(chocolatecereals);
        registerItem(chocolatecerealsbowl);
        registerItem(flour);
        registerItem(toast);

    }

    public static void registerRenders() {
        registerRender(applejam);
        registerRender(appletoast);
        registerRender(cereals);
        registerRender(cerealsbowl);
        registerRender(chocolatecereals);
        registerRender(chocolatecerealsbowl);
        registerRender(flour);
        registerRender(toast);
    }

    public static void registerItem(Item item) {
        item.setCreativeTab(FFoods.FOODS_TAB); //Sets the creative tab
        GameRegistry.findRegistry(Item.class).register(item);
        Utils.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(FFoods.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
        Utils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
    }
}
