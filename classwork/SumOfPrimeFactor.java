import java.util.Scanner;

public class SumOfPrimeFactor {

public static void main(String[] args) {

Scanner inputCollector = new Scanner(System.in);

System.out.println("Enter number:");

int numberInput = inputCollector.nextInt();
int sum = 0;
int factorial = 2;
while (factorial <= numberInput){
     if(numberInput % factorial  == 0){
     numberInput = numberInput / factorial;
   sum = sum + factorial;
   
  }
  else{
      factorial++;
  
  } 
}
   System.out.println(sum);

}
}
