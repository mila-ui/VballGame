import java.util.ArrayList;
import java.util.List;

public class Team {
    String teamName;
    List<Player> teamMembers;

    public Team(String teamName) {
        this.teamMembers = new ArrayList<>();
        this.teamName = teamName;
    }

    public void addPlayer(Player p){
        teamMembers.add(p);

    }

    public String roster(){
        StringBuilder rost = new StringBuilder();
        for(int i = 0; i < teamMembers.size(); i++){
            rost.append(teamMembers.get(i).details());
        }
        return rost.toString();
    }
    public Player getPlayer(int a){
        return teamMembers.get(a);
    }

    public List<Player> getTeam(){
        return teamMembers;
    }

    public String teamName(){
        return teamName;
    }
    //add code to reset the position to a different format



}
