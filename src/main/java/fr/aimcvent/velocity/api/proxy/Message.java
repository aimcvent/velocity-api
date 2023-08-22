package fr.aimcvent.velocity.api.proxy;

import com.velocitypowered.api.proxy.Player;

public interface Message {
    String channel();

    Player player();

    String[] output();
}
