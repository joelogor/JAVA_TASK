import java.util.Scanner;
public class MaximumNumber{
   
    
    public static int max(int firstNumber, int secondNumber, int thirdNumber){
        int largest = firstNumber;
        
        if(secondNumber > largest){
            largest = secondNumber;
        }
        if(thirdNumber > largest){
            largest = thirdNumber;
        }
        return largest;
   
    }
    public static void main(String[] args){

        max(5,10,15);

    }
}

