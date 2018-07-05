package forgingaura.forgeyourworld.fmagic.init;

import forgingaura.forgeyourworld.FMagic;
import forgingaura.forgeyourworld.fmagic.MagicUtils;
import forgingaura.forgeyourworld.fmagic.item.WitherFragment;
import forgingaura.forgeyourworld.fmagic.item.WitherSeed;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
public class MagicItem {

    public static Item witherseed;
    public static Item witherfragment;


    public static void init() {
        witherseed = new WitherSeed(MagicBlock.withercrops, Blocks.FARMLAND,"wseed");
        witherfragment = new WitherFragment("wfragment");

    }

    public static void register() {
        registerItem(witherseed);
        registerItem(witherfragment);

    }

    public static void registerRenders() {
        registerRender(witherfragment);
        registerRender(witherseed);
    }

    public static void registerItem(Item item) {
        item.setCreativeTab(FMagic.MAGIC_TAB); //Sets the creative tab
        GameRegistry.findRegistry(Item.class).register(item);
        MagicUtils.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(FMagic.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
        MagicUtils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
    }
}
