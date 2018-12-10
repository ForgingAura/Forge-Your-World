package fr.forgingaura.fyw;

import fr.forgingaura.fyw.proxy.CommonProxy;
import fr.forgingaura.fyw.utils.ModInfo;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModInfo.MODID, name = ModInfo.NAME, version = ModInfo.VERSION)
public class ForgeYourWorldReborn {

    public static Logger logger;

    @SidedProxy( clientSide = ModInfo.CLIENT, serverSide = ModInfo.SERVER)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.render();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }
}
