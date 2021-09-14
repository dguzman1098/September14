package september14;

import java.sql.Array;
import java.util.Arrays;

public class September14 {

//    public static int[] returnArray(int num1, int num2){
//
//        int[] arr = {num1,num2};
//        return arr;
//    }

    //create a method that takes the price of a product,
    //and a discount amount of the product and returns the final price of the product
    //after discounts

    public static double finalPrice(double price, double discount){
        double discountPrice = price * discount;
        return price - discountPrice;
    }


    public static void main(String[] args) {
        //System.out.println(Arrays.toString(returnArray(30,40)));

        System.out.println(finalPrice(100, .10));

    }


}
