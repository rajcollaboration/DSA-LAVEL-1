
import java.util.Scanner;

/**
 * PrintAllPrimeNUmber
 */
public class PrintAllPrimeNUmber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int min = scn.nextInt();
        System.out.print("Enter the upper limit: ");
        int max = scn.nextInt();

        for (int i = min; i <= max; i++){
            if (isPrime(i)){
                System.out.println(i + "is prime");
            }else{
                System.out.println(i + "is not prime");
            }
        }
    }

    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for(int j = 2; j <= Math.sqrt(num); j++){
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}