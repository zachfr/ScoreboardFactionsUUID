package com.zachfr.scoreboardfactionsuuid.listeners;

import com.infiniteplugins.infinitescoreboard.api.InfiniteScoreboardAPI;
import com.massivecraft.factions.event.FPlayerJoinEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class FPlayerJoinFactionListener implements Listener {
    @EventHandler
    public void onFPlayerJoinFaction(FPlayerJoinEvent event) {
        InfiniteScoreboardAPI.showScoreboard(event.getfPlayer().getPlayer(), "faction");
    }
}
