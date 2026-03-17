package fr.aimcvent.velocity.api.command.constraint;

import com.velocitypowered.api.proxy.Player;
import fr.aimcvent.velocity.api.command.ArgumentConstraint;

public class EndWithConstraint implements ArgumentConstraint<String> {
    private final String endsWith;

    public EndWithConstraint(String endsWith) {
        this.endsWith = endsWith;
    }

    @Override
    public boolean accept(Player player, String type) {
        return type.endsWith(this.endsWith);
    }
}
