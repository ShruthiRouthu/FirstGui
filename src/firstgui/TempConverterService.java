package firstgui;

import java.text.DecimalFormat;

/**
 *
 * @author Shruthi Routhu
 */
public class TempConverterService {
    
    DecimalFormat df = new DecimalFormat("#0.00");

    
    public final String convertCentigradeToFahrenheit(String CTemp){
        double c = Double.parseDouble(CTemp);
        System.out.println(c);
        double f = ((c * 9)/5)+ 32;
        System.out.println(f);
        return df.format(f) + " F" ;
    }
    
    public final String convertFahrenheitToCentigrade(String FTemp){
        double f = Double.parseDouble(FTemp);
        System.out.println(f);
        double c = ((f-32)*5)/ 9;
        System.out.println(c);
        return df.format(c) + " C";      
    }
    
}
