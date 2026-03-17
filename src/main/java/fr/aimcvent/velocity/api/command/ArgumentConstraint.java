package fr.aimcvent.velocity.api.command;

import com.velocitypowered.api.proxy.Player;

public interface ArgumentConstraint<T> {
    boolean accept(Player sender, T type);
}
