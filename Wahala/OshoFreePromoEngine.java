public class OshoFreePromoEngine{
    
    public static double getFinalPrice(double cartTotal, String promoCode){
        int discount = 0;
        if(cartTotal < 5000.00){
            discount = (promoCode.toUpperCase().equals "STARTER10")? 0 : 0;                    
        }
        else if(cartTotal >5000.00 && cartTotal <=14999.00 ){
            discount = (promoCode.toUpperCase().equals "STARTER10")? 10 : 0;
        }
        else if(cartTotal >14999.00 && cartTotal <=29999.00){
            discount = (promoCode.toUpperCase().equals "BIGBOY20")? 20 : 0;  
        }
        else if(cartTotal >29999.00){
        discount = (promoCode.toUpperCase().equals"OSHOFREE35" )? 35 : 0;
        }
        double finalPrice = cartTotal - discount * cartTotal / 100;
        return finalPrice;
    }



    public static void main(String[] args){
        double cartTotal = 15000;
        String promoCode = "BIGBOY20"; 
        double finalPrice = getFinalPrice(cartTotal, promoCode)
        System.out.println(finalPrice); 
    }

}
