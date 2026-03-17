package fr.aimcvent.velocity.api.message;

import java.util.UUID;

public interface MessageCache {
    UUID of(UUID from);

    void add(UUID from, UUID to);
}
