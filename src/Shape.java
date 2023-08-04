public class Shape {
    protected String color;

    public void setColor (String color)
    {
        this.color=color;
    }
    public String getColor() {

        return color;
    }

     public void displayColor() {
         System.out.println("Color: " + color);


    }
}