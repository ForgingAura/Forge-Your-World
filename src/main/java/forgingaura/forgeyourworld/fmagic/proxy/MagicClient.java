package forgingaura.forgeyourworld.fmagic.proxy;

import forgingaura.forgeyourworld.fmagic.init.MagicBlock;
import forgingaura.forgeyourworld.fmagic.init.MagicItem;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
public class MagicClient implements MagicCommon {
    @Override
    public void preInit() {

    }

    @Override
    public void registerRenders() {
        MagicItem.registerRenders();
        MagicBlock.registerRenders();

    }

    @Override
    public void init() {

    }
}
