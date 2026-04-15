import java.util.Scanner;

public class SquareMeterToPing {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the number in square meter:");

        double numberInput = input.nextDouble();
        

        double pingOutput = (numberInput * 0.3025);

        System.out.println("The number in ping is  " + pingOutput );
    }
}