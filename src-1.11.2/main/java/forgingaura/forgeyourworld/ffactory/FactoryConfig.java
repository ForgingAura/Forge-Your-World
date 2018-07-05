package forgingaura.forgeyourworld.ffactory;

import forgingaura.forgeyourworld.FArmory;
import forgingaura.forgeyourworld.FFactory;
import forgingaura.forgeyourworld.farmory.ArmoryUtils;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class FactoryConfig {
    private static final String FACTORY_CONFIG = "factory_config";

    public static boolean enable_factory = true;

    public static void readConfig() {
        Configuration cfg = FFactory.config;
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
        cfg.addCustomCategoryComment(FACTORY_CONFIG, "This is the config files for customize forge your world mod");
        enable_factory = cfg.getBoolean("ffactory", FACTORY_CONFIG, enable_factory, "Set to false if you want to disable Forge Your World Factory");
    }
}
