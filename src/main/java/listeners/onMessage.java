package listeners;
import anisearch.*;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class onMessage extends ListenerAdapter {
    public void onMessage(MessageReceivedEvent event){
        if(event.getChannel().equals("915917819500199996")){
            search.findanime();
        }
    }
}
