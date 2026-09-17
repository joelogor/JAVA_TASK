import java.util.Scanner;

public class TaskTwentyOne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" What is the length and width:");

        double heightInput = input.nextDouble();
        double baseInput  = input.nextDouble();
        

        double areaOutput = (heightInput * baseInput)/2  ;

        System.out.println("The area equal to " + areaOutput );
    }
}