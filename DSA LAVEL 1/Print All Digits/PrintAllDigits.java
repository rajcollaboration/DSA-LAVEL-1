import java.util.Scanner;

/**
 * PrintAllDigits
 */
public class PrintAllDigits {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();
        int temp = num;
        int digits = 0;
        while(temp != 0){
            temp = temp / 10;
            digits++;
        }
        
        int devider = (int)Math.pow(10, digits -1);
        while (num != 0) { 
            
            int q = num / devider;
            System.out.println(q);
            num = num % devider;
            
            devider = devider / 10;
        }

    }
}