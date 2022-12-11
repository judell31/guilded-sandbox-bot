package com.judell.guilded.sandbox;

import io.guilded.lib.Client;
import io.guilded.lib.ClientBuilder;

import java.net.ConnectException;
import java.security.InvalidKeyException;

public class Bot {
    protected static Client bot;

    public static void main(String[] args) {
        try {
            bot = ClientBuilder.token(EnvironmentConstants.TOKEN)
                    .enableCommandSystem(AppConstants.PREFIX)
                    .addEventListeners(new EventController())
                    .connectBlocking();
        } catch (ConnectException | InvalidKeyException connectException) {
            System.out.println("Error");
        }

        System.out.println(bot.getSelfUser().getName() + " is online");
    }
}
