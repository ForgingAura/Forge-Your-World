package forgingaura.forgeyourworld.fresource;

import forgingaura.forgeyourworld.FResource;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class ResourceConfig {

    private static final String MOD_CONFIG = "mod_config";

    public static boolean enable_player_skull = true;
    public static boolean enable_new_cursor = true;
    public static int cursor_type = 1;

    public static void readConfig() {
        Configuration cfg = FResource.config;
        try {
            cfg.load();
            initEnableConfig(cfg);
        } catch (Exception e1) {
            ResourceUtils.getLogger().log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initEnableConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(MOD_CONFIG, "Configuration Files for Forge Your World Core");
        enable_player_skull = cfg.getBoolean("player_skull", MOD_CONFIG, enable_player_skull, "Set to false if you want to disable Player head drop on death");
        enable_new_cursor = cfg.getBoolean("cursor", MOD_CONFIG, enable_new_cursor, "Set to false if you want to disable the new cursor(is client sided)");
        cursor_type = cfg.getInt("cursor_type", MOD_CONFIG, cursor_type, 1, 4, "1 = diamond sword, 2 = stick, 3 = arrow, 4 = spectral arrow");
    }
}
