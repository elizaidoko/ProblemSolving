package week4.exerciseA;


public class TestStudent {
    public static void main(String[] args){

        String output;

        Student s1 = new Student("Tim","Computing",new String[]{"Math","Java","Web Dev","Network Basics"});
        Student s2 = new Student("ita","Social Care",new String[]{"Intro to Social Care","Psychology"});
        Student s3 = new Student("Joe", "Physics", new String[]{"Relativity", "Mechanics", "Hydrodynamics","Statistics"});

        Student all[] = {s1,s2,s3};

        output = "Calling static method getCount() to determine the number of students in the college \n\nTotal students in college: " + Student.getCount();

        output += "\n\n\nDisplaying the state of the 3 student objects at this point";

        for(int i = 0; i<Student.getCount(); i++){
            output += "\nStudent " + i+1 + "\n\n" + all[i];

        }

        output += "\n\nCalling static method setCollege() to alter college";

        Student.setCollege("Munster Technological university");

        output += "\n\n\nDisplaying the state of the 3 student objects at this point";

        for(int i = 0; i<Student.getCount(); i++){
            output += "\nStudent " + (i+1) + "\n\n" + all[i];

        }

        System.out.println(output);


    }
}
