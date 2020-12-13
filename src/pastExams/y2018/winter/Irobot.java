package pastExams.y2018.winter;

public class Irobot extends Robot {
    private Brain brain;

    public Irobot(String id, int numMotors, String memType, double memSize){
        super(id,numMotors);
        setBrain(memType,memSize);
    }

    public Brain getBrain() {
        return brain;
    }

    public void setBrain(String memType, double memSize) {
        this.brain = new Brain(memType,memSize);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + getBrain().toString();
    }
}
