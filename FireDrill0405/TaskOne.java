import java.util.Scanner;
public class TaskOne{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    int[] numbers;
    numbers = new int [10];
    
    for (int count = 0; count < numbers.length; count++) {
            System.out.print("Enter number: ");
            numbers[count] = input.nextInt();
            }
    
        System.out.println(numbers[9]);
    
    
    }

}
