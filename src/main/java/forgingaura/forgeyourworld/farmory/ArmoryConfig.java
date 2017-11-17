package forgingaura.forgeyourworld.farmory;

import forgingaura.forgeyourworld.FArmory;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class ArmoryConfig {

    private static final String ENABLE_ARMORY = "enable_armory";

    public static boolean enable_armory = true;

    public static void readConfig() {
        Configuration cfg = FArmory.config;
        try {
            cfg.load();
            initEnableConfig(cfg);
        } catch (Exception e1) {
            ArmoryUtils.getLogger().log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initEnableConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(ENABLE_ARMORY, "Enable Forge Your World: Armory");
        enable_armory = cfg.getBoolean("farmory", ENABLE_ARMORY, enable_armory, "Set to false if you want to disable Forge Your World Armory");
    }
}
