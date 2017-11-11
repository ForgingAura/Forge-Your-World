package forgingaura.forgeyourworld;

import forgingaura.forgeyourworld.fmagic.MagicTab;
import forgingaura.forgeyourworld.fmagic.init.MagicBlock;
import forgingaura.forgeyourworld.fmagic.init.MagicItem;
import forgingaura.forgeyourworld.fmagic.proxy.MagicCommon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
@Mod(modid = FMagic.MODID, name = FMagic.NAME, version = FMagic.VERSION, acceptedMinecraftVersions = FMagic.ACCEPTED_VERSION)
public class FMagic {

    public static final String MODID = "fmagic";
    public static final String NAME = "Forge Your World Mystical";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_VERSION = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASSE = "forgingaura.forgeyourworld.fmagic.proxy.MagicClient";
    public static final String SERVER_PROXY_CLASSE = "forgingaura.forgeyourworld.fmagic.proxy.MagicServer";

    @SidedProxy(clientSide = FMagic.CLIENT_PROXY_CLASSE, serverSide = FMagic.SERVER_PROXY_CLASSE)
    public static MagicCommon proxy;

    public static final CreativeTabs MAGIC_TAB = new MagicTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MagicBlock.init();
        System.out.println("[Forge Your World Mystical] Block Init Done");
        MagicBlock.register();
        System.out.println("[Forge Your World Mystical] Block Register Done");
        MagicItem.init();
        System.out.println("[Forge Your World Mystical] Item Init Done");
        MagicItem.register();
        System.out.println("[Forge Your World Mystical] Item Register Done");
        proxy.preInit();
        proxy.registerRenders();
        System.out.println("Pre Initialization of Forge Your World Mystical Done");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
        System.out.println("Initialization of Forge Your World Mystical Done");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Post Initialization of Forge Your World Mystical Done");
    }
}
