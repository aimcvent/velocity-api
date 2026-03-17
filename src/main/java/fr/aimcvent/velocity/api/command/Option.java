package fr.aimcvent.velocity.api.command;

public interface Option {
    String name();

    boolean match(String name);
}
