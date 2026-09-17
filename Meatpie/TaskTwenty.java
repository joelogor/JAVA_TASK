import java.util.Scanner;

public class TaskTwenty {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" What is the length and width:");

        double lengthInput = input.nextDouble();
        double widthInput  = input.nextDouble();
        

        double areaOutput = lengthInput * widthInput  ;

        System.out.println("The area equal to " + areaOutput );
    }
}