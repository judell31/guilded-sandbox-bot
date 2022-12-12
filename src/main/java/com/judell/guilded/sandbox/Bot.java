package com.judell.guilded.sandbox;

import io.guilded.lib.Client;
import io.guilded.lib.ClientBuilder;

import java.net.ConnectException;
import java.security.InvalidKeyException;

public class Bot {
    protected static Client sandboxBot;

    public static void main(String[] args) {
        try {
            sandboxBot = ClientBuilder.token(EnvironmentConstants.TOKEN)
                    .enableCommandSystem(AppConstants.PREFIX)
                    .registerCommands(Commands.getCommands())
                    .addEventListeners(new EventController())
                    .connectBlocking();
        } catch (ConnectException | InvalidKeyException connectException) {
            System.out.println("Error");
        }

        System.out.println(sandboxBot.getSelfUser().getName() + " online");
    }
}
