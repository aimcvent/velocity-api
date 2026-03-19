package fr.aimcvent.velocity.api.player;

import fr.aimcvent.player.api.Player;

import java.util.List;

public interface Players {
    List<Player> all();

    Player of(com.velocitypowered.api.proxy.Player player);
}
