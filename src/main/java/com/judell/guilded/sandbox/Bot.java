package com.judell.guilded.sandbox;

import io.guilded.lib.Client;
import io.guilded.lib.ClientBuilder;
import io.guilded.lib.objekt.EmbedBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.ConnectException;
import java.security.InvalidKeyException;

public class Bot {
    protected static Client bot;

    public static void main(String[] args) {
        try {
            bot = ClientBuilder.token(EnvironmentConstants.TOKEN)
                    .enableCommandSystem("/")
                    .registerCommand("about", (syntax, event) -> event.getMessage().reply()
                            .setEmbed(new EmbedBuilder()
                                    .setTitle("Bar Bot")
                                    .setDescription("For an incomparable byte taste")
                                    .setFooterText(event.getClient().getSelfUser().getName())
                                    .build())
                            .queue())
                    .registerCommand("menu", new Menu())
                    .addEventListeners(new Events())
                    .connectBlocking();
        } catch (ConnectException | InvalidKeyException connectException) {
            System.err.println("Error");
        }

        System.out.println(bot.getSelfUser().getName() + " is online");
    }
}
