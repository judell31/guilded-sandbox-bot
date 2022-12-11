package com.judell.guilded.sandbox;

import io.guilded.lib.events.message.MessageCreatedEvent;
import io.guilded.lib.objekt.Command;
import io.guilded.lib.objekt.CommandSyntax;

public class HelloWorld implements Command {

    @Override
    public void onCommand(CommandSyntax commandSyntax, MessageCreatedEvent messageCreatedEvent) {
        SandboxEmbedBuilder sandboxEmbedBuilder = new SandboxEmbedBuilder();

        messageCreatedEvent.getMessage().reply().setEmbed(
                sandboxEmbedBuilder.createEmbed(
                        "Hello World",
                        "Hello!!!",
                        messageCreatedEvent
                )
        ).queue();
    }
}
