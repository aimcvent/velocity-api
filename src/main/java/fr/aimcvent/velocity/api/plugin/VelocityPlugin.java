package fr.aimcvent.velocity.api.plugin;

import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

public interface VelocityPlugin {
    ProxyServer server();

    Logger logger();
}
