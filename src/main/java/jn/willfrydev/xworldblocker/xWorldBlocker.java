// Codigo hecho por xPlugins | WillfryDev
// ¿Eres nuevo? Esta es la clase pricipal, la base del plugin

package jn.willfrydev.xworldblocker;

import jn.willfrydev.xworldblocker.commands.CommandManager;
import jn.willfrydev.xworldblocker.listeners.PlayerListener;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class xWorldBlocker extends JavaPlugin {

    private static final Pattern HEX_PATTERN = Pattern.compile("&#([A-Fa-f0-9]{6})");

    @Override
    public void onEnable() {

        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
        getCommand("xworldblocker").setExecutor(new CommandManager(this));

        ConsoleCommandSender console = Bukkit.getConsoleSender();
        console.sendMessage(colorize("&#A2E4B8[xWorldBlocker] &#C1FFD7Plugin activado. Creado por WillfryDev."));
    }

    @Override
    public void onDisable() {
        ConsoleCommandSender console = Bukkit.getConsoleSender();
        console.sendMessage(colorize("&#FFB6C1[xWorldBlocker] &#FFDDC1Plugin desactivado."));
    }

    public static String colorize(String message) {
        if (message == null || message.isEmpty()) {
            return "";
        }

        Matcher matcher = HEX_PATTERN.matcher(message);
        StringBuffer buffer = new StringBuffer();

        while (matcher.find()) {
            try {
                matcher.appendReplacement(buffer, ChatColor.of("#" + matcher.group(1)).toString());
            } catch (Exception e) {

            }
        }
        matcher.appendTail(buffer);
        return ChatColor.translateAlternateColorCodes('&', buffer.toString());
    }
}
