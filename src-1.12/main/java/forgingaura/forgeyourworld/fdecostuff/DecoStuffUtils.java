package forgingaura.forgeyourworld.fdecostuff;

import forgingaura.forgeyourworld.FDecoStuff;
import forgingaura.forgeyourworld.FResource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
public class DecoStuffUtils {

    private static Logger logger;

    public static Logger getLogger() {
        if(logger == null) {
            logger = LogManager.getFormatterLogger(FDecoStuff.MODID);
        }
        return logger;
    }
}
