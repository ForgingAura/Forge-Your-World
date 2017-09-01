package forgingaura.forgeyourworld.proxy;

import forgingaura.forgeyourworld.event.VersionChecker;
import forgingaura.forgeyourworld.handler.BlocksHandler;
import forgingaura.forgeyourworld.handler.FuelHandler;
import forgingaura.forgeyourworld.handler.ItemsHandler;
import forgingaura.forgeyourworld.handler.OreDictinaryHandler;
import forgingaura.forgeyourworld.handler.OreGenerationHandler;
import forgingaura.forgeyourworld.handler.RecipeHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy implements CommonProxy{
	
	@Override
	public void preInit() {
		ItemsHandler.init();
		System.out.println("[Forge Your World/CLIENT]Item Init Done");
		ItemsHandler.register();
		System.out.println("[Forge Your World/CLIENT]Item Register Done");
		System.out.println("[Forge Your World/CLIENT]Item Done");
		BlocksHandler.init();
		System.out.println("[Forge Your World/CLIENT]Block Init Done");
		BlocksHandler.register();
		System.out.println("[Forge Your World/CLIENT]Block Register Done");
		System.out.println("[Forge Your World/CLIENT]Block Done");
	}

	@Override
	public void init() {
		ItemsHandler.registerRenders();
		System.out.println("[Forge Your World/CLIENT]Items Renders Done");
		BlocksHandler.registerRenders();
		System.out.println("[Forge Your World/CLIENT]Blocks Renders Done");
		MinecraftForge.EVENT_BUS.register(new VersionChecker());
		System.out.println("[Forge Your World/CLIENT]Update Chercker Done");
		OreDictinaryHandler.registerOreDictionary();
		System.out.println("[Forge Your World/CLIENT]Ore Dictionary Done");
		RecipeHandler.register();
		System.out.println("[Forge Your World/CLIENT]Recipe Done");
		GameRegistry.registerWorldGenerator(new OreGenerationHandler(), 0);
		System.out.println("[Forge Your World/CLIENT]Ore Generation Done");
		GameRegistry.registerFuelHandler(new FuelHandler());
		System.out.println("[Forge Your World/CLIENT]Fuel Done");
	}

}
