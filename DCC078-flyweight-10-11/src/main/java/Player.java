public class Player {
    private String name;
    private Region regionOrigin;

    public Player(String name, Region region){
        this.name = name;
        this.regionOrigin = region;
    }

    public String getPlayer(){
        return "Player{" +
                "nome ='" + this.name + '\'' +
                ", region origin name ='" + regionOrigin.getName() + '\'' +
                ", region origin color ='" + regionOrigin.getColor() + '\'' +
                '}';
    }
}
