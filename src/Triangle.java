import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle extends Shape {

    private double base;
    private double height;




    public void displayColor(){

        System.out.println("The Color of the Triangle: " + color);


    }
    public void setBase(double b){

        base=b;

    }
    public void setHeight(double h ){


        height=h;
    }
    public double getBase() {

        return base;
    }
    public double getHeight() {

        return height;
    }

    public double calculateArea() {

        return  0.5*base*pow(height,2);
    }

    public double calculatePeri() {

        double hyp = sqrt(pow(base,2)+pow(height,2));
        return hyp+base+height;

    }


}
