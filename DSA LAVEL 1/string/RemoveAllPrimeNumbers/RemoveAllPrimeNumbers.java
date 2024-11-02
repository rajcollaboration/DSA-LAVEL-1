
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAllPrimeNumbers {
    public static Boolean isPrime(Integer num){
        if (num <= 1) {
            return false;
        }
        int count = 0;
        for (int i = 2; i <= num; i++){
            if (num % i == 0){
                count++;
                if (count > 1){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter the number of elements in the array: ");
        int n = scn.nextInt();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++){
            arr.add(scn.nextInt());
        }

        for (int i = arr.size()-1; i >= 0; i--){
            int val = arr.get(i);
            
            if (isPrime(val) == true){
                System.out.println(val);
                arr.remove(i);
            }
        }

        System.out.println(arr);
    }
}
