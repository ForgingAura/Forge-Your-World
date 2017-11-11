package forgingaura.forgeyourworld;

import forgingaura.forgeyourworld.fdecostuff.DecoStuffTab;
import forgingaura.forgeyourworld.fdecostuff.init.DecoStuffBlock;
import forgingaura.forgeyourworld.fdecostuff.proxy.DecoStuffCommon;
import forgingaura.forgeyourworld.fresource.handler.OreGenerationHandler;
import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
@Mod(modid = FDecoStuff.MODID, name = FDecoStuff.NAME, version = FDecoStuff.VERSION, acceptedMinecraftVersions = FDecoStuff.ACCEPTED_VERSION)
public class FDecoStuff {

    public static final String MODID = "fdecostuff";
    public static final String NAME = "Forge Your World Decoration And Stuff";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_VERSION = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASSE = "forgingaura.forgeyourworld.fdecostuff.proxy.DecoStuffClient";
    public static final String SERVER_PROXY_CLASSE = "forgingaura.forgeyourworld.fdecostuff.proxy.DecoStuffServer";

    @SidedProxy(clientSide = FDecoStuff.CLIENT_PROXY_CLASSE, serverSide = FDecoStuff.SERVER_PROXY_CLASSE)
    public static DecoStuffCommon proxy;

    public static final CreativeTabs DECOSTUFF_TAB = new DecoStuffTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        DecoStuffBlock.init();
        System.out.println("[Forge Your World Decoration And Stuff] Block Init Done");
        DecoStuffBlock.register();
        System.out.println("[Forge Your World Decoration And Stuff] Block Register Done");
        proxy.preInit();
        proxy.registerRenders();
        System.out.println("Pre Initialization of Forge Your World Decoration And Stuff Done");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new OreGenerationHandler(), 0);
        System.out.println("[Forge Your World Decoration And Stuff]Ore Generation Done");
        proxy.init();
        System.out.println("Initialization of Forge Your World Decoration And Stuff Done");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Post Initialization of Forge Your World Decoration And Stuff Done");
    }
}
