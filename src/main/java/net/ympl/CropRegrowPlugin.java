package net.ympl;

import net.ympl.event.PluginEvents;
import org.bukkit.plugin.java.JavaPlugin;

public final class CropRegrowPlugin extends JavaPlugin {
    public static CropRegrowPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        saveDefaultConfig();
        // Plugin startup logic
        // getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new PluginEvents(), plugin);

        System.out.println("CROP REGROW PLUGIN SUCCESSFULLY STARTED!");
    }
}
