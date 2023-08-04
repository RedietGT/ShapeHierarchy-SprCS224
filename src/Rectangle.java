public class Rectangle extends Shape {

    private double length;
    private double width;



    public void displayColor()
    {
        System.out.println("The Color of the Rectangle: " + color);

    }


    public void setLength ( double l) {
        length=l;
    }

    public void setWidth (double w){
        width=w;
    }
    public double getLength () {

        return length;
    }
    public double getWidth () {

        return width;
    }

    public double calculateArea ( ) {

        return length*width;
    }

    public double calculatePeri (){

        return ((2*length)+(2*width));

    }
}