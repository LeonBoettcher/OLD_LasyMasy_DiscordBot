package main;

import listeners.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


import javax.security.auth.login.LoginException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Scanner;

public class main extends ListenerAdapter {

    public static boolean supportmove = true;
    public static long uptimeInSeconds = 0;
    public static long numberOfHours = 0;
    public static long numberOfMinutes = 0;
    public static long numberOfSeconds = 0;


    public static void main(String[] args) throws LoginException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                   RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
                    long uptime = runtimeMXBean.getUptime();
                    uptimeInSeconds = uptime / 1000;
                    numberOfHours = uptimeInSeconds / (60 * 60);
                    numberOfMinutes = (uptimeInSeconds / 60) - (numberOfHours * 60);
                    numberOfSeconds = uptimeInSeconds % 60;
                    //System.out.println("Runtime: [" + numberOfHours + ":" + numberOfMinutes + ":" + numberOfSeconds + "]");}
            }}
        });


        String token = "Njc2NzExNzk1NzY2OTg0NzA1.XkJq-A.N2yYeli0At2H7RuqOtKzVQdZ1Mk";
        String activity = " ";

        JDA jda = JDABuilder.createDefault(token).
                setActivity(Activity.playing("HI")).addEventListeners(new onMessage(),new onReaction(), new onSlashCommand(), new onButtonclick(), new onVoiceJoin(), new onready()).build();

        //jda.upsertCommand("ping", "nothing spezial" ).queue();
        //jda.upsertCommand("support", "Einstellung am Support Channel").addOption(OptionType.INTEGER, "movetime", "Zeit bis zum Move").queue();
        //jda.upsertCommand("play", "Spielt ein Musik in deinem Voicechannel ab").addOption(OptionType.STRING, "link", "Link der Musik/Playlist").queue();
        //jda.upsertCommand("uptime" , "Erhalte die Zeit seitdem der Bot aktiv ist.").queue();


        thread.start();
        while(true){
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if(input.equals("uptime")){
                System.out.println("\u001B[41m" + "Runtime: [" + numberOfHours + ":" + numberOfMinutes + ":" + numberOfSeconds + "]");
            }
        }
    }
}

