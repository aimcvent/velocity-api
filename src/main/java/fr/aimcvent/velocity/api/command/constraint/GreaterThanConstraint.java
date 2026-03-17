package fr.aimcvent.velocity.api.command.constraint;

import com.velocitypowered.api.proxy.Player;
import fr.aimcvent.velocity.api.command.ArgumentConstraint;

public class GreaterThanConstraint implements ArgumentConstraint<Number> {

    private final Class<? extends Number> type;
    private final Number value;

    public GreaterThanConstraint(Class<? extends Number> type, Number value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public boolean accept(Player player, Number number) {
        if (Byte.class.equals(this.type)) {
            return number.byteValue() > this.value.byteValue();
        }
        if (Short.class.equals(this.type)) {
            return number.shortValue() > this.value.shortValue();
        }
        if (Integer.class.equals(this.type)) {
            return number.intValue() > this.value.intValue();
        }
        if (Long.class.equals(this.type)) {
            return number.longValue() > this.value.longValue();
        }
        if (Float.class.equals(this.type)) {
            return number.floatValue() > this.value.floatValue();
        }
        return number.doubleValue() > this.value.doubleValue();
    }
}
