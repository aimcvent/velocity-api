package fr.aimcvent.velocity.api.command.constraint;

import com.velocitypowered.api.proxy.Player;
import fr.aimcvent.velocity.api.command.ArgumentConstraint;

public class RangeConstraint implements ArgumentConstraint<Number> {
    private final Class<? extends Number> type;
    private final Number min;
    private final Number max;


    public RangeConstraint(Class<? extends Number> type, Number min, Number max) {
        this.type = type;
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean accept(Player player, Number number) {
        if (Byte.class.equals(this.type)) {
            return this.min.byteValue() >= number.byteValue() && this.max.byteValue() <= number.byteValue();
        }
        if (Short.class.equals(this.type)) {
            return this.min.shortValue() >= number.shortValue() && this.max.shortValue() <= number.shortValue();
        }
        if (Integer.class.equals(this.type)) {
            return this.min.intValue() >= number.intValue() && this.max.intValue() <= number.intValue();
        }
        if (Long.class.equals(this.type)) {
            return this.min.longValue() >= number.longValue() && this.max.longValue() <= number.longValue();
        }
        if (Float.class.equals(this.type)) {
            return this.min.floatValue() >= number.floatValue() && this.max.floatValue() <= number.floatValue();
        }
        return this.min.doubleValue() >= number.doubleValue() && this.max.doubleValue() <= number.doubleValue();
    }
}
