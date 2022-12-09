package com.judell.guilded.sandbox;

import io.guilded.lib.events.EventListener;
import io.guilded.lib.events.message.MessageCreatedEvent;

public class Events implements EventListener {

    @Override
    public void onMessageCreated(MessageCreatedEvent event) {
        switch (event.getMessage().getContent().trim()) {
            case ":tropical_drink:" -> event.getMessage().addReactionEmote("90001594").queue();
            case ":cocktail:" -> event.getMessage().addReactionEmote("90001593").queue();
            case ":wine_glass:" -> event.getMessage().addReactionEmote("90001592").queue();
            case ":champagne:" -> event.getMessage().addReactionEmote("90001591").queue();
            case ":tumbler_glass:" -> event.getMessage().addReactionEmote("90001598").queue();
            case ":beer:" -> event.getMessage().addReactionEmote("90001595").queue();
            case ":tea:" -> event.getMessage().addReactionEmote("90001589").queue();
            case ":glass_of_milk:" -> event.getMessage().addReactionEmote("90001587").queue();
            case ":mate_drink:" -> event.getMessage().addReactionEmote("90003215").queue();
        }
    }
}
