package dev.paracausal.warriormobcoins.api;

import dev.paracausal.warriormobcoins.api.actions.ActionManager;
import dev.paracausal.warriormobcoins.api.coins.CoinManager;

public interface MobCoinsAPI {

    CoinManager coinManager();
    ActionManager actionManager();

}
