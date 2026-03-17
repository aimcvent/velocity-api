package fr.aimcvent.velocity.api.command;

import com.velocitypowered.api.proxy.Player;

public interface Executor {
    void configuration(ConfigurationBuilder configuration);

    boolean execute(Player player, Input input);
}
