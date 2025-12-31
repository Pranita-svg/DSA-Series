import java.util.*;
public class Count_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int c = 0;
        int k=n;
        while (n != 0) {
            n /= 10;
            c++;
        }

        System.out.println("Number of digits in " + k + ": " + c);
        sc.close();
    }

    
}
