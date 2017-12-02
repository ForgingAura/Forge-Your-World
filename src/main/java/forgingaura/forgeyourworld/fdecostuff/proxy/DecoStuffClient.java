package forgingaura.forgeyourworld.fdecostuff.proxy;

import forgingaura.forgeyourworld.fdecostuff.handler.DecoStuffRecipe;
import forgingaura.forgeyourworld.fdecostuff.init.DecoStuffBlock;
import forgingaura.forgeyourworld.fdecostuff.init.DecoStuffItem;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
public class DecoStuffClient implements DecoStuffCommon {
    @Override
    public void preInit() {

    }

    @Override
    public void registerRenders() {
        DecoStuffBlock.registerRenders();
        //DecoStuffItem.registerRenders();
        System.out.println("[Forge Your World Decoration And Stuff] Block/Item Register Renders Done");
    }

    @Override
    public void init() {

    }
}
