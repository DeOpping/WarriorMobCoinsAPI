package dev.paracausal.warriormobcoins.api.coins;

import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.util.UUID;

public interface CoinManager {

    @NotNull BigDecimal balance(OfflinePlayer player);
    @NotNull BigDecimal balance(UUID uuid);

    @Nullable BigDecimal addBalance(@NotNull final OfflinePlayer player, @NotNull BigDecimal amount);
    @Nullable BigDecimal addBalance(@NotNull final UUID uuid, @NotNull BigDecimal amount);

    @Nullable BigDecimal removeBalance(@NotNull final OfflinePlayer player, @NotNull BigDecimal amount);
    @Nullable BigDecimal removeBalance(@NotNull final UUID uuid, @NotNull BigDecimal amount);

    @Nullable BigDecimal setBalance(@NotNull final OfflinePlayer player, @NotNull BigDecimal amount);
    @Nullable BigDecimal setBalance(@NotNull final UUID uuid, @NotNull BigDecimal amount);

}
