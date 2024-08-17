package net.ympl.util;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.block.data.Ageable;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.TNTPrimed;

import java.util.ArrayList;
import java.util.List;

public class PluginUtilities {
    public static boolean isCrop(Block b) {
        Material m = b.getType();
        return (m == Material.BEETROOTS || m == Material.WHEAT || m == Material.NETHER_WART || m == Material.CARROTS || m == Material.POTATOES);
    }

    public static boolean isGrown(Block b) {
        Ageable ageable = (Ageable) b.getBlockData();
        return ageable.getAge() == ageable.getMaximumAge();
    }
}
