import java.util.ArrayList;
import java.util.List;

public class Guild {
    private List<Player> players = new ArrayList<>();

    public void register(String playerName, String playerRegionName, String playerRegionColor){
        Region region = RegionFactory.getRegion(playerRegionName, playerRegionColor);
        Player player = new Player(playerName, region);
        players.add(player);
    }

    public List<String> getPlayers(){
        List<String> output = new ArrayList<String>();

        for(Player player : players){
            output.add(player.getPlayer());
        }
        return output;
    }
}
