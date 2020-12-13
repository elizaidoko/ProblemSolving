package problemSolving5.exerciseB;

public class Case {
    private String model;
    private String manufacturer;
    private int powerSupply;
    private Dimension dimension;

    public Case(String model, String manufacturer, int powerSupply, Dimension dimension){
        setModel(model);
        setManufacturer(manufacturer);
        setPowerSupply(powerSupply);
        setDimension(dimension);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Model: " + getModel() + "   Manufacturer: " + getManufacturer() + "   Power Supply: " + getPowerSupply() + "   Dimension: " + getDimension();
    }
}
