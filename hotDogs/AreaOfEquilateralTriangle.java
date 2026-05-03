import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of sides of equilateral triangle:");

        double lengthInput = input.nextDouble();
        

        double areaOutput = (lengthInput*lengthInput) * 0.4330127019;

        System.out.println("The area is equal to " + areaOutput );
    }
}