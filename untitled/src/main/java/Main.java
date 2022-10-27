
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        // Note: It is important to register your ReadyListener before building
        JDA jda = JDABuilder.createDefault("MTAzMjU2NDAxOTg0MTczNjcwNA.GFY3nV.S11ZbgSry7--pun8BsPwinAZqG8c9PoqvqIiU4")
                .setActivity(Activity.listening("To ure mom"))
                .build();
        // optionally block until JDA is ready
        jda.awaitReady();
    }
}
