package fr.aimcvent.velocity.api.command.constraint;

import com.velocitypowered.api.proxy.Player;
import fr.aimcvent.velocity.api.command.ArgumentConstraint;

public class ContainsConstraint implements ArgumentConstraint<String> {
    private final String contains;

    public ContainsConstraint(String contains) {
        this.contains = contains;
    }

    @Override
    public boolean accept(Player player, String type) {
        return type.contains(this.contains);
    }
}
