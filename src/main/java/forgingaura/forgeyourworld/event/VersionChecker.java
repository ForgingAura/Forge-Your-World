package forgingaura.forgeyourworld.event;

import alasdiablo.core.util.UpdateChecker;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class VersionChecker {

	@SubscribeEvent
	public void onPlayerJoinEvent(PlayerLoggedInEvent event) {
		UpdateChecker.checkForUpdate(MainHandler.VERSION_CHECKER_URL, MainHandler.MODID, MainHandler.VERSION, event.player);
	}

}
