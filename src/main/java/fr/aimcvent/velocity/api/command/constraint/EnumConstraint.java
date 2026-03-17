package fr.aimcvent.velocity.api.command.constraint;

import com.velocitypowered.api.proxy.Player;
import fr.aimcvent.velocity.api.command.ArgumentConstraint;

public class EnumConstraint implements ArgumentConstraint<String> {
    private final Class<? extends Enum<?>> enumClazz;

    public EnumConstraint(Class<? extends Enum<?>> enumClazz) {
        this.enumClazz = enumClazz;
    }

    @Override
    public boolean accept(Player player, String type) {
        for (Enum<?> value : this.enumClazz.getEnumConstants()) {
            if (value.name().equalsIgnoreCase(type)) {
                return true;
            }
        }
        return false;
    }
}
