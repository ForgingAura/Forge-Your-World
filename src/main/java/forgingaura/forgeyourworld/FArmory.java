package forgingaura.forgeyourworld;

import forgingaura.forgeyourworld.farmory.ArmoryConfig;
import forgingaura.forgeyourworld.farmory.ArmoryTab;
import forgingaura.forgeyourworld.farmory.init.ArmoryItem;
import forgingaura.forgeyourworld.farmory.proxy.ArmoryCommon;
import forgingaura.forgeyourworld.fresource.ResourceConfig;
import forgingaura.forgeyourworld.util.ModVersion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

/**
 * Created by AlasDiablo on 30/10/2017.
 */
@Mod(modid = FArmory.MODID, name = FArmory.NAME, version = ModVersion.VERSION, acceptedMinecraftVersions = ModVersion.ACCEPTED_VERSION, updateJSON = "https://raw.githubusercontent.com/ForgingAura/Forge-Your-World-1.X-to-X.X/master/update.json")
public class FArmory {

    public static final String MODID = "farmory";
    public static final String NAME = "Forge Your World Armory";
    public static final String CLIENT_PROXY_CLASSE = "forgingaura.forgeyourworld.farmory.proxy.ArmoryClient";
    public static final String SERVER_PROXY_CLASSE = "forgingaura.forgeyourworld.farmory.proxy.ArmoryServer";

    public static Configuration config;

    @SidedProxy(clientSide = FArmory.CLIENT_PROXY_CLASSE, serverSide = FArmory.SERVER_PROXY_CLASSE)
    public static ArmoryCommon proxy;


    public static final CreativeTabs ARMORY_TAB = new ArmoryTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath() + "/forge-your-world", "Armory.yml"));
        ArmoryConfig.readConfig();
        if(ArmoryConfig.enable_armory == true) {
            ArmoryItem.init();
            System.out.println("[Forge Your World Armory] Weapon Item Init Done");
            ArmoryItem.register();
            System.out.println("[Forge Your World Armory] Weapon Item Register Done");
            proxy.preInit();
            proxy.registerRenders();
            System.out.println("Pre Initialization of Forge Your World Armory Done");
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        if(ArmoryConfig.enable_armory == true) {
            proxy.init();
            System.out.println("Initialization of Forge Your World Armory Done");
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        if(ArmoryConfig.enable_armory == true) {
            System.out.println("Post Initialization of Forge Your World Armory Done");
        }
    }
}
