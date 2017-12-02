package forgingaura.forgeyourworld.fresource.handler;

import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {

    public static void registerOreDictionary() {

        OreDictionary.registerOre("oreEnderium", ResourceBlock.enderiumore);
        OreDictionary.registerOre("oreTerillium", ResourceBlock.terilliumore);
        OreDictionary.registerOre("oreBlazecoal", ResourceBlock.blazecoalore);
        OreDictionary.registerOre("blockBlazecoal", ResourceBlock.blazecoalblock);
        OreDictionary.registerOre("gemRawterllium", ResourceItem.rawterillium);
        OreDictionary.registerOre("gemTerillium", ResourceItem.terillium);
        OreDictionary.registerOre("ingotEnderium", ResourceItem.enderiumingot);
        OreDictionary.registerOre("coal", ResourceItem.blazecoal);
    }
}
