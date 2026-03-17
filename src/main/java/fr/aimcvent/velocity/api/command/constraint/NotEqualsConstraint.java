package fr.aimcvent.velocity.api.command.constraint;

import com.velocitypowered.api.proxy.Player;
import fr.aimcvent.velocity.api.command.ArgumentConstraint;

public class NotEqualsConstraint implements ArgumentConstraint<Object> {
    private final Object value;

    public NotEqualsConstraint(Object value) {
        this.value = value;
    }

    @Override
    public boolean accept(Player player, Object object) {
        return !this.value.equals(object);
    }
}
