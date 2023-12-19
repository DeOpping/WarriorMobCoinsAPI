package dev.paracausal.warriormobcoins.api.actions;

import dev.paracausal.warriormobcoins.api.MobCoinsAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public abstract class Action {

    private final String id;

    public Action(@NotNull final String id) {
        this.id = id;
        final MobCoinsAPI api = (MobCoinsAPI) Bukkit.getPluginManager().getPlugin("WarriorMobCoins");
        if (api != null) api.actionManager().register(this);
    }

    public String id() { return id; }

    public abstract void run(@NotNull final Player player, @NotNull final String commandLine);

}
