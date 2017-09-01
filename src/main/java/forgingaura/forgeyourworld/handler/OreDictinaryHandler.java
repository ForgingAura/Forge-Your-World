package forgingaura.forgeyourworld.handler;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictinaryHandler {
	
public static void registerOreDictionary() {
		
		OreDictionary.registerOre("gemRawTerillium", ItemsHandler.rawterillium);
		OreDictionary.registerOre("gemTerillium", ItemsHandler.terillium);
		OreDictionary.registerOre("oreTerillium", BlocksHandler.terilliumore);
		
	}

}
