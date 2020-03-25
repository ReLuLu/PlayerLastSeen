package de.relulu.PlayerLastSeen;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * This class handles the usage of the /lastseen command.
 */
public class CommandLastSeen implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String comname, String[] comparams) {

        // lets make it non-functional from console because why not
        if (sender instanceof Player) {

            Player p = (Player)sender;

            // command without parameter (no player name provided)
            if (comparams.length < 1) {
                p.sendMessage("Keinen Spielernamen angegeben!");
            }

            // command with exactly one parameter (a single player name provided)
            if (comparams.length == 1) {
                OfflinePlayer offp = getOfflinePlayerLocally(comparams[0]);



                        p.sendMessage("");
            }

            // sender is not a player
        } else {
            sender.sendMessage("Kein Konsolenbefehl!");
        }
        return true;
    }

    /**
     * Grabs the offline player using the server's user logs.
     * Might have inaccurate names as they only update on server join.
     * @param playername the player name
     * @return
     */
    private OfflinePlayer getOfflinePlayerLocally(String playername) {
        OfflinePlayer[] offps = Bukkit.getOfflinePlayers();
        for (OfflinePlayer offp : offps) {

        }
    }

    /*
    // useless overhead for simple stuff
    private void fillTabComplete() {

        String name;

        Bukkit.getOnlinePlayers();

        // put names from offline players in a list -> not so clever with huge amounts of players
        // but will fit for private server usage
        OfflinePlayer[] offlinePlayers = Bukkit.getOfflinePlayers();
        List<String> playernames = new ArrayList<>();
        for(OfflinePlayer offp : offlinePlayers) {
            playernames.add(offp.getName());
        }
    }
    */
}