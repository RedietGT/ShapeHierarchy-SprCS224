import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

            Rectangle rec = new Rectangle();
            Circle cir = new Circle();
            Triangle tri = new Triangle();

            Scanner scan = new Scanner(System.in);


        System.out.println("Enter the Shape of your choice:");
        System.out.println("1. Rectangle ");
        System.out.println("2.Circle ");
        System.out.println("3.Triangle ");

        int  num = scan.nextInt();


        do {
            if (num == 1) {
                System.out.println("Enter the length of the rectangle");
                rec.setLength(scan.nextDouble());

                System.out.println("Enter the width of the rectangle");
                rec.setWidth(scan.nextDouble());

                System.out.println("What Color do you want your Shape to be?");
                rec.setColor(scan.next());

                System.out.println("The area of the rectangle is " + rec.calculateArea());
                System.out.println("The perimeter of the rectangle is " + rec.calculatePeri());

                rec.displayColor();

                break;


            } else if (num == 2) {
                System.out.println("Enter the radius of the circle");
                cir.setRad(scan.nextDouble());

                System.out.println("What Color do you want your Shape to be?");
                cir.setColor(scan.next());

                System.out.println("The area of the circle is " + cir.calculateArea());
                System.out.println("The perimeter of the circle is " + cir.calculatePeri());

                cir.displayColor();
                break;

            } else {
                System.out.println("Enter the base of the triangle");
                tri.setBase(scan.nextDouble());

                System.out.println("Enter the height of the triangle");
                tri.setHeight(scan.nextDouble());

                System.out.println("What Color do you want your Shape to be?");
                tri.setColor(scan.next());


                System.out.println("The area of the triangle is " + tri.calculateArea());
                System.out.println("The perimeter of the triangle is " + tri.calculatePeri());

                tri.displayColor();
                break;

            }


        } while (num >= 1 && num <= 3);


        }



    }


