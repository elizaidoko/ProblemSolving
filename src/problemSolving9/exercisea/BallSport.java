package problemSolving9.exercisea;

public class BallSport {
    private String name;
    private int yearEstablished;

    public BallSport(String name, int yearEstablished){
        setName(name);
        setYearEstablished(yearEstablished);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    @Override
    public String toString() {
        return "Name of Sport: " + getName() + "\nYear Established: " + getYearEstablished();
    }
}
