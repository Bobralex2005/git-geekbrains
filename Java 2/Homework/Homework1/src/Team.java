/**
 * Created by Alexander Bugaev on 03.07.2017.
 */
public class Team {

    private String teamName;
    private String name;
    private int distance;
    private int jumps;
    private String teamPlayers[];

    public Team(String[] teamPlayers){
            this.teamPlayers = teamPlayers;
    }

    public Team(String teamName, String name, int distance, int jumps){
        this.teamName = teamName;
        this.name = name;
        this.distance = distance;
        this.jumps = jumps;
    }
}
