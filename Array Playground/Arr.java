import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] numbers = new int[5];

        for (int count = 0; count < numbers.length; count++) {
            System.out.print("Enter number: ");
            
            numbers[count] = input.nextInt();
            }

            System.out.println(Arrays.toString(numbers));
        }
        
}
