package forgingaura.forgeyourworld;

import forgingaura.forgeyourworld.farmory.ArmoryConfig;
import forgingaura.forgeyourworld.ffactory.FactoryConfig;
import forgingaura.forgeyourworld.ffactory.FactoryTab;
import forgingaura.forgeyourworld.ffactory.init.FactoryBlock;
import forgingaura.forgeyourworld.ffactory.proxy.FactoryCommon;
import forgingaura.forgeyourworld.util.ModVersion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
@Mod(modid = FFactory.MODID, name = FFactory.NAME, version = ModVersion.VERSION, acceptedMinecraftVersions = ModVersion.ACCEPTED_VERSION, updateJSON = ModVersion.UPDATE)
public class FFactory {

    public static final String MODID = "ffactory";
    public static final String NAME = "Forge Your World Factory";
    public static final String CLIENT_PROXY_CLASSE = "forgingaura.forgeyourworld.ffactory.proxy.FactoryClient";
    public static final String SERVER_PROXY_CLASSE = "forgingaura.forgeyourworld.ffactory.proxy.FactoryServer";

    public static Configuration config;

    @SidedProxy(clientSide = FFactory.CLIENT_PROXY_CLASSE, serverSide = FFactory.SERVER_PROXY_CLASSE)
    public static FactoryCommon proxy;

    public static final CreativeTabs FACTORY_TAB = new FactoryTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath() + "/forge-your-world", "Factory.yml"));
        FactoryConfig.readConfig();
        if(FactoryConfig.enable_factory == true) {
            FactoryBlock.init();
            FactoryBlock.register();
            proxy.preInit();
            proxy.registerRenders();
            proxy.registerTileEntity();
            System.out.println("Pre Initialization of Forge Your World Factory Done");
        }
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        if(FactoryConfig.enable_factory == true) {
            proxy.init();
            System.out.println("Initialization of Forge Your World Factory Done");
        }
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        if(FactoryConfig.enable_factory == true) {
            System.out.println("Post Initialization of Forge Your World Factory Done");
        }
    }
}
