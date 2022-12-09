package com.judell.guilded.sandbox;

import io.guilded.lib.events.message.MessageCreatedEvent;
import io.guilded.lib.objekt.Embed;
import io.guilded.lib.objekt.EmbedBuilder;

public class SandboxEmbedBuilder {

    public Embed createEmbed(String title, String description, MessageCreatedEvent messageCreatedEvent) {
        EmbedBuilder embedBuilder = new EmbedBuilder();

        embedBuilder.setTitle(title);
        embedBuilder.setDescription(description);
        embedBuilder.setFooterText(messageCreatedEvent.getClient().getSelfUser().getName());

        return  embedBuilder.build();
    }
}
