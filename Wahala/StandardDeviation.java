public class StandardDeviation{

    public static double getMeanOf(double[] numbers){
    
        double sum = 0.0;
        double mean = 0.0;
        for(double number : numbers){
        
            sum += number;
            
 }
        mean = sum / numbers.length;
        
        return  mean
    
    }

    public static double getMeanDeviationOf(double[] numbers){
    
        double mean = getMeanOf(numbers);
        double meanDeviation = 0.0;
        double sumOfMeanDeviation = 0.0;
       
        for(double number : numbers){
            
            meanDeviation = (number - mean)/numbers.length ;
            sumOfMeanDeviation +=  meanDeviation;
        
        }
       
        return sumOfMeanDeviation;
    
    }
    
    public static double getVarianceOf(double[] numbers){
    
        double sumOfMeanDeviation = getMeanDeviationOf(numbers);
        
        double variance = sumOfMeanDeviation / numbers.length;
        
       
        return variance;
    
    }
    
    public static double getStandardDeviationOf(double[] numbers){
    
        double variance = getVarianceOf(numbers);
        
        double standardDeviation = Math.sqrt(variance);
       
        return standardDeviation ;
    
    }



}
