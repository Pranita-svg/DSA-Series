import java.util.*;
public class Check_prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
      int c=0;
        for(int i=2;i<=Math.sqrt(n);i++)
          if(n%i==0)
            c++;

        if(c==0)
          System.out.println("Prime");
        else
          System.out.println("Not Prime");
        sc.close();
    }
}
