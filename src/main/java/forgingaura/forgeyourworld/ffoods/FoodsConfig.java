package forgingaura.forgeyourworld.ffoods;

import forgingaura.forgeyourworld.FFoods;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class FoodsConfig {

    private static final String ENABLE_MOD = "enable_foods";

    public static boolean enable_foods = true;

    public static void readConfig() {
        Configuration cfg = FFoods.config;
        try {
            cfg.load();
            initEnableConfig(cfg);
        } catch (Exception e1) {
            FoodsUtils.getLogger().log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initEnableConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(ENABLE_MOD, "Enable Forge Your World Foods");
        enable_foods = cfg.getBoolean("ffoods", ENABLE_MOD, enable_foods, "Set to false if you want to disable Forge Your World Foods");
    }
}
