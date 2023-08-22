package fr.aimcvent.velocity.api.proxy;

import java.util.List;

public interface Proxy {
    boolean isEnable();

    List<String> channels();

    MessageBuilder builder();

    void send(Message message);
}
