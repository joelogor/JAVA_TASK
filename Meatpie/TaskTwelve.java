import java.util.Scanner;

public class TaskTwelve {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What are the two numbers:");

        double numberInput1 = input.nextDouble();
        double numberInput2 = input.nextDouble();
        

        System.out.println("The two numbers are " + numberInput1 + " and " + numberInput2 );
    }
}