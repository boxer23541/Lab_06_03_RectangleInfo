import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
    double height = 0;
    double width = 0;
    double area = 0;
    double perimeter = 0;
    double diagonal = 0;
    String trash;

        System.out.println("Enter height of rectangle: ");

        if(in.hasNextDouble())
        {
            height = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered \"" + trash + "\"");
            System.out.println("Please rerun the program and enter a valid height");
            System.exit(0);
        }

        System.out.println("Enter width of rectangle: ");

        if(in.hasNextDouble())
        {
            width = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered \"" + trash + "\"");
            System.out.println("Please rerun the program and enter a valid width");
            System.exit(0);
        }

        area = height * width;
        perimeter = (height + width) * 2;
        diagonal = Math.sqrt((height * height) + (width * width));

        System.out.println("The area is " + area + " squared");
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The diagonal length is " + diagonal);
    }
}
