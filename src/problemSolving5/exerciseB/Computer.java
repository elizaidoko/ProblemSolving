package problemSolving5.exerciseB;

public class Computer {
    private Case cases;
    private String monitor;
    private String motherboard;

    public Computer(Case cases, String monitor, String motherboard){
        setCases(cases);
        setMonitor(monitor);
        setMotherboard(motherboard);

    }

    public Case getCases() {
        return cases;
    }

    public void setCases(Case cases) {
        this.cases = cases;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public String toString() {
        return "Case Details: " + getCases() + "\nMonitor: " + getMonitor() + "\nMotherboard: " + getMotherboard();
    }
}
