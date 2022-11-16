import java.util.HashMap;
import java.util.Map;

public class RegionFactory {
    private static Map<String, Region> regions = new HashMap<>();

    public static Region getRegion(String name, String color) {
        Region region = regions.get(name);
        if(region == null){
            region = new Region(name, color);
            regions.put(name, region);
        }
        return region;
    }

    public static int getTotalRegions(){
        return regions.size();
    }
}
