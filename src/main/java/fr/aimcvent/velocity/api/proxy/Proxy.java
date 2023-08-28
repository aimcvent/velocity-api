package fr.aimcvent.velocity.api.proxy;

import java.util.List;
import java.util.Optional;

public interface Proxy {
    boolean isEnable();

    List<String> channels();

    MessageBuilder builder();

    void send(Message message);

    List<PluginMessageListener> of(String channel, String type);

    void register(PluginMessageListener pluginMessageListener);
}
