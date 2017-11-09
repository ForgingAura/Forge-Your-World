package forgingaura.forgeyourworld.fresource.proxy;

import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
public class ResourceClient implements ResourceCommon {

    @Override
    public void preInit() {
    }

    @Override
    public void init() {
    }

    @Override
    public void registerRenders() {
        ResourceBlock.registerRenders();
        System.out.println("[Forge Your World Resource] Block Renders Done");
        ResourceItem.registerRenders();
        System.out.println("[Forge Your World Resource] Item Renders Done");
    }
}
