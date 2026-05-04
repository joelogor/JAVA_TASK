import java.util.Scanner;

public class TaskThre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int count = 0; count < numbers.length; count++) {
            System.out.print("Enter number: ");
            numbers[count] = input.nextInt();
        }

        
        System.out.println("You entered:");
        for (int count = 0; count < numbers.length; count++) {
            System.out.print(numbers[count] + " ");
        }
    }
}

