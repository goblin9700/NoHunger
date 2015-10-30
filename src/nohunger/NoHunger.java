package nohunger;

import org.bukkit.plugin.java.JavaPlugin;

public class NoHunger extends JavaPlugin {
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new HungryLevel(), this);		
	}
	public void onDisable() {
		
	}
	
}
