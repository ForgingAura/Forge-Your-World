package forgingaura.forgeyourworld.farmory.init;

import forgingaura.forgeyourworld.FArmory;
import forgingaura.forgeyourworld.farmory.ArmoryUtils;
import forgingaura.forgeyourworld.farmory.item.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 12/11/2017.
 */
public class ArmoryItem {

    public static Item terilliumhelmet;
    public static Item terilliumchestplate;
    public static Item terilliumleggings;
    public static Item terilliumboots;
    public static Item terilliumhoe;
    public static Item terilliumaxe;
    public static Item terilliumpickaxe;
    public static Item terilliumshovel;
    public static Item terilliumsword;
    public static Item longbow;
    public static Item crossbow;

    public static void init() {
        terilliumhelmet = new ItemArmor(ArmoryItem.ArmoryArmorMaterials.terilliumMat, 3, EntityEquipmentSlot.HEAD).setUnlocalizedName("terilliumhelmet").setRegistryName(new ResourceLocation(FArmory.MODID, "terilliumhelmet"));
        terilliumchestplate = new ItemArmor(ArmoryItem.ArmoryArmorMaterials.terilliumMat, 3, EntityEquipmentSlot.CHEST).setUnlocalizedName("terilliumchestplate").setRegistryName(new ResourceLocation(FArmory.MODID, "terilliumchestplate"));
        terilliumleggings = new ItemArmor(ArmoryItem.ArmoryArmorMaterials.terilliumMat, 3, EntityEquipmentSlot.LEGS).setUnlocalizedName("terilliumleggings").setRegistryName(new ResourceLocation(FArmory.MODID, "terilliumleggings"));
        terilliumboots = new ItemArmor(ArmoryItem.ArmoryArmorMaterials.terilliumMat, 3, EntityEquipmentSlot.FEET).setUnlocalizedName("terilliumboots").setRegistryName(new ResourceLocation(FArmory.MODID, "terilliumboots"));
        terilliumhoe = new TerilliumHoe("terilliumhoe", ArmoryItem.ArmoryToolMaterials.terilliumMat);
        terilliumaxe =new TerilliumAxe("terilliumaxe", ArmoryItem.ArmoryToolMaterials.terilliumMat);
        terilliumpickaxe = new TerilliumPickaxe("terilliumpickaxe", ArmoryItem.ArmoryToolMaterials.terilliumMat);
        terilliumshovel = new TerilliumShovel("terilliumshovel", ArmoryItem.ArmoryToolMaterials.terilliumMat);
        terilliumsword = new TerilliumSword("terilliumsword", ArmoryItem.ArmoryToolMaterials.terilliumMat);
        longbow = new LongBow("longbow");
        crossbow = new CrossBow("crossbow");

    }

    public static void register() {
        registerItem(terilliumhelmet);
        registerItem(terilliumchestplate);
        registerItem(terilliumleggings);
        registerItem(terilliumboots);
        registerItem(terilliumhoe);
        registerItem(terilliumaxe);
        registerItem(terilliumpickaxe);
        registerItem(terilliumshovel);
        registerItem(terilliumsword);
        registerItem(longbow);
        registerItem(crossbow);

    }

    public static void registerRenders() {
        registerRender(terilliumhelmet);
        registerRender(terilliumchestplate);
        registerRender(terilliumleggings);
        registerRender(terilliumboots);
        registerRender(terilliumhoe);
        registerRender(terilliumaxe);
        registerRender(terilliumpickaxe);
        registerRender(terilliumshovel);
        registerRender(terilliumsword);
        registerRender(longbow);
        registerRender(crossbow);

    }

    public static class ArmoryArmorMaterials {
        public static final ItemArmor.ArmorMaterial terilliumMat = EnumHelper.addArmorMaterial("terilliumMat", FArmory.MODID + ":terilliumarmor", 25, new int[]{2, 5, 7 ,2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);

    }

    public static class ArmoryToolMaterials {
        public static final Item.ToolMaterial terilliumMat = EnumHelper.addToolMaterial("terilliumMat", 3, 768, 8.0F, 2.0F, 25);

    }

    public static void registerItem(Item item) {
        item.setCreativeTab(FArmory.ARMORY_TAB); //Sets the creative tab
        GameRegistry.findRegistry(Item.class).register(item);
        ArmoryUtils.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));

    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(FArmory.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
        ArmoryUtils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));

    }
}
