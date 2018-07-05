package forgingaura.forgeyourworld.fresource.handler;

import forgingaura.forgeyourworld.fmagic.init.MagicItem;
import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {

    public static void registerOreDictionary() {

        OreDictionary.registerOre("oreEnderium", ResourceBlock.enderiumore);
        OreDictionary.registerOre("oreTerillium", ResourceBlock.terilliumore);
        OreDictionary.registerOre("oreBlazecoal", ResourceBlock.blazecoalore);
        OreDictionary.registerOre("blockBlazecoal", ResourceBlock.blazecoalblock);
        OreDictionary.registerOre("gemRawterillium", ResourceItem.rawterillium);
        OreDictionary.registerOre("gemTerillium", ResourceItem.terillium);
        OreDictionary.registerOre("ingotEnderium", ResourceItem.enderiumingot);
        OreDictionary.registerOre("blazecoal", ResourceItem.blazecoal);
        OreDictionary.registerOre("gemWither", MagicItem.witherfragment);
        OreDictionary.registerOre("blockTerillium", ResourceBlock.terilliumblock);
        OreDictionary.registerOre("oreReddiamond", ResourceBlock.reddiamondore);
        OreDictionary.registerOre("gemReddiamond", ResourceItem.reddiamond);
        OreDictionary.registerOre("blockReddiamond", ResourceBlock.reddiamondblock);
        OreDictionary.registerOre("blockEnderium", ResourceBlock.enderiumblock);
        OreDictionary.registerOre("ingotCopper", ResourceItem.copperingot);
        OreDictionary.registerOre("ingotTin", ResourceItem.tiningot);
        OreDictionary.registerOre("ingotBronze", ResourceItem.bronzeingot);
        OreDictionary.registerOre("oreCopper", ResourceBlock.copperore);
        OreDictionary.registerOre("oreTin", ResourceBlock.tinore);

    }
}
