package pastExams.y2018.winter;

public class Brain {
    private String memType;
    private double memSize;

    public Brain(String memType, double memSize){
        setMemType(memType);
        setMemSize(memSize);
    }

    public String getMemType() {
        return memType;
    }

    public void setMemType(String memType) {
        this.memType = memType;
    }

    public double getMemSize() {
        return memSize;
    }

    public void setMemSize(double memSize) {
        this.memSize = memSize;
    }

    @Override
    public String toString() {
        return "CPU Type: " + getMemType() + "\nMemory Size: " + getMemSize();
    }
}
