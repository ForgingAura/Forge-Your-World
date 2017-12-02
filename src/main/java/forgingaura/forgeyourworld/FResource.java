package forgingaura.forgeyourworld;

import forgingaura.forgeyourworld.fresource.ResourceConfig;
import forgingaura.forgeyourworld.fresource.ResourceTab;
import forgingaura.forgeyourworld.fresource.event.PlayerSkull;
import forgingaura.forgeyourworld.fresource.handler.FuelHandler;
import forgingaura.forgeyourworld.fresource.handler.OreDictionaryHandler;
import forgingaura.forgeyourworld.fresource.handler.OreGenerationHandler;
import forgingaura.forgeyourworld.fresource.handler.ResourceRecipe;
import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import forgingaura.forgeyourworld.fresource.proxy.ResourceCommon;
import forgingaura.forgeyourworld.util.ModVersion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.io.File;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
@Mod(modid = FResource.MODID, name = FResource.NAME, version = ModVersion.VERSION, acceptedMinecraftVersions = ModVersion.ACCEPTED_VERSION, updateJSON = "https://raw.githubusercontent.com/ForgingAura/Forge-Your-World-1.X-to-X.X/master/update.json")
public class FResource {

    public static final String MODID = "fresource";
    public static final String NAME = "Forge Your World Resouce / Core";
    public static final String CLIENT_PROXY_CLASSE = "forgingaura.forgeyourworld.fresource.proxy.ResourceClient";
    public static final String SERVER_PROXY_CLASSE = "forgingaura.forgeyourworld.fresource.proxy.ResourceServer";

    public static Configuration config;

    @SidedProxy(clientSide = FResource.CLIENT_PROXY_CLASSE, serverSide = FResource.SERVER_PROXY_CLASSE)
    public static ResourceCommon proxy;

    public static final CreativeTabs RESOURCE_TAB = new ResourceTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath() + "/forge-your-world", "Forge-Your-World.ini"));
        ResourceConfig.readConfig();
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
        System.out.println("Pre Initialization of Forge Your World Resource / Core Done");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        if(ResourceConfig.enable_player_skull == true) {
            MinecraftForge.EVENT_BUS.register(new PlayerSkull());
            System.out.println("[Forge Your World Core]Player head drop Done");
        }
        GameRegistry.registerWorldGenerator(new OreGenerationHandler(), 0);
        System.out.println("[Forge Your World Resource]Ore Generation Done");
        GameRegistry.registerFuelHandler(new FuelHandler());
        System.out.println("[Forge Your World Resource]Register Fuel Done");
        ResourceRecipe.register();
        OreDictionaryHandler.registerOreDictionary();
        proxy.init();
        System.out.println("Initialization of Forge Your World Resource / Core Done");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Post Initialization of Forge Your World Resource / Core Done");
    }
}
