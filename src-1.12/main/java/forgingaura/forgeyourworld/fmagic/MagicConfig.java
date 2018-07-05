package forgingaura.forgeyourworld.fmagic;

import forgingaura.forgeyourworld.FMagic;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class MagicConfig {

    private static final String ENABLE_MOD = "enable_magic";

    public static boolean enable_magic = true;

    public static void readConfig() {
        Configuration cfg = FMagic.config;
        try {
            cfg.load();
            initEnableConfig(cfg);
        } catch (Exception e1) {
            MagicUtils.getLogger().log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initEnableConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(ENABLE_MOD, "Enable Forge Your World Mystical");
        enable_magic = cfg.getBoolean("fmagic", ENABLE_MOD, enable_magic, "Set to false if you want to disable Forge Your World Mystical");
    }
}
