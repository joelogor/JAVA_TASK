import java.util.Scanner;

public class SumInputArray{

    public static void main(String[] args){
    
       Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int [] number = inputCollector.nextInt();
        
        int count = 0;
        int sum = 0;
        
        for(; count < number.length;count++){
        
            sum = sum + number[count];
        
        }
           System.out.println(sum);
     
    
    }
}

