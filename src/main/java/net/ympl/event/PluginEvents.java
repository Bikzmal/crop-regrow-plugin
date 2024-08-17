package net.ympl.event;

import net.ympl.CropRegrowPlugin;
import net.ympl.util.PluginUtilities;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class PluginEvents implements Listener {

    @EventHandler
    private void onCropBreak(BlockBreakEvent e) {
        Block b = e.getBlock();
        if (PluginUtilities.isCrop(b) && PluginUtilities.isGrown(b)) {
            int cd = CropRegrowPlugin.plugin.getConfig().getInt("crop-regrow-delay-ticks");

            World world = b.getWorld();
            Location blockLocation = b.getLocation();
            Material bType = b.getType();

            Bukkit.getScheduler().scheduleSyncDelayedTask(CropRegrowPlugin.plugin, () -> {
                world.getBlockAt(blockLocation).setType(bType);
            }, cd);
        }
    }
}
