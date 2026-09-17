public class MaximiumOfThreeNumbers{

public static int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber){
int largestNumber;
largestNumber = firstNumber;
if(secondNumber>firstNumber){
    largestNumber = secondNumber;
   }
else if(thirdNumber>secondNumber){
    largestNumber = thirdNumber;
 }   
    return largestNumber;

}
public static void main(String[] args) {
System.out.println(maxOfThreeNumbers(4 , 10 ,6));

}
}


