public class OshoFreePromoEngine{
    
    public static double getFinalPrice(double cartTotal, String promoCode){
        int discount = 0;
        if(cartTotal < 5000.00 && promoCode.toUpperCase().equals("STARTER10")){
            discount = 0;                    
        }
        else if(cartTotal >= 5000.00 && cartTotal <=14999.00 && promoCode.toUpperCase().equals("STARTER10")  ){
            discount = 10/100;
        }
        else if(cartTotal >= 14999.00 && cartTotal <=29999.00 && promoCode.toUpperCase().equals("BIGBOY20")){
            discount = 20/100;  
        }
        else if(cartTotal >29999.00 && promoCode.toUpperCase().equals("OSHOFREE35") ){
        discount = 35/100;
        }
        double finalPrice = cartTotal - (discount * cartTotal );
        return finalPrice;
    }



    public static void main(String[] args){
        double cartTotal = 15000;
        String promoCode = "BIGBOY20"; 
        double finalPrice = getFinalPrice(cartTotal, promoCode);
        System.out.println(finalPrice); 
    }

}
