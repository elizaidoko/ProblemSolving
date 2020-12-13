package problemSolving9.exercisea;

public class Soccer extends BallSport implements Game{

    private int gameDuration;
    private String[] surfaces;
    private String[] rules;
    private int playersPerTeam;

    public Soccer(String name, int yearEstablished, int gameDuration, String[] surfaces, String[] rules,int playersPerTeam){
        super(name,yearEstablished);
        setGameDuration(gameDuration);
        setSurfaces(surfaces);
        setRules(rules);
        setPlayersPerTeam(playersPerTeam);
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(int gameDuration) {
        this.gameDuration = gameDuration;
    }

    public String[] getSurfaces() {
        return surfaces;
    }

    public void setSurfaces(String[] surfaces) {
            this.surfaces = surfaces;
    }

    @Override
    public void setRules(String[] rules) {
        this.rules = rules;
    }

    @Override
    public void setPlayersPerTeam(int playersPerTeam) {
        this.playersPerTeam = playersPerTeam;
    }

    @Override
    public String[] getRules() {
        return rules;
    }

    @Override
    public int getPlayersPerTeam() {
        return playersPerTeam;
    }

    @Override
    public String toString() {
        String text = "";

        text += super.toString() + "\nGame duration: " + getGameDuration() + "\nSurfaces for Game: ";

        if(getSurfaces() != null){
            for(int i=0; i<getSurfaces().length; i++){
                text += getSurfaces()[i] + "  ";
            }
        }
        else
            text += "Surfaces not specified";

        if(getRules() != null){
            for(int i=0; i<getRules().length; i++){
                text += "\n" + i+1 + ". " + getRules()[i];
            }
        }
        else
            text += "Rules not specified";

        text+= "Players per Team: " + getPlayersPerTeam();

        return text;
    }
}
