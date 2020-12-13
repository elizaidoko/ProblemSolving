package problemSolving7.exercisea;

import problemSolving7.exercisea.Circle;
import problemSolving7.exercisea.Cylinder;
import problemSolving7.exercisea.Point;

public class TestCircle {
    public static void main(String[] args){

        Point p1 = new Point(0,0);

        System.out.println(p1);

        System.out.println("Displaying the state of the Circle and Cylinder objects at this point");

        Circle circle = new Circle(4,3,6.6);
        Cylinder cylinder = new Cylinder(7,6,4.5,6.9);

        System.out.println("Circle details: ");
        System.out.println(circle);

        System.out.println("\nCylinder details: ");
        System.out.println(cylinder);

        Circle[] all = {circle,cylinder};

        for(int i=0; i<all.length; i++){
            System.out.println("\n Displaying the state of the Circle and Cylinder objects (by using a Circle reference)");

            if(i == 0){
                System.out.println("\nCircle details: \n" + all[i]);
            }
            else
                System.out.println("\nCylinder details: \n" + all[i]);
        }




    }
}
