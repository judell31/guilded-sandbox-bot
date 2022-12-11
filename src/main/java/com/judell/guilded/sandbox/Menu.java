package com.judell.guilded.sandbox;

import io.guilded.lib.events.message.MessageCreatedEvent;
import io.guilded.lib.objekt.Command;
import io.guilded.lib.objekt.CommandSyntax;
import io.guilded.lib.objekt.EmbedBuilder;

public class Menu implements Command {

    @Override
    public void onCommand(CommandSyntax commandSyntax, MessageCreatedEvent messageCreatedEvent) {
        messageCreatedEvent.getMessage().reply().setEmbed(new EmbedBuilder()
                        .setTitle("Card :receipt:")
                        .setDescription(x -> x
                                .a(":tropical_drink: Tropical Drink, Perfect after a round in the water in the Caribbean").newLine(2)
                                .a(":cocktail: Cocktail, Waved not thrown @00Wuff").newLine(2)
                                .a(":wine_glass: Wine Glass, What better than a day at a winery @Golden Retriever").newLine(2)
                                .a(":champagne: Champagne, Walkway? No thanks, here with good stuff and off to the park @Poodle").newLine(2)
                                .a(":tumbler_glass: Whisky, Cold outside, warm inside, drink inside but cold, logic @Huskey").newLine(2)
                                .a(":beer: 101 German Beer's [Per pot 1L], *Best regards German Shepherd Dog*").newLine(2)
                                .a(":tea: Tea, *There is nothing like a tea after the duck hunts or maybe the duck ?, @Labrador*").newLine(2)
                                .a(":glass_of_milk: Milk, Watch out and enjoy nature and a good drink ? German Shepherd Dog").newLine(2)
                                .a(":mate_drink: Mate Drink, Caribbean, Water, Sand, I think I made it @Havanese")
                        ).build())
                .queue();
    }
}
