package fr.aimcvent.velocity.api.command;

import com.velocitypowered.api.proxy.Player;

public interface PermissionCommand {
    boolean accept(Player player);
}
