package problemSolving7.exerciseb;

public class Television extends ElectronicDevice {
    private int NumberOfChannels;
    private String Screentype;

    public Television(String partName, int partNumber, Dimension dimension, double price, int numberOfChannels, String screentype){
        super(partName,partNumber,dimension,price);
        setNumberOfChannels(numberOfChannels);
        setScreentype(screentype);
    }

    public int getNumberOfChannels() {
        return NumberOfChannels;
    }

    public void setNumberOfChannels(int numberOfChannels) {
        NumberOfChannels = numberOfChannels;
    }

    public String getScreentype() {
        return Screentype;
    }

    public void setScreentype(String screentype) {
        Screentype = screentype;
    }

    @Override
    public String getCategory() {
        return "Television";
    }

    @Override
    public String toString() {
        return String.format("%-20s%s\n%-20s%s\n%-20s%d\n%-20s%s\n%-20s%.2f\n%-20s%d\n%-20s%s","Category: ", getCategory(),"Part Name:",partName,
                "Part Number: ",partNumber,"Dimensions: ",dimension,"Price: ",price,"Number of Channels:",
                getNumberOfChannels(),"Screen Type: ",getScreentype());
    }
}
