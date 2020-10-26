package week4.exerciseB;

public class TestPhysicsCalculator {
    public static void main(String[] args){
        String output = "Calling the static method energyFromMass() to determine the amount of energy\n" +
                "that is equivalent to a mass of 1.3 nanograms\n\n "+
                "Energy equivalent of 1.3 nanograms is " + PhysicsCalculator.energyFromMass(1.3) + " Joules\n\n";

        output += "Calling static method energyFromFrequency() to determine the amount of energy\n" +
                "that is equivalent to a frequency of 345.87 teraHertz\n\n" +
                "Energy equivalent of 345.87 teraHertz is " + PhysicsCalculator.energyFromFrequency(345.87) + " Joules\n\n";

        output += "Calling static method coulombForce() to determine the Force that exists\n" +
                "between 2 electrical charges whose values are 4.58 microCoulomb and\n" +
                "-38.56 microCoulomb.The charges are separated by a distance of 0.528 metres\n" +
                "\n" +
                "Force between the two charges is" + PhysicsCalculator.coulomgForce(4.58,-38.56,0.528) +" Newtons\n";

        System.out.println(output);


    }
}
