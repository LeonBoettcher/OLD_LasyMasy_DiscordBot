package listeners;

import main.main;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.util.Date;

public class onVoiceJoin extends ListenerAdapter {
    @Override
    public void onGuildVoiceJoin(GuildVoiceJoinEvent event) {
        {
            if (event.getChannelJoined().getId().equals("666654205481713686")){

                EmbedBuilder eb = new EmbedBuilder();
                eb.setColor(Color.ORANGE);
                eb.setImage(event.getMember().getAvatarUrl());
                eb.setTitle("User joined Voice Support");
                eb.setDescription(event.getMember().getAsMention() + " (" + event.getMember().getNickname() + ") just joined the voice support waiting channel !" + event.getGuild().getRoleById("672850388382384140").getAsMention());
                eb.setAuthor("[" + new Date() + "]");

                if(main.supportmove == false){
                    event.getGuild().getTextChannelById("661156340735016979").sendMessage(eb.build()).queue();
                }else{
                    eb.setColor(Color.GREEN);
                    eb.setDescription(event.getMember().getAsMention() + " just joined the voice support waiting channel and was automaticly moved by the system!");
                    event.getGuild().getTextChannelById("661156340735016979").sendMessage(eb.build()).queue();
                }
            }
            if (main.supportmove == true)
                if (event.getChannelJoined().getId().equals("666654205481713686")) {
                    System.out.println("[" + new Date() + "] User " + event.getMember() + " ist dem Support beigetreten");
                    event.getGuild().moveVoiceMember(event.getMember(), event.getGuild().getVoiceChannelById("660959050275749951")).queue();
                }
        }
    }
}