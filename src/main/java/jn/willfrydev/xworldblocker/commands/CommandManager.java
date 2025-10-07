// Codigo hecho por xPlugins | WillfryDev
// ¿Eres nuevo? Esta es la clase de comandos, los comandos del plugin
// (Editable en config.yml)

package jn.willfrydev.xworldblocker.commands;

import jn.willfrydev.xworldblocker.xWorldBlocker;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.List;

public class CommandManager implements CommandExecutor {

    private final xWorldBlocker plugin;
    private final String ADMIN_PERMISSION = "xworldblocker.admin";

    public CommandManager(xWorldBlocker plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0 || args[0].equalsIgnoreCase("help")) {
            sendHelpMessage(sender);
            return true;
        }

        if (args[0].equalsIgnoreCase("reload")) {
            if (!sender.hasPermission(ADMIN_PERMISSION)) {
                String noPermsMsg = plugin.getConfig().getString("messages.no-permission-command", "");
                if (!noPermsMsg.isEmpty()) {
                    sender.sendMessage(xWorldBlocker.colorize(noPermsMsg));
                }
                return true;
            }

            plugin.reloadConfig();
            String reloadMsg = plugin.getConfig().getString("messages.reload", "");
            if (!reloadMsg.isEmpty()) {
                sender.sendMessage(xWorldBlocker.colorize(reloadMsg));
            }
            return true;
        }

        sendHelpMessage(sender);
        return true;
    }

    private void sendHelpMessage(CommandSender sender) {
        List<String> helpLines = plugin.getConfig().getStringList("messages.help");
        for (String line : helpLines) {
            sender.sendMessage(xWorldBlocker.colorize(line));
        }
    }
}
