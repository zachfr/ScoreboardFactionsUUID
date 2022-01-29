package com.zachfr.scoreboardfactionsuuid;

import com.massivecraft.factions.FPlayer;
import com.zachfr.scoreboardfactionsuuid.listeners.FPlayerJoinFactionListener;
import com.zachfr.scoreboardfactionsuuid.listeners.FPlayerLeaveFactionListener;
import com.zachfr.scoreboardfactionsuuid.listeners.PlayerJoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ScoreboardFactionsUUID extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new FPlayerJoinFactionListener(), this);
        getServer().getPluginManager().registerEvents(new FPlayerLeaveFactionListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
