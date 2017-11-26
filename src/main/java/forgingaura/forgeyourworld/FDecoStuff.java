package forgingaura.forgeyourworld;

import forgingaura.forgeyourworld.farmory.ArmoryConfig;
import forgingaura.forgeyourworld.fdecostuff.DecoStuffConfig;
import forgingaura.forgeyourworld.fdecostuff.DecoStuffTab;
import forgingaura.forgeyourworld.fdecostuff.init.DecoStuffBlock;
import forgingaura.forgeyourworld.fdecostuff.proxy.DecoStuffCommon;
import forgingaura.forgeyourworld.fresource.handler.OreGenerationHandler;
import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import forgingaura.forgeyourworld.util.ModVersion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.io.File;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
@Mod(modid = FDecoStuff.MODID, name = FDecoStuff.NAME, version = ModVersion.VERSION, acceptedMinecraftVersions = ModVersion.ACCEPTED_VERSION, updateJSON = "https://raw.githubusercontent.com/ForgingAura/Forge-Your-World-1.X-to-X.X/master/update.json")
public class FDecoStuff {

    public static final String MODID = "fdecostuff";
    public static final String NAME = "Forge Your World Decoration And Stuff";
    public static final String CLIENT_PROXY_CLASSE = "forgingaura.forgeyourworld.fdecostuff.proxy.DecoStuffClient";
    public static final String SERVER_PROXY_CLASSE = "forgingaura.forgeyourworld.fdecostuff.proxy.DecoStuffServer";

    public static Configuration config;

    @SidedProxy(clientSide = FDecoStuff.CLIENT_PROXY_CLASSE, serverSide = FDecoStuff.SERVER_PROXY_CLASSE)
    public static DecoStuffCommon proxy;

    public static final CreativeTabs DECOSTUFF_TAB = new DecoStuffTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath() + "/forge-your-world", "DecoStuff.yml"));
        DecoStuffConfig.readConfig();
        if(DecoStuffConfig.enable_decostuff == true) {
            DecoStuffBlock.init();
            System.out.println("[Forge Your World Decoration And Stuff] Block Init Done");
            DecoStuffBlock.register();
            System.out.println("[Forge Your World Decoration And Stuff] Block Register Done");
            proxy.preInit();
            proxy.registerRenders();
            System.out.println("Pre Initialization of Forge Your World Decoration And Stuff Done");
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        if(DecoStuffConfig.enable_decostuff == true) {
            proxy.init();
            System.out.println("Initialization of Forge Your World Decoration And Stuff Done");
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        if(DecoStuffConfig.enable_decostuff == true) {
            System.out.println("Post Initialization of Forge Your World Decoration And Stuff Done");
        }
    }
}
