package forgingaura.forgeyourworld.ffoods.proxy;

import forgingaura.forgeyourworld.ffoods.init.FoodsBlock;
import forgingaura.forgeyourworld.ffoods.init.FoodsItem;

/**
 * Created by AlasDiablo on 10/11/2017.
 */
public class FoodsClient implements FoodsCommon {
    @Override
    public void preInit() {

    }

    @Override
    public void registerRenders() {
        FoodsItem.registerRenders();
        FoodsBlock.registerRenders();

    }

    @Override
    public void init() {

    }
}
