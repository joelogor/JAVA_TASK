import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest{

    @Test
    public void testThatCelciusReturnsCorrectConversion(){

        double expectedTempertureConvert = Temperature.celciusToFarenheit(10);
        double actualTemperatureConvert = 50.0;
        assertEquals(expectedTempertureConvert, actualTemperatureConvert);


    }   

}
