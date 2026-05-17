import java.util.Scanner;

   public class Pattern2 {
   
   public static void main(String[] args) {
   
   Scanner inputCollector = new Scanner(System.in);
   
   System.out.println("Enter number of rows:");
   int numberRow = inputCollector.nextInt();
   
   for(int rowCounter=1;rowCounter <= numberRow;rowCounter++){
    for(int starCount = numberRow; starCount >= 1; starCount--){  
    if (rowCounter >= starCount){
    
    System.out.print("*");
    }
     else{   
     System.out.print(" ");
       }
       }
       System.out.println(); 
   }
   
   
   }
    
   }
