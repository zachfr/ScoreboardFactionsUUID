package com.zachfr.scoreboardfactionsuuid.listeners;

import com.infiniteplugins.infinitescoreboard.api.InfiniteScoreboardAPI;
import com.massivecraft.factions.event.FPlayerLeaveEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class FPlayerLeaveFactionListener implements Listener {
    @EventHandler
    public void onFPlayerLeaveFaction(FPlayerLeaveEvent event) {
        InfiniteScoreboardAPI.showScoreboard(event.getfPlayer().getPlayer(), "faction_none");
    }
}
