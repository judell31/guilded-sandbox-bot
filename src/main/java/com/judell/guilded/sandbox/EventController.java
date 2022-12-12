package com.judell.guilded.sandbox;

import io.guilded.lib.events.EventListener;
import io.guilded.lib.events.message.MessageCreatedEvent;

public class EventController implements EventListener {

    @Override
    public void onMessageCreated(MessageCreatedEvent messageCreatedEvent) {
        switch (messageCreatedEvent.getMessage().getContent().trim()) {
            case ":tropical_drink:" -> messageCreatedEvent.getMessage().addReactionEmote("90001594").queue();
            case ":cocktail:" -> messageCreatedEvent.getMessage().addReactionEmote("90001593").queue();
            case ":wine_glass:" -> messageCreatedEvent.getMessage().addReactionEmote("90001592").queue();
            case ":champagne:" -> messageCreatedEvent.getMessage().addReactionEmote("90001591").queue();
            case ":tumbler_glass:" -> messageCreatedEvent.getMessage().addReactionEmote("90001598").queue();
            case ":beer:" -> messageCreatedEvent.getMessage().addReactionEmote("90001595").queue();
            case ":tea:" -> messageCreatedEvent.getMessage().addReactionEmote("90001589").queue();
            case ":glass_of_milk:" -> messageCreatedEvent.getMessage().addReactionEmote("90001587").queue();
            case ":mate_drink:" -> messageCreatedEvent.getMessage().addReactionEmote("90003215").queue();
        }
    }
}
