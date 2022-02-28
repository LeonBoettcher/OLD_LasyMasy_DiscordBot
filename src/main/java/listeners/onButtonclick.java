package listeners;

import main.main;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.ButtonClickEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.Button;

import java.awt.*;

public class onButtonclick extends ListenerAdapter {
    public void onButtonClick(ButtonClickEvent event){



        if(event.getChannel().getId().equals("861190182736232448")){
            if(event.getMessageId().equals("861246334673747978")){

                EmbedBuilder eb = new EmbedBuilder();

                eb.setAuthor(" ");
                eb.setImage(event.getGuild().getMemberById("435459451739308033").getAvatarUrl());


                if(main.supportmove == false) {

                    eb.setColor(Color.GREEN);
                    eb.setTitle("Automove Warten -> Support");
                    eb.setDescription("✅");
                    event.getMessage().editMessage(eb.build()).setActionRow(Button.success("move-on", "on").asDisabled(),Button.danger("move-off", "off").asEnabled()).queue();
                    event.deferEdit().queue();
                    main.supportmove = true;
                    System.out.println("SupportMove = " + main.supportmove);

                }else{

                    eb.setColor(Color.RED);
                    eb.setTitle("Automove Warten -> Support");
                    eb.setDescription(":x:");
                    event.getMessage().editMessage(eb.build()).setActionRow(Button.success("move-on", "on").asEnabled(),Button.danger("move-off", "off").asDisabled()).queue();
                    event.deferEdit().queue();
                    main.supportmove = false;
                    System.out.println("SupportMove = " + main.supportmove);
                }
            }
        }

    }
}
