package fr.aimcvent.velocity.api.command.constraint;

import com.velocitypowered.api.proxy.Player;
import fr.aimcvent.velocity.api.command.ArgumentConstraint;

public class RegexConstraint implements ArgumentConstraint<String> {
    private final String regex;

    public RegexConstraint(String regex) {
        this.regex = regex;
    }

    @Override
    public boolean accept(Player player, String value) {
        return value.matches(this.regex);
    }
}
