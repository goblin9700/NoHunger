package nohunger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;


public class HungryLevel implements Listener{
	private int x;

	@EventHandler
	public void hungryLevelStop(FoodLevelChangeEvent event) {
		x = event.getFoodLevel();
		if (x < 20 ) {
			event.setFoodLevel(20);
		}else{
			event.setCancelled(true);
		}
	}

}


