package com.dumbdogdiner.disablejoinleave;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventListener implements Listener {
    @EventHandler (priority = EventPriority.HIGHEST)
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage("");
    }

    @EventHandler (priority = EventPriority.HIGHEST)
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage("");
    }
}
