import java.util.Scanner;
import java.util.concurrent.TimeUnit;

   public class NokiaPhone {

   public static void main(String[] args) throws InterruptedException {

   Scanner inputCollector = new Scanner(System.in);
   
   System.out.print("Welcome to your Nokia phone!!!");
    
   System.out.print("\nGo to menu");


     System.out.print("Enter 1 to view menu ");
     int input = inputCollector.nextInt();
        
     if(input==1) {
         System.out.print("\nMenu: \nMenu function list \n1. Phonebook \n2. Messages \n3. Chat \n4. Call Register \n5. Tones \n6. Settings");
	 System.out.println("7   Call divert. ");
	 System.out.println("8.  Games");
	 System.out.println("9.  Calculator");
         System.out.println("10. Reminder");
	 System.out.println("11. Clock");
	 System.out.println("12. Profiles");
	 System.out.println("13. SIM services");
}
     else {
          System.out.print("NOKIAL");
          
}
   
 
   
   while(true) {
        

       System.out.print("\nEnter number 1-13 to select menu function or select 0 to exit:");

  
    String select = inputCollector.nextLine();
 
    switch(select)  {
        
         case "1":
             System.out.print("Phone book");
                pause();
                break;

         case "2":
             System.out.print("Messages");
                  pause();
                  break;
         case "3":
             System.out.print("Chat");
                  pause();
                  break;

         case "4":
             System.out.print("Call Register");
                  pause();
                  break;
         case "5":
             System.out.print("Tones");
                 pause();
                 break;

         case "6":
             System.out.print("Settings");
                 pause();
                 break;
         case "7":
             System.out.print("Call divert");
                 pause();
                 break;

         case "8":
             System.out.print("Games");
                 pause();
                 break;

        case "9":
             System.out.print("Calculator");
                   pause();
                   break;

         case "10":
             System.out.print("Reminder");
                  pause();
                  break;
         case "11":
             System.out.print("Clock");
                  pause();
                  break;
                  
         case "12":
             System.out.print("Profiles");
                  pause();
                  break;
         case "13":
             System.out.print("SIM services");
                  pause();
                  break;
        
         case "0":
             System.out.print("NOKIA");
                  pause();
                  break;

         default:
              System.out.print("Invalid input! Try again");
      }
     }
   }
  


         public static void pause() throws InterruptedException {

           TimeUnit.SECONDS.sleep(2);
}
}
