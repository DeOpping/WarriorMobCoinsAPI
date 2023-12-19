package dev.paracausal.warriormobcoins.api.actions;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface ActionManager {

    /**
     * Registers the input action.<br>
     * This method does not need to be run manually.
     * @param action Action
     */
    void register(@NotNull final Action action);

    @NotNull List<Action> actions();

    @NotNull List<String> actionIDs();

    boolean exists(@NotNull final String id);

    @Nullable Action get(@NotNull final String id);

    @Nullable Action fromCommandLine(@NotNull final String commandLine);

    @NotNull String replaceCommandLine(@NotNull final String commandLine);

}
