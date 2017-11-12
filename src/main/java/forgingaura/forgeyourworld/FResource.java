package forgingaura.forgeyourworld;

import forgingaura.forgeyourworld.fresource.ResourceTab;
import forgingaura.forgeyourworld.fresource.handler.FuelHandler;
import forgingaura.forgeyourworld.fresource.handler.OreGenerationHandler;
import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import forgingaura.forgeyourworld.fresource.proxy.ResourceCommon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
@Mod(modid = FResource.MODID, name = FResource.NAME, version = FResource.VERSION, acceptedMinecraftVersions = FResource.ACCEPTED_VERSION)
public class FResource {

    public static final String MODID = "fresource";
    public static final String NAME = "Forge Your World Resouce";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_VERSION = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASSE = "forgingaura.forgeyourworld.fresource.proxy.ResourceClient";
    public static final String SERVER_PROXY_CLASSE = "forgingaura.forgeyourworld.fresource.proxy.ResourceServer";

    @SidedProxy(clientSide = FResource.CLIENT_PROXY_CLASSE, serverSide = FResource.SERVER_PROXY_CLASSE)
    public static ResourceCommon proxy;

    public static final CreativeTabs RESOURCE_TAB = new ResourceTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ResourceBlock.init();
        System.out.println("[Forge Your World Resource] Block Init Done");
        ResourceBlock.register();
        System.out.println("[Forge Your World Resource] Block Register Done");
        ResourceItem.init();
        System.out.println("[Forge Your World Resource] Item Init Done");
        ResourceItem.register();
        System.out.println("[Forge Your World Resource] Item Register Done");
        proxy.preInit();
        proxy.registerRenders();
        System.out.println("Pre Initialization of Forge Your World Resouce Done");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new OreGenerationHandler(), 0);
        System.out.println("[Forge Your World Resource]Ore Generation Done");
        GameRegistry.registerFuelHandler(new FuelHandler());
        System.out.println("[Forge Your World Resource]Register Fuel Done");
        proxy.init();
        System.out.println("Initialization of Forge Your World Resouce Done");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Post Initialization of Forge Your World Resouce Done");
    }
}
