package forgingaura.forgeyourworld.fdecostuff.proxy;

import forgingaura.forgeyourworld.fdecostuff.init.DecoStuffBlock;

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
    }

    @Override
    public void init() {

    }
}
