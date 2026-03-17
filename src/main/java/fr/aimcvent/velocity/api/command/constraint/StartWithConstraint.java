package fr.aimcvent.velocity.api.command.constraint;

import com.velocitypowered.api.proxy.Player;
import fr.aimcvent.velocity.api.command.ArgumentConstraint;

public class StartWithConstraint implements ArgumentConstraint<String> {
    private final String startsWith;

    public StartWithConstraint(String startsWith) {
        this.startsWith = startsWith;
    }

    @Override
    public boolean accept(Player sender, String type) {
        return type.startsWith(this.startsWith);
    }
}
