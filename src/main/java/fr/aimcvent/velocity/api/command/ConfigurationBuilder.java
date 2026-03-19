package fr.aimcvent.velocity.api.command;

public interface ConfigurationBuilder {

    ConfigurationBuilder name(String name);

    ConfigurationBuilder description(String description);

    ConfigurationBuilder usage(String usage);

    ConfigurationBuilder permission(String permission);

    ConfigurationBuilder aliases(String... aliases);

    ArgumentBuilder argument();

    ArgumentBuilder chain(ArgumentBuilder... arguments);

    ConfigurationBuilder add(ArgumentBuilder... arguments);

    OptionBuilder option();

    ConfigurationBuilder add(OptionBuilder... options);

    Configuration build();
}
