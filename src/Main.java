import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to add the digits: ");
        int value = input.nextInt();

        System.out.println(value +" sum digits is "+ sumDigits(value));
    }
    public static int sumDigits(int n){
        int result = 0;
        while(n%10 != n){
            result += (n%10); // result = result + (n%10)
            n /=10; // n = n/10
        }

        // Now add the first digit
        result += n;
        return result;
    }
}