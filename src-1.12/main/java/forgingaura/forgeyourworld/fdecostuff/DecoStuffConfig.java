package forgingaura.forgeyourworld.fdecostuff;

import forgingaura.forgeyourworld.FDecoStuff;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class DecoStuffConfig {

    private static final String ENABLE_MOD = "enable_decostuff";

    public static boolean enable_decostuff = true;

    public static void readConfig() {
        Configuration cfg = FDecoStuff.config;
        try {
            cfg.load();
            initEnableConfig(cfg);
        } catch (Exception e1) {
            DecoStuffUtils.getLogger().log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initEnableConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(ENABLE_MOD, "Enable Forge Your World Decoration And Stuff");
        enable_decostuff = cfg.getBoolean("fdecostuff", ENABLE_MOD, enable_decostuff, "Set to false if you want to disable Forge Your World Decoration And Stuff");
    }
}
