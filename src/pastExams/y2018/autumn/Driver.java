package pastExams.y2018.autumn;

public class Driver {
    private int driverNum;
    private String driverName;

    public Driver(String driverName, int driverNum){
        setDriverName(driverName);
        setDriverNum(driverNum);
    }

    public int getDriverNum() {
        return driverNum;
    }

    public void setDriverNum(int driverNum) {
        this.driverNum = driverNum;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    //to string
}
