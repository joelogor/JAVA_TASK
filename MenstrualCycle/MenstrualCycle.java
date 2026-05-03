import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class MenstrualCycle{
    
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static void main(String[] args){
    Scanner inputCollector = new Scanner(System.in);
    
    
    System.out.println("**=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**");
    System.out.println("Welcome to Menstrual Cycle Calculator");
    System.out.println("**=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**");
    System.out.println();
    System.out.println("This App helps you to Track Your Menstrual Cycle");
    
    System.out.println();
    
    System.out.println("Enter last day of of your last period(Year-month-day): ");
        
        String dateInputCollector = inputCollector.nextLine();
        LocalDate lastDayOfLastPeriod = LocalDate.parse(dateInputCollector, DATE_FORMATTER);
        
        
        System.out.println("Enter the first day of of your last period(Year-month-day): ");
        
        String dateInputCollect = inputCollector.nextLine();
        LocalDate firstDayOfLastPeriod = LocalDate.parse(dateInputCollect, DATE_FORMATTER);
        
        
    System.out.println("Enter the number of days in your last cycle: ");
    
        int cycleDays = inputCollector.nextInt();
        
        if(cycleDays < 21 || cycleDays > 45){
            
            System.out.println("Irregular Menstruation Cycle, cannot track cycles");
              
        }
            
            LocalDate nextPeriod = firstDayOfLastPeriod.plusDays(cycleDays);
        
            LocalDate ovulationDate = firstDayOfLastPeriod.plusDays(14);
        
            LocalDate lutealPhase = ovulationDate.plusDays(1);
        
            LocalDate safePeriod1 = ovulationDate.minusDays(5);
        
            LocalDate safePeriodStart = lutealPhase ;
            LocalDate safePeriodTwoEnds = firstDayOfLastPeriod.plusDays(cycleDays-1) ;
            
        
                System.out.println("Next Period = " + nextPeriod );
                
                System.out.println("First Safe Period = " + firstDayOfLastPeriod + " to " + safePeriod1 );
                
                System.out.println("Ovulation Date  = " + ovulationDate );
                
                System.out.println("Second Safe Period = " + lutealPhase + " to " + safePeriodTwoEnds);
       
    }


}
