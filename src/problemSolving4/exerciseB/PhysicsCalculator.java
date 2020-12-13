package problemSolving4.exerciseB;

public class PhysicsCalculator {
    static final int speedOfLight = 299792458;
    static final double planckConstant = 6.62607004E-34;
    static final double permitivity = 8.8542E-12;

    private void PhysicsCalculator(){

    }

    public static double energyFromMass(double m){
        double e;
        e = m*speedOfLight*speedOfLight;
        return e;
    }

    public static double energyFromFrequency(double f){
        double e;
         e = f*planckConstant;
         return e;
    }

    public static double coulomgForce(double q1, double q2, double d){
        double f;

        f = (q1*q2)/(4*Math.PI*permitivity*d*d);

        return f;
    }
}
