package problemSolving7.exerciseb;

public abstract class ElectronicDevice {
    protected String partName;
    protected int partNumber;
    protected Dimension dimension;
    protected double price;

    public ElectronicDevice(String partName, int partNumber, Dimension dimension, double price ){
        setPartName(partName);
        setPartNumber(partNumber);
        setDimension(dimension);
        setPrice(price);
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getCategory();

    @Override
    public String toString() {
        return "Category: " + getCategory() + "\nPart Name: " + getPartName() +
                "\nPart Number: " + getPartNumber() + "\nDimensions: " + getDimension() +
                "\nPrice: " + getPrice();
    }
}
