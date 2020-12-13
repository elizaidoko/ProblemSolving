package pastExams.y2018.autumn;

import javax.swing.*;
import java.io.Serializable;
import java.util.jar.JarEntry;

public class Bus extends Vehicle implements Serializable {
    private int maxPassengers;

    public Bus(String makeModel, String name, int num, int maxPassengers){
        super(makeModel,name,num);
        setMaxPassengers(maxPassengers);
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) throws NumberFormatException{
        int hold;
        hold = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 2 and 200"));
        if(hold > 2 && hold< 200){
            this.maxPassengers = hold;
        }
        else{
            throw new NumberFormatException();
        }



    }

    @Override
    public String toString() {
        return super.toString() + "\nMax Passengers: " + getMaxPassengers();
    }
}
