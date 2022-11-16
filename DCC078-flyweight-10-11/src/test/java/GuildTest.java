import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GuildTest {

    @Test
    void shouldBeReturnPlayers() {
        Guild guild =  new Guild();
        guild.register("cross", "North", "Red");
        guild.register("megaBoss", "South", "Green");
        guild.register("crash", "East", "Black");

        List<String> output = Arrays.asList(
                "Player{nome ='cross', region origin name ='North', region origin color ='Red'}",
                "Player{nome ='megaBoss', region origin name ='South', region origin color ='Green'}",
                "Player{nome ='crash', region origin name ='East', region origin color ='Black'}"
        );

        assertEquals(output, guild.getPlayers());
    }

    @Test
    void shouldBeReturnTotalRegions() {
        Guild guild = new Guild();
        guild.register("cross", "North", "Red");
        guild.register("megaBoss", "South", "Green");
        guild.register("crash", "South", "Green");
        guild.register("monster", "East", "Black");
        guild.register("fox", "East", "Black");
        guild.register("btt", "West", "Purple");

        assertEquals(4, RegionFactory.getTotalRegions());
    }
}