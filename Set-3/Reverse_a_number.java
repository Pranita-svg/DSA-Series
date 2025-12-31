import java.util.*;
public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int n1 = 0;
        int k = n;

        while (n != 0) {
            int r = n % 10;
            n1 = n1 * 10 + r;
            n /= 10;
        }

        System.out.println("Reversed number of " + k + " is: " + n1);
        sc.close();
    }
}
