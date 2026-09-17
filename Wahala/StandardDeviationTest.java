import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

    @Test
    public void testThattMeanOfNumberIsCorrect(){
    
        double[] numbers = {1,2,3,4,5};
        double expectedMean = StandardDeviation.getMeanOf(numbers);
        double actualMean = 3.0;
        assertEquals(expectedMean, actualMean);  
        
            
       
    }
    
    @Test
 
    public void testThatSumOfMeanDeviationOfNumberIsCorrect(){
        double[] numbers = {1,2,3,4,5};
        double expectedMeanDeviation = StandardDeviation.getMeanDeviationOf(numbers);
        double actualMeanDeviation = 10.0;
        assertEquals(expectedMeanDeviation, actualMeanDeviation);  
        
        
    }
    
    @Test
    public void testThaVarianceOfNumberIsCorrect(){
    
        double[] numbers = {1,2,3,4,5};
        double expectedVariance = StandardDeviation.getVarianceOf(numbers);
        double actualVariance = 2.0;
        assertEquals(expectedVariance, actualVariance);  
            
        
    }
    
    @Test
    public void testThatStandardDeviationOfNumberIsCorrect(){
    
        double[] numbers = {1,2,3,4,5};
        double expectedStandardDeviation = StandardDeviation.getStandardDeviationOf(numbers);
        double actualStandardDeviation = 1.4142;
        assertEquals(expectedStandardDeviation, actualStandardDeviation); 
        
        
    }

} 
