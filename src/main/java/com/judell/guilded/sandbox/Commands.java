package com.judell.guilded.sandbox;

import io.guilded.lib.objekt.Command;
import lombok.Getter;

import java.util.Collection;
import java.util.HashMap;

public class Commands {
    @Getter
    private final static HashMap<String, Command> commands = new HashMap<>();

    static {
        commands.put("menu", new Menu());
        commands.put("sb", new HelloWorld());
    }

    public static Command memberTriggerKeys(String mapKey){
        return commands.get(mapKey);
    }

    private static Collection<Command> memberTriggerValues(){
        return commands.values();
    }

    public static String memberTriggerKeyList(){
        return String.join("\n", (CharSequence) memberTriggerValues());
    }
}
