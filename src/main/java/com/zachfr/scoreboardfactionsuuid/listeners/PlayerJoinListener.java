package com.zachfr.scoreboardfactionsuuid.listeners;

import com.infiniteplugins.infinitescoreboard.InfiniteScoreboard;
import com.infiniteplugins.infinitescoreboard.api.InfiniteScoreboardAPI;
import com.massivecraft.factions.FPlayer;
import com.massivecraft.factions.FPlayers;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("ScoreboardFactionsUUID"), () -> {
                    FPlayer fPlayer = FPlayers.getInstance().getByPlayer(event.getPlayer());
                    if(fPlayer.getFaction().getId().equalsIgnoreCase("0"))
                        InfiniteScoreboardAPI.showScoreboard(event.getPlayer(), "faction_none");
                    else
                        InfiniteScoreboardAPI.showScoreboard(event.getPlayer(), "faction");
                }, 20L);
    }
}
