package listeners;

import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Timer;
import java.util.TimerTask;

public class onready extends ListenerAdapter {
    public void onReady(ReadyEvent event) {
        System.out.println("Bot is ready and logged");

        Timer timer = new Timer();
        timer.schedule( new TimerTask()
        {
            public void run() {
                event.getJDA().getPresence().setActivity(Activity.listening("Online seit " + main.main.numberOfHours + " Stunden " + main.main.numberOfMinutes + " Minuten"));
            }
        }, 0, 60*(1000*1));
    }
}
