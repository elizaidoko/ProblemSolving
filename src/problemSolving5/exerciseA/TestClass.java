package problemSolving5.exerciseA;

public class TestClass {
    public static void main(String[] args){
        String output="Displaying the state of the 3 Class objects at this point\n";

        Class c1 = new Class("Yoga", "Community Centre",23,new Time(19,30,0),new Time(20,45,0));
        Class c2 = new Class("Zumbe","S306",22,new Time(18,45,0),new Time(19,30,0));
        Class c3 = new Class("OOP","S306",22,new Time(9,0,0),new Time(10,0,0));

        Class[] all = new Class[3];

        all[0] = c1;
        all[1] = c2;
        all[2] = c3;

        for(int i = 0; i <all.length; i++){
            output += "\nClass " + (i+1) + "\n\n" + all[i].toString() + "\n\n";
        }

        output += "Trying to change the start and finish times of the Object Oriented Programming class to dodgy values of 11:60:-12 and -2:58:61 respectively";

        all[2].setStartTime(new Time(11,60,-12));
        all[2].setFinishTime(new Time(-2,58,61));

        output += "\n\nThe state of the Object Oriented Programming Class object is now \n\n" + all[2].toString();

        output += "\n\nTrying to change the start time of the Yoga class to 19:45:00 using a referenced Time object called yogaStartTime";

        all[0].setStartTime(new Time(19,45,0));

        output += "\n\nThe state of the Yoga object is now\n\n" + all[0].toString();

        //System.out.println(output);

        output += "\n\n" +
                "The state of yogaStartTime object is now 18:50:00\n" +
                "\n" +
                "The state of Yoga Class object is now \n" +
                "\n" +
                "Name: Yoga for Beginners\n" +
                "Location: Community Centre, Ballyheigue\n" +
                "Enrollment: 23\n" +
                "Start time: 19:45:00\n" +
                "Finish time: 20:45:00\n" +
                "\n" +
                "\n" +
                "Now calling getFinishTime() to return the finish time of the zumba Class object - this is being stored in a Time object called zumbaFinishTime\n" +
                "\n" +
                "\n" +
                "Now trying to change the zumba class finish time from 19:30:00 to 19:50:00 by altering the object linked to the zumbaFinishTime reference\n" +
                "\n" +
                "The state of zumbaFinishTime object is now 19:50:00\n" +
                "\n" +
                "The state of Zumba Class object is now \n" +
                "\n" +
                "Name: Intermediate Zumba\n" +
                "Location: Caherciveen S.S. Sports Hall\n" +
                "Enrollment: 18\n" +
                "Start time: 18:45:00\n" +
                "Finish time: 19:30:00 \n";
    }
}
