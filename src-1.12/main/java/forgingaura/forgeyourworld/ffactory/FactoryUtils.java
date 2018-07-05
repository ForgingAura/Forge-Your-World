package forgingaura.forgeyourworld.ffactory;

import forgingaura.forgeyourworld.FResource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactoryUtils {

    private static Logger logger;

    public static Logger getLogger() {
        if(logger == null) {
            logger = LogManager.getFormatterLogger(FResource.MODID);
        }
        return logger;
    }
}
