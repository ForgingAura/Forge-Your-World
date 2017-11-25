package forgingaura.forgeyourworld;

import forgingaura.forgeyourworld.fdecostuff.DecoStuffConfig;
import forgingaura.forgeyourworld.fmagic.MagicConfig;
import forgingaura.forgeyourworld.fmagic.MagicTab;
import forgingaura.forgeyourworld.fmagic.init.MagicBlock;
import forgingaura.forgeyourworld.fmagic.init.MagicItem;
import forgingaura.forgeyourworld.fmagic.proxy.MagicCommon;
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
 * Created by AlasDiablo on 11/11/2017.
 */
@Mod(modid = FMagic.MODID, name = FMagic.NAME, version = ModVersion.VERSION, acceptedMinecraftVersions = FMagic.ACCEPTED_VERSION, updateJSON = "https://raw.githubusercontent.com/ForgingAura/Forge-Your-World-1.X-to-X.X/master/update.json")
public class FMagic {

    public static final String MODID = "fmagic";
    public static final String NAME = "Forge Your World Mystical";
    public static final String ACCEPTED_VERSION = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASSE = "forgingaura.forgeyourworld.fmagic.proxy.MagicClient";
    public static final String SERVER_PROXY_CLASSE = "forgingaura.forgeyourworld.fmagic.proxy.MagicServer";

    public static Configuration config;

    @SidedProxy(clientSide = FMagic.CLIENT_PROXY_CLASSE, serverSide = FMagic.SERVER_PROXY_CLASSE)
    public static MagicCommon proxy;

    public static final CreativeTabs MAGIC_TAB = new MagicTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath() + "/forge-your-world", "Magic.yml"));
        MagicConfig.readConfig();
        if(MagicConfig.enable_magic == true) {
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
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        if(MagicConfig.enable_magic == true) {
            proxy.init();
            System.out.println("Initialization of Forge Your World Mystical Done");
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        if(MagicConfig.enable_magic == true) {
            System.out.println("Post Initialization of Forge Your World Mystical Done");
        }
    }
}
