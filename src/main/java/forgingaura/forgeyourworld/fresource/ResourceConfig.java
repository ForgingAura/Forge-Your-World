package forgingaura.forgeyourworld.fresource;

import forgingaura.forgeyourworld.FResource;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class ResourceConfig {

    private static final String ENABLE_MOD = "enable_mod";

    public static boolean enable_armory = true;
    public static boolean enable_decostuff = true;
    public static boolean enable_factory = true;
    public static boolean enable_foods = true;
    public static boolean enable_magic = true;

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
        cfg.addCustomCategoryComment(ENABLE_MOD, "Enable Mod configuration(Dont use is not work, use .yml files for this)");
        enable_armory = cfg.getBoolean("farmory", ENABLE_MOD, enable_armory, "Set to false if you want to disable Forge your World Armory");
        enable_decostuff = cfg.getBoolean("fdecostuff", ENABLE_MOD, enable_decostuff, "Set to false if you want to disable Forge your World Decoration And Stuff");
        enable_factory = cfg.getBoolean("factory", ENABLE_MOD, enable_factory, "Set to false if you want to disable Forge your World Factory");
        enable_foods = cfg.getBoolean("foods", ENABLE_MOD, enable_foods, "Set to false if you want to disable Forge your World Foods");
        enable_magic= cfg.getBoolean("fmagic", ENABLE_MOD, enable_magic, "Set to false if you want to disable Forge your World Mystical");
    }
}
