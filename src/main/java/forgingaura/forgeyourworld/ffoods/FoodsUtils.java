package forgingaura.forgeyourworld.ffoods;

import forgingaura.forgeyourworld.FFoods;
import forgingaura.forgeyourworld.FResource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
public class FoodsUtils {

    private static Logger logger;

    public static Logger getLogger() {
        if(logger == null) {
            logger = LogManager.getFormatterLogger(FFoods.MODID);
        }
        return logger;
    }
}
