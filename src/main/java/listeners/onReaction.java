package listeners;

import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.Button;

public class onReaction extends ListenerAdapter {
    public void onMessageReactionAdd(MessageReactionAddEvent event){
        event.getChannel().editMessageById("861246334673747978", " ").setActionRow(Button.primary("1", "2")).queue();

    }
}
