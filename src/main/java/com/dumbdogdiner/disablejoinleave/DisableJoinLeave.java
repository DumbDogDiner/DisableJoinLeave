package com.dumbdogdiner.disablejoinleave;

import org.bukkit.plugin.java.JavaPlugin;

public class DisableJoinLeave extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        getLogger().info("DisableJoinLeave enabled successfully");
    }

    @Override
    public void onDisable() {
        getLogger().info("DisableJoinLeave disabled");
    }
}
