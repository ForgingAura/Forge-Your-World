package forgingaura.forgeyourworld;

import forgingaura.forgeyourworld.ffactory.FactoryTab;
import forgingaura.forgeyourworld.ffactory.proxy.FactoryCommon;
import forgingaura.forgeyourworld.util.ModVersion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
@Mod(modid = FFactory.MODID, name = FFactory.NAME, version = ModVersion.VERSION, acceptedMinecraftVersions = FFactory.ACCEPTED_VERSION, updateJSON = "https://raw.githubusercontent.com/ForgingAura/Forge-Your-World-1.X-to-X.X/master/update.json")
public class FFactory {

    public static final String MODID = "ffactory";
    public static final String NAME = "Forge Your World Factory";
    public static final String ACCEPTED_VERSION = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASSE = "forgingaura.forgeyourworld.ffactory.proxy.FactoryClient";
    public static final String SERVER_PROXY_CLASSE = "forgingaura.forgeyourworld.ffactory.proxy.FactoryServer";

    @SidedProxy(clientSide = FFactory.CLIENT_PROXY_CLASSE, serverSide = FFactory.SERVER_PROXY_CLASSE)
    public static FactoryCommon proxy;

    //public static final CreativeTabs FACTORY_TAB = new FactoryTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
        proxy.registerRenders();
        System.out.println("Pre Initialization of Forge Your World Factory Done");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
        System.out.println("Initialization of Forge Your World Factory Done");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Post Initialization of Forge Your World Factory Done");
    }
}
