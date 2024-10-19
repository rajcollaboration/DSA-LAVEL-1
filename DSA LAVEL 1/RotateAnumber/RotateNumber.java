
// import java.util.Scanner;


// public class RotateNumber {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter Rotate Number");
//         int rotateNumber = scn.nextInt();
//         System.out.println("enter main Rotate Number");
//         int n = scn.nextInt();
//         int temp = n;
//         int digits = 0;
       
//         while (temp != 0) {
//             temp = temp / 10;
//             digits++;
//         }
       
//         rotateNumber = rotateNumber % digits;
       
//         if (rotateNumber < 0 ) {
//             rotateNumber = rotateNumber + digits;
//         }
//         System.out.println("rotate number"+rotateNumber);

//         System.out.println("digits = " + digits);
//         int zeros = (int)Math.pow(10, digits-1);
//         while (rotateNumber != 0) {
//             int lastNum = n % 10;
//             int multiplier = lastNum * zeros;
//             n = n / 10;
//             n = n + multiplier;
//             rotateNumber--; 
//         } 
//         System.out.println("result is" + n);
//     }
// }



import java.util.Scanner;


public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Rotate Number");
        int rotateNumber = scn.nextInt();
        System.out.println("enter main Rotate Number");
        int n = scn.nextInt();
        int temp = n;
        int digits = 0;
       
        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }
       
        rotateNumber = rotateNumber % digits;
       
        if (rotateNumber < 0 ) {
            rotateNumber = rotateNumber + digits;
        }
       

        
        int mul = (int)Math.pow(10, digits-rotateNumber);
        int div = (int)Math.pow(10, rotateNumber);
        int lastNumbers = n % div;
        int smallestNumber = n / div;
        int res = (lastNumbers * mul) + smallestNumber;
        System.out.println("result is" + res);
    }
}
