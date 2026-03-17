package fr.aimcvent.velocity.api.command;

import java.util.List;

public interface Argument {
    String name();

    String converter();

    ErrorArgumentMessage errorMessage();

    List<ArgumentConstraint<?>> constraints();

    List<Argument> children();
}
