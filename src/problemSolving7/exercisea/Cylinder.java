package problemSolving7.exercisea;

import problemSolving7.exercisea.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        this(0,0,0,0);
    }

    public Cylinder(int x, int y, double radius, double height){
        super(x,y,radius);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return (super.area()*2) + (super.perimeter()*getHeight()) ;
    }

    public double volume() {
        return super.area()*getHeight();
    }

    @Override
    public String toString() {
        return "Centre: " + getCentre() + "\nRadius: " + getRadius() + "\nHeight: " + getHeight() +
                "\nSurface Area: " + area() + "\nVolume: " + volume();
    }
}
