package fr.aimcvent.velocity.api.proxy;

import com.velocitypowered.api.proxy.Player;

public interface MessageBuilder {
    MessageBuilder channel(String channel);

    MessageBuilder player(Player player);

    MessageBuilder next(String data);

    Message build();
}
