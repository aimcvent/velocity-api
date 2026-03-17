package fr.aimcvent.velocity.api.command;

public interface ArgumentBuilder {
    ArgumentBuilder name(String name);

    ArgumentBuilder converter(String converter);

    ArgumentBuilder errorMessage(ErrorArgumentMessage errorMessage);

    <T> ArgumentBuilder constraints(ArgumentConstraint<T>... constraints);

    ArgumentBuilder append(ArgumentBuilder... arguments);

    Argument build();
}
