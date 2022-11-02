import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


public class Class {

    public static String Class1(){
        System.out.println("Enter Something:");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println("You Entered: " + "\"" + x + "\"" );
        return x;
    }

    public static void swap(String X){

    }

    public static void isItaNum(String x){
        CharSequence charValue = x;
        StringUtils z =new StringUtils();
        boolean y = z.isNumeric(charValue);
        if(y){
            System.out.println("\"" + x + "\"" +" is a number");
        } else{
            System.out.println("\"" + x + "\"" +" is not a number");
        }
    }

    public static void flippedCase(String x){
        StringUtils z =new StringUtils();
        String swap = z.swapCase(x);
        System.out.println("Flipped Case: " + swap);
    }

    public static void reversed(String x){
        StringUtils z =new StringUtils();
        String reversed = z.reverse(x);
        System.out.println("Reversed: " + reversed);
    }


    public static void main(String[] args) {
        String y = Class1();
        isItaNum(y);
        flippedCase(y);
        reversed(y);

    }
}
