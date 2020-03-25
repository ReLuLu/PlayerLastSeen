package de.relulu.PlayerLastSeen;

import java.io.File;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hauptklasse für das Plugin.
 * 
 * @author ReLuLu
 *
 */
public class LastSeenInit extends JavaPlugin {

	private PluginDescriptionFile 	pdf = getDescription(); //damit nicht immer via getDescription was abgerufen wird
	
	/**
	 * Abstrakte Methode von JavaPlugin, wird beim Einschalten des Plugins ausgeführt.
	 */
	@Override
	public void onEnable() {
        this.getCommand("lastseen").setExecutor(null);
        this.getCommand("firstseen").setExecutor(null);
    	getLogger().info(pdf.getName() + " version " + pdf.getVersion() + " by " + pdf.getAuthors().get(0) + " enabled! :)");
	}
	
    /**
     * Abstrakte Methode von JavaPlugin, wird ausgeführt, wenn das Plugin deaktiviert wird.
     */
	@Override
	public void onDisable() {
		getLogger().info(pdf.getName() + " version " + pdf.getVersion() + " disabled! :C");
	}

}
