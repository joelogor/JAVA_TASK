import java.util.Scanner;
public class TaskFour{
    public static void main(String[] args){
            Scanner inputcollector = new Scanner(System.in);
            
            int evenIndex = 0;
            
            for (int count = 1; count <= 10; count++){
                System.out.print("Enter the score " + count + ": ");
                int score = inputcollector.nextInt();
                
                if (score % 2 == 0){
                  evenIndex += score;              
                }

            }
            System.out.println("The sum of the even index is " + evenIndex);
    }
}
