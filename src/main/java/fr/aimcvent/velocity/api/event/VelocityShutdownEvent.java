package fr.aimcvent.velocity.api.event;

import fr.aimcvent.kernel.api.event.Event;
import fr.aimcvent.velocity.api.VelocityService;

public record VelocityShutdownEvent(VelocityService velocityService) implements Event {
}
