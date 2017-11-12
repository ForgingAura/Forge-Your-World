package forgingaura.forgeyourworld.fresource;

import forgingaura.forgeyourworld.FResource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
public class ResourceUtils {

    private static Logger logger;

    public static Logger getLogger() {
        if(logger == null) {
            logger = LogManager.getFormatterLogger(FResource.MODID);
        }
        return logger;
    }
}
