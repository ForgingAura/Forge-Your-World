package forgingaura.forgeyourworld;

import forgingaura.forgeyourworld.farmory.ArmoryTab;
import forgingaura.forgeyourworld.farmory.init.ArmoryWeaponToolItem;
import forgingaura.forgeyourworld.farmory.proxy.ArmoryCommon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by AlasDiablo on 30/10/2017.
 */
@Mod(modid = FArmory.MODID, name = FArmory.NAME, version = FArmory.VERSION, acceptedMinecraftVersions = FArmory.ACCEPTED_VERSION)
public class FArmory {

    public static final String MODID = "farmory";
    public static final String NAME = "Forge Your World Armory";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_VERSION = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASSE = "forgingaura.forgeyourworld.farmory.proxy.ArmoryClient";
    public static final String SERVER_PROXY_CLASSE = "forgingaura.forgeyourworld.farmory.proxy.ArmoryServer";

    @SidedProxy(clientSide = FArmory.CLIENT_PROXY_CLASSE, serverSide = FArmory.SERVER_PROXY_CLASSE)
    public static ArmoryCommon proxy;

    public static final CreativeTabs ARMORY_TAB = new ArmoryTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ArmoryWeaponToolItem.init();
        System.out.println("[Forge Your World Armory] Weapon Item Init Done");
        ArmoryWeaponToolItem.register();
        System.out.println("[Forge Your World Armory] Weapon Item Register Done");
        proxy.preInit();
        proxy.registerRenders();
        System.out.println("Pre Initialization of Forge Your World Armory Done");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
        System.out.println("Initialization of Forge Your World Armory Done");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Post Initialization of Forge Your World Armory Done");
    }
}
