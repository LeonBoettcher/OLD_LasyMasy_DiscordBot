package listeners;

import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class onSlashCommand extends ListenerAdapter {
    public void onSlashCommand(SlashCommandEvent event){

        System.out.println("SLash Command");

        if(event.getName().equals("ping")) {
            event.deferReply().queue();
            System.out.println("SLash command detected");
            event.getHook().sendMessage("Pong").queue();
        }

        if(event.getName().equals("uptime")) {
            event.deferReply().queue();;
            event.getHook().sendMessage("Runtime: [" + main.main.numberOfHours + ":" + main.main.numberOfMinutes + ":" + main.main.numberOfSeconds + "]").queue();

        }
    }
}
