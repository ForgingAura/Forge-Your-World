package forgingaura.forgeyourworld;

import forgingaura.forgeyourworld.fdecostuff.DecoStuffConfig;
import forgingaura.forgeyourworld.ffoods.FoodsConfig;
import forgingaura.forgeyourworld.ffoods.FoodsTab;
import forgingaura.forgeyourworld.ffoods.init.FoodsBlock;
import forgingaura.forgeyourworld.ffoods.init.FoodsItem;
import forgingaura.forgeyourworld.ffoods.proxy.FoodsCommon;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
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
 * Created by AlasDiablo on 10/11/2017.
 */
@Mod(modid = FFoods.MODID, name = FFoods.NAME, version = ModVersion.VERSION, acceptedMinecraftVersions = FFoods.ACCEPTED_VERSION, updateJSON = "https://raw.githubusercontent.com/ForgingAura/Forge-Your-World-1.X-to-X.X/master/update.json")
public class FFoods {

    public static final String MODID = "ffoods";
    public static final String NAME = "Forge Your World Foods";
    public static final String ACCEPTED_VERSION = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASSE = "forgingaura.forgeyourworld.ffoods.proxy.FoodsClient";
    public static final String SERVER_PROXY_CLASSE = "forgingaura.forgeyourworld.ffoods.proxy.FoodsServer";

    public static Configuration config;

    @SidedProxy(clientSide = FFoods.CLIENT_PROXY_CLASSE, serverSide = FFoods.SERVER_PROXY_CLASSE)
    public static FoodsCommon proxy;

    public static final CreativeTabs FOODS_TAB = new FoodsTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath() + "/forge-your-world", "Foods.yml"));
        FoodsConfig.readConfig();
        if(FoodsConfig.enable_foods == true) {
            FoodsBlock.init();
            FoodsBlock.register();
            FoodsItem.init();
            System.out.println("[Forge Your World Foods] Item Init Done");
            FoodsItem.register();
            System.out.println("[Forge Your World Foods] Item Register Done");
            proxy.preInit();
            proxy.registerRenders();
            System.out.println("Pre Initialization of Forge Your World Foods Done");
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        if(FoodsConfig.enable_foods == true) {
            proxy.init();
            System.out.println("Initialization of Forge Your World Foods Done");
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        if(FoodsConfig.enable_foods == true) {
            System.out.println("Post Initialization of Forge Your World Foods Done");
        }
    }
}
