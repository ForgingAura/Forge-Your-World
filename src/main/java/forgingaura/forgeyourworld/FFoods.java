package forgingaura.forgeyourworld;

import forgingaura.forgeyourworld.ffoods.FoodsTab;
import forgingaura.forgeyourworld.ffoods.init.FoodsBlock;
import forgingaura.forgeyourworld.ffoods.init.FoodsItem;
import forgingaura.forgeyourworld.ffoods.proxy.FoodsCommon;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by AlasDiablo on 10/11/2017.
 */
@Mod(modid = FFoods.MODID, name = FFoods.NAME, version = FFoods.VERSION, acceptedMinecraftVersions = FFoods.ACCEPTED_VERSION)
public class FFoods {

    public static final String MODID = "ffoods";
    public static final String NAME = "Forge Your World Foods";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_VERSION = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASSE = "forgingaura.forgeyourworld.ffoods.proxy.FoodsClient";
    public static final String SERVER_PROXY_CLASSE = "forgingaura.forgeyourworld.ffoods.proxy.FoodsServer";

    @SidedProxy(clientSide = FFoods.CLIENT_PROXY_CLASSE, serverSide = FFoods.SERVER_PROXY_CLASSE)
    public static FoodsCommon proxy;

    public static final CreativeTabs FOODS_TAB = new FoodsTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
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

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
        System.out.println("Initialization of Forge Your World Foods Done");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Post Initialization of Forge Your World Foods Done");
    }
}
