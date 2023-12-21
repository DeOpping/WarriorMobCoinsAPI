package dev.paracausal.warriormobcoins.api.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.math.BigDecimal;

public class MobCoinDropEvent extends Event implements Cancellable {

    private boolean cancelled = false;
    private final Player player;
    private final Entity mob;
    private BigDecimal amountDropped;

    public MobCoinDropEvent(final Player player, final Entity mob, final BigDecimal amountDropped) {
        this.player = player;
        this.mob = mob;
        this.amountDropped = amountDropped;
    }

    public Player getPlayer() { return player; }
    public Entity getMob() { return mob; }

    public BigDecimal amount() { return amountDropped; }

    public void setAmount(final BigDecimal amount) { amountDropped = amount; }
    public void setAmount(final double amount) { amountDropped = BigDecimal.valueOf(amount); }

    public void addAmount(final BigDecimal amount) { amountDropped = amountDropped.add(amount); }
    public void addAmount(final double amount) {
        amountDropped = amountDropped.add(BigDecimal.valueOf(amount));
    }

    public void removeAmount(final BigDecimal amount) { amountDropped = amountDropped.subtract(amount); }
    public void removeAmount(final double amount) {
        amountDropped = amountDropped.subtract(BigDecimal.valueOf(amount));
    }

    public void multiplyAmount(final BigDecimal multiplier) { amountDropped = amountDropped.multiply(multiplier); }
    public void multiplyAmount(final double multiplier) {
        amountDropped = amountDropped.multiply(BigDecimal.valueOf(multiplier));
    }



    @Override public boolean isCancelled() { return cancelled; }
    @Override public void setCancelled(boolean cancelled) { this.cancelled = cancelled; }

    private static HandlerList HANDLERS = new HandlerList();
    public static HandlerList getHandlerList() { return HANDLERS; }
    @Override public HandlerList getHandlers() { return HANDLERS; }

}
