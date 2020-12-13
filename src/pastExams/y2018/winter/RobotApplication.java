package pastExams.y2018.winter;

import javax.swing.*;
import java.util.ArrayList;

public class RobotApplication {
    public static void main(String[] args){
        ArrayList <Robot> robotTeam = new ArrayList<>();
        String id, cpuType;
        int numOfMotors, choice = -1;
        double memorySize;

        while(choice != JOptionPane.NO_OPTION){
            choice = JOptionPane.showConfirmDialog(null,"Add a Robot?","add",JOptionPane.YES_NO_OPTION);

            if(choice == JOptionPane.YES_OPTION){
                id = JOptionPane.showInputDialog("Enter an ID");
                numOfMotors = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Motors"));
                cpuType = JOptionPane.showInputDialog("Enter CPU Type");
                memorySize = Double.parseDouble(JOptionPane.showInputDialog("Enter memory size"));

                robotTeam.add(new Irobot(id,numOfMotors,cpuType,memorySize));

            }

        }
    }
}
