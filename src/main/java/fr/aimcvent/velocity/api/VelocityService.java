package fr.aimcvent.velocity.api;

import com.velocitypowered.api.proxy.ProxyServer;
import fr.aimcvent.kernel.api.configuration.WithConfiguration;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.velocity.api.plugin.VelocityPlugin;
import fr.aimcvent.velocity.api.proxy.Proxy;

public interface VelocityService extends Service, WithConfiguration {
    VelocityPlugin plugin();
    ProxyServer server();
    Proxy proxy();
}
