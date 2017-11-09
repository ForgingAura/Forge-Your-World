package forgingaura.forgeyourworld.farmory.init;

import forgingaura.forgeyourworld.FArmory;
import forgingaura.forgeyourworld.farmory.weapontoolitem.*;
import forgingaura.forgeyourworld.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 30/10/2017.
 */
public class ArmoryWeaponToolItem {

    public static Item terilliumhoe;
    public static Item terilliumaxe;
    public static Item terilliumpickaxe;
    public static Item terilliumshovel;
    public static Item terilliumsword;

    public static void init() {
        terilliumhoe = new TerilliumHoe("terilliumhoe", ArmoryToolMaterials.terilliumMat);
        terilliumaxe =new TerilliumAxe("terilliumaxe", ArmoryToolMaterials.terilliumMat);
        terilliumpickaxe = new TerilliumPickaxe("terilliumpickaxe", ArmoryToolMaterials.terilliumMat);
        terilliumshovel = new TerilliumShovel("terilliumshovel", ArmoryToolMaterials.terilliumMat);
        terilliumsword = new TerilliumSword("terilliumsword", ArmoryToolMaterials.terilliumMat);

    }

    public static void register() {
        registerItem(terilliumhoe);
        registerItem(terilliumaxe);
        registerItem(terilliumpickaxe);
        registerItem(terilliumshovel);
        registerItem(terilliumsword);

    }

    public static void registerRenders() {
        registerRender(terilliumhoe);
        registerRender(terilliumaxe);
        registerRender(terilliumpickaxe);
        registerRender(terilliumshovel);
        registerRender(terilliumsword);

    }

    public static class ArmoryToolMaterials {
        public static final Item.ToolMaterial terilliumMat = EnumHelper.addToolMaterial("terilliumMat", 3, 768, 8.0F, 2.0F, 25);

    }

    public static void registerItem(Item item) {
        item.setCreativeTab(FArmory.ARMORY_TAB); //Sets the creative tab
        GameRegistry.findRegistry(Item.class).register(item);
        Utils.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));

    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(FArmory.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
        Utils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));

    }

}
