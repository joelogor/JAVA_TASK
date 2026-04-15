import java.util.Scanner;

public class VolumeOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of sides of equilateral triangle:");

        double lengthInput = input.nextDouble();
        

        double volumeOutput = (lengthInput*lengthInput*lengthInput);

        System.out.println("The area is equal to " + volumeOutput );
    }
}