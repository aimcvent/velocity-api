package fr.aimcvent.velocity.api.command.error;

import com.velocitypowered.api.proxy.Player;
import fr.aimcvent.kernel.api.Kernel;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.player.api.PlayerService;
import fr.aimcvent.velocity.api.command.ErrorArgumentMessage;

public class TranslationErrorArgumentMessage implements ErrorArgumentMessage {
    private final Kernel kernel;
    private final PlayerService playerService;
    private final Service service;
    private final String path;

    public TranslationErrorArgumentMessage(Kernel kernel, PlayerService playerService, Service service, String path) {
        this.kernel = kernel;
        this.playerService = playerService;
        this.service = service;
        this.path = path;
    }

    @Override
    public String apply(Player player, String input) {
        return this.kernel.translations()
            .of(this.service, this.path)
            .add("value", input)
            .translate(this.playerService.load(player.getUniqueId(), player.getUsername()).translation());
    }
}
