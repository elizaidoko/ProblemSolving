package pastExams.y2018.autumn;

import javax.swing.*;
import java.util.ArrayList;
import java.util.jar.JarEntry;

public class Test {
    public static void main(String[] args){
        ArrayList<Bus> all = new ArrayList<>();
        String model,name;
        int num,max,choice=-1;

        while(choice != JOptionPane.NO_OPTION){

            choice = JOptionPane.showConfirmDialog(null,"","",JOptionPane.YES_NO_OPTION);

            if(choice == JOptionPane.YES_OPTION){
                model = JOptionPane.showInputDialog("Enter model of Bus");
                name = JOptionPane.showInputDialog("Enter name of driver");
                num = Integer.parseInt(JOptionPane.showInputDialog("Enter driver number"));
                max = Integer.parseInt(JOptionPane.showInputDialog("Enter max number of passengers"));

                all.add(new Bus(model,name,num,max));
            }

        }

    }
}
