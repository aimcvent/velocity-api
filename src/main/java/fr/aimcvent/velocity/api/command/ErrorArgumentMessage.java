package fr.aimcvent.velocity.api.command;

import com.velocitypowered.api.proxy.Player;

public interface ErrorArgumentMessage {
    String apply(Player player, String input);
}
