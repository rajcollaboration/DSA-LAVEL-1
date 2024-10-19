
import java.util.Scanner;

public class CalculatePrime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scn.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime");
        }else{
            System.out.println(number + "                                                           is not a prime");
        }
        scn.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

