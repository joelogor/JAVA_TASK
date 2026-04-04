import java.util.Scanner;

public class TaskTwentyTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" What is the radius:");

        int radiusInput = input.nextInt();
        

        double areaOutput = (radiusInput * radiusInput)*3.1416 ;

        System.out.println("The area equal to " + areaOutput );
    }
}