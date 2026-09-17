import java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args){
            Scanner inputcollector = new Scanner(System.in);
            
            int scoreCount = 0;
            int totalSum = 0;
            
            for (int count = 1; count <= 10; count++){
                System.out.print("Enter the score " + count + ": ");
                int score = inputcollector.nextInt();
                scoreCount++;
                totalSum += score;
            }
            int average = totalSum / scoreCount;
            System.out.println("The average is " + average);
    }
}
