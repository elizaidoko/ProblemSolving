package pastExams.y2018.autumn;

public abstract class Vehicle implements Taxable{
    private String makeModel;
    private Driver driver;
    private double roadTax;

    public Vehicle(String makeModel, String name, int num){

    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(String name, int num) {
        this.driver = new Driver(name,num);
    }

    public double getRoadTax() {
        return roadTax;
    }

    public void setRoadTax(double roadTax) {
        this.roadTax = roadTax;
    }

    public double calcTax(){
        return 0.0;
    };

    public abstract void setMaxPassengers(int maxPassengers);

    public abstract int getMaxPassengers();

    @Override
    public String toString() {
        return "Bus Model: " + getMakeModel() + "\nDriver Name: " + getDriver().getDriverName()+
                "\nDriver Number: " + getDriver().getDriverNum();
    }
}
