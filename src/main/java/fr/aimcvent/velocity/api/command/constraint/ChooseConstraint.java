package fr.aimcvent.velocity.api.command.constraint;

import com.velocitypowered.api.proxy.Player;
import fr.aimcvent.velocity.api.command.ArgumentConstraint;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ChooseConstraint implements ArgumentConstraint<String> {
    private final Set<String> values = new HashSet<>();

    public ChooseConstraint(String... values) {
        this.values.addAll(Arrays.asList(values));
    }

    @Override
    public boolean accept(Player player, String type) {
        return this.values.contains(type);
    }
}
