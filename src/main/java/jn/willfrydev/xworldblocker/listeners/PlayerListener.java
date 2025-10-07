// Codigo hecho por xPlugins | WillfryDev
// ¿Eres nuevo? Esta es la clase de eventos, el oyente del plugin

package jn.willfrydev.xworldblocker.listeners;

import jn.willfrydev.xworldblocker.xWorldBlocker;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

import java.util.List;

public class PlayerListener implements Listener {

    private final xWorldBlocker plugin;

    public PlayerListener(xWorldBlocker plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerTeleport(PlayerTeleportEvent event) {
        Player player = event.getPlayer();
        if (event.getTo() == null || event.getTo().getWorld() == null) {
            return;
        }

        World destinationWorld = event.getTo().getWorld();
        String worldName = destinationWorld.getName();
        List<String> blockedWorlds = plugin.getConfig().getStringList("blocked-worlds");
        if (blockedWorlds.contains(worldName)) {

            String specificBypassPermission = "xworldblocker.bypass." + worldName;
            String globalBypassPermission = "xworldblocker.bypass.*";
            if (!player.hasPermission(specificBypassPermission) && !player.hasPermission(globalBypassPermission)) {

                event.setCancelled(true);
                String noPermissionMessage = plugin.getConfig().getString("messages.no-permission-entry", "");
                if (!noPermissionMessage.isEmpty()) {
                    player.sendMessage(xWorldBlocker.colorize(noPermissionMessage));
                }
            }
        }
    }
}
