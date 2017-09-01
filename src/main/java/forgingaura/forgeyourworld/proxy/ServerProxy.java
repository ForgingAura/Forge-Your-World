package forgingaura.forgeyourworld.proxy;

import forgingaura.forgeyourworld.handler.BlocksHandler;
import forgingaura.forgeyourworld.handler.FuelHandler;
import forgingaura.forgeyourworld.handler.ItemsHandler;
import forgingaura.forgeyourworld.handler.OreDictinaryHandler;
import forgingaura.forgeyourworld.handler.OreGenerationHandler;
import forgingaura.forgeyourworld.handler.RecipeHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ServerProxy implements CommonProxy{
	
	@Override
	public void preInit() {
		ItemsHandler.init();
		System.out.println("[Forge Your World/SERVER]Item Init Done");
		ItemsHandler.register();
		System.out.println("[Forge Your World/SERVER]Item Register Done");
		System.out.println("[Forge Your World/SERVER]Item Done");
		BlocksHandler.init();
		System.out.println("[Forge Your World/SERVER]Block Init Done");
		BlocksHandler.register();
		System.out.println("[Forge Your World/SERVER]Block Register Done");
		System.out.println("[Forge Your World/SERVER]Block Done");
	}
	
	@Override
	public void init() {
		OreDictinaryHandler.registerOreDictionary();
		System.out.println("[Forge Your World/SERVER]Ore Dictionary Done");
		RecipeHandler.register();
		System.out.println("[Forge Your World/SERVER]Recipe Done");
		GameRegistry.registerWorldGenerator(new OreGenerationHandler(), 0);
		System.out.println("[Forge Your World/SERVER]Ore Generation Done");
		GameRegistry.registerFuelHandler(new FuelHandler());
		System.out.println("[Forge Your World/SERVER]Fuel Done");
	}

}
