import java.util.*;
public class Check_palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int n1 = 0;
        int k = n;

        while (n != 0) { int max=0;
            int r = n % 10;
            n1=n1*10+r;
            n /= 10;
        }

        if(n1==k)
          System.out.println("Palindrome");
        else
          System.out.println("Not Palindrome");
        sc.close();
    }
}
