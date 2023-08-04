public class Circle extends Shape {
    private double  rad;
    private static final double pi=3.14;



    public void displayColor() {

        System.out.println("The Color of the Circle: " + color);
    }
    public void setRad(double r){

        rad=r;
    }
    public double getRad(){

        return rad;
    }
    public double calculateArea () {

        return pi*rad*rad;
    }

    public double calculatePeri (){

        return 2*pi*rad;

    }

}