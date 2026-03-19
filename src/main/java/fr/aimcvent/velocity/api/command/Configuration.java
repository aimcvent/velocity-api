package fr.aimcvent.velocity.api.command;

import java.util.List;

public interface Configuration {
    String name();

    String description();

    String usage();

    String permission();

    String[] aliases();

    List<Argument> arguments();

    List<Option> options();
}
