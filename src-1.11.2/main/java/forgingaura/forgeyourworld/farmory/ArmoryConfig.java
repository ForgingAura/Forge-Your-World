package forgingaura.forgeyourworld.farmory;

import forgingaura.forgeyourworld.FArmory;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class ArmoryConfig {

    private static final String ARMORY_CONFIG = "armory_config";

    public static boolean enable_armory = true;
    public static int elementary_multi = 0;

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
        cfg.addCustomCategoryComment(ARMORY_CONFIG, "This is the config files for customize forge your world mod");
        enable_armory = cfg.getBoolean("farmory", ARMORY_CONFIG, enable_armory, "Set to false if you want to disable Forge Your World Armory");
        elementary_multi = cfg.getInt("armor_multi_potion", ARMORY_CONFIG, elementary_multi, 0, 255, "this is the amplified of potion effect on special sword and armor 255 = no effect 0 = default value(speed I for example)");
    }
}
