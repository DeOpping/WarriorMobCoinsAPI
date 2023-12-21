package dev.paracausal.warriormobcoins.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class MobCoinRedeemEvent extends Event implements Cancellable {

    private boolean cancelled = false;
    private final Player player;
    private final BigDecimal amountRedeemed;

    public MobCoinRedeemEvent(@NotNull final Player player, @NotNull final BigDecimal amountRedeemed) {
        this.player = player;
        this.amountRedeemed = amountRedeemed;
    }

    public Player getPlayer() { return player; }

    public BigDecimal getAmount() { return amountRedeemed; }



    @Override public boolean isCancelled() { return cancelled; }
    @Override public void setCancelled(boolean cancelled) { this.cancelled = cancelled; }

    private static HandlerList HANDLERS = new HandlerList();
    public static HandlerList getHandlerList() { return HANDLERS; }
    @Override public HandlerList getHandlers() { return HANDLERS; }

}
