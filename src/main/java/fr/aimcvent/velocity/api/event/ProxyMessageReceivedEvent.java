package fr.aimcvent.velocity.api.event;

import com.velocitypowered.api.proxy.messages.ChannelMessageSink;
import fr.aimcvent.kernel.api.event.Event;

import java.util.Arrays;

public class ProxyMessageReceivedEvent implements Event {
    private final String channel;
    private final ChannelMessageSink channelMessageSink;

    private final String[] input;

    public ProxyMessageReceivedEvent(String channel, ChannelMessageSink channelMessageSink, String[] input) {
        this.channel = channel;
        this.channelMessageSink = channelMessageSink;
        this.input = input;
    }

    public String channel() {
        return this.channel;
    }

    public ChannelMessageSink channelMessageSink() {
        return this.channelMessageSink;
    }

    public String[] input() {
        return Arrays.copyOfRange(this.input, 0, this.input.length);
    }
}
