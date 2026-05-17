import java.util.Scanner;
public class TaskOne{
    public static void main(String[] args){
            Scanner inputcollector = new Scanner(System.in);
            
            int totalSum = 0;
            
            for (int count = 1; count <= 10; count++){
                System.out.print("Enter the score " + count + ": ");
                int score = inputcollector.nextInt();
                totalSum += score;
            }
            System.out.println("The sum is " + totalSum);
    }
}
