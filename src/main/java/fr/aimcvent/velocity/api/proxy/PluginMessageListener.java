package fr.aimcvent.velocity.api.proxy;

import com.velocitypowered.api.proxy.messages.ChannelMessageSink;

public interface PluginMessageListener {
    String channel();

    String type();

    void execute(ChannelMessageSink channelMessageSink, String[] args);
}
