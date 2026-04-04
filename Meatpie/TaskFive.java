import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the product of:");

        double productInput1 = input.nextDouble();
        double productInput2 = input.nextDouble();

        double product = productInput1 * productInput2;

        System.out.println("The product of " + productInput1 + " and " + productInput2 + " is " + product);
    }
}