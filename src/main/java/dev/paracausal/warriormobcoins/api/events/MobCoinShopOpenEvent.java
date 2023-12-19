package dev.paracausal.warriormobcoins.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class MobCoinShopOpenEvent extends Event implements Cancellable {

    private boolean cancelled = false;
    private final Player player;

    public MobCoinShopOpenEvent(@NotNull final Player player) {
        this.player = player;
    }

    public Player getPlayer() { return player; }



    @Override public boolean isCancelled() { return cancelled; }
    @Override public void setCancelled(boolean cancelled) { this.cancelled = cancelled; }

    private static HandlerList HANDLERS = new HandlerList();
    public static HandlerList getHandlerList() { return HANDLERS; }
    @Override public HandlerList getHandlers() { return HANDLERS; }

}
