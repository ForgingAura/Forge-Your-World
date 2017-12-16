package forgingaura.forgeyourworld.farmory.init;

import forgingaura.forgeyourworld.FArmory;
import forgingaura.forgeyourworld.farmory.ArmoryUtils;
import forgingaura.forgeyourworld.farmory.item.*;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
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
    public static Item blowgun;
    public static Item enderiumsword;
    public static Item reddiamondsword;
    public static Item enderiumhelmet;
    public static Item enderiumchestplate;
    public static Item enderiumleggings;
    public static Item enderiumboots;
    public static Item reddiamondhelmet;
    public static Item reddiamondchestplate;
    public static Item reddiamondleggings;
    public static Item reddiamondboots;

    public static void init() {
        terilliumhelmet = new TerlliumArmor(ArmoryArmorMaterials.terilliumMat, 3, EntityEquipmentSlot.HEAD, "terilliumhelmet");
        terilliumchestplate = new TerlliumArmor(ArmoryArmorMaterials.terilliumMat, 3, EntityEquipmentSlot.CHEST, "terilliumchestplate");
        terilliumleggings = new TerlliumArmor(ArmoryArmorMaterials.terilliumMat, 3, EntityEquipmentSlot.LEGS, "terilliumleggings");
        terilliumboots = new TerlliumArmor(ArmoryArmorMaterials.terilliumMat, 3, EntityEquipmentSlot.FEET, "terilliumboots");
        terilliumhoe = new BasicHoe("terilliumhoe", ArmoryItem.ArmoryToolMaterials.terilliumMat);
        terilliumaxe =new BasicAxe("terilliumaxe", ArmoryItem.ArmoryToolMaterials.terilliumMat);
        terilliumpickaxe = new BasicPickaxe("terilliumpickaxe", ArmoryItem.ArmoryToolMaterials.terilliumMat);
        terilliumshovel = new BasicShovel("terilliumshovel", ArmoryItem.ArmoryToolMaterials.terilliumMat);
        terilliumsword = new TerilliumSword("terilliumsword", ArmoryItem.ArmoryToolMaterials.terilliumMat);
        longbow = new LongBow("longbow");
        crossbow = new CrossBow("crossbow");
        blowgun = new BlowGun("blowgun");
        enderiumsword = new EnderiumSword("enderiumsword", ArmoryToolMaterials.enderiumMat);
        reddiamondsword = new RedDiamondSword(ArmoryToolMaterials.reddiamondMat, "reddiamondsword");
        enderiumhelmet = new EnderiumArmor(ArmoryArmorMaterials.enderiumMat, 3, EntityEquipmentSlot.HEAD, "enderiumhelmet");
        enderiumchestplate = new EnderiumArmor(ArmoryArmorMaterials.enderiumMat, 3, EntityEquipmentSlot.CHEST, "enderiumchestplate");
        enderiumleggings = new EnderiumArmor(ArmoryArmorMaterials.enderiumMat, 3, EntityEquipmentSlot.LEGS, "enderiumleggings");
        enderiumboots = new EnderiumArmor(ArmoryArmorMaterials.enderiumMat, 3, EntityEquipmentSlot.FEET, "enderiumboots");
        reddiamondhelmet = new RedDiamondArmor(ArmoryArmorMaterials.reddiamondMat, 3, EntityEquipmentSlot.HEAD, "reddiamondhelmet");
        reddiamondchestplate = new RedDiamondArmor(ArmoryArmorMaterials.reddiamondMat, 3, EntityEquipmentSlot.CHEST, "reddiamondchestplate");
        reddiamondleggings = new RedDiamondArmor(ArmoryArmorMaterials.reddiamondMat, 3, EntityEquipmentSlot.LEGS, "reddiamondleggings");
        reddiamondboots = new RedDiamondArmor(ArmoryArmorMaterials.reddiamondMat, 3, EntityEquipmentSlot.FEET, "reddiamondboots");


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
        registerItem(blowgun);
        registerItem(enderiumsword);
        registerItem(reddiamondsword);
        registerItem(enderiumhelmet);
        registerItem(enderiumchestplate);
        registerItem(enderiumleggings);
        registerItem(enderiumboots);
        registerItem(reddiamondhelmet);
        registerItem(reddiamondchestplate);
        registerItem(reddiamondleggings);
        registerItem(reddiamondboots);

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
        registerRender(blowgun);
        registerRender(enderiumsword);
        registerRender(reddiamondsword);
        registerRender(enderiumhelmet);
        registerRender(enderiumchestplate);
        registerRender(enderiumleggings);
        registerRender(enderiumboots);
        registerRender(reddiamondhelmet);
        registerRender(reddiamondchestplate);
        registerRender(reddiamondleggings);
        registerRender(reddiamondboots);

    }

    public static class ArmoryArmorMaterials {
        public static final ItemArmor.ArmorMaterial terilliumMat = EnumHelper.addArmorMaterial("terilliumMat", FArmory.MODID + ":terilliumarmor", 25, new int[]{3, 6, 8 ,3}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
        public static final ItemArmor.ArmorMaterial enderiumMat = EnumHelper.addArmorMaterial("enderiumMat", FArmory.MODID + ":enderiumarmor", 75, new int[]{3, 6, 8 ,3}, 75, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
        public static final ItemArmor.ArmorMaterial reddiamondMat = EnumHelper.addArmorMaterial("reddiamondMat", FArmory.MODID + ":reddiamondarmor", 50, new int[]{3, 6, 8 ,3}, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.75F);

    }

    public static class ArmoryToolMaterials {
        public static final Item.ToolMaterial terilliumMat = EnumHelper.addToolMaterial("terilliumMat", 3, 768, 8.0F, 2.0F, 25).setRepairItem(new ItemStack(ResourceItem.terillium));
        public static final Item.ToolMaterial enderiumMat = EnumHelper.addToolMaterial("enderiumMat", 3, 2304, 24.0F, 6.0F, 75).setRepairItem(new ItemStack(ResourceItem.enderiumingot));
        public static final Item.ToolMaterial reddiamondMat = EnumHelper.addToolMaterial("reddiamondMat", 3, 1536, 16.0F, 4.0F, 50).setRepairItem(new ItemStack(ResourceItem.reddiamond));

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
