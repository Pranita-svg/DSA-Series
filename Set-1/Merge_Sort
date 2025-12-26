
import java.util.Scanner;

public class merge_sort {

static void merge(int a[], int l, int m, int r){
       int n1 = m-l+1;
       int n2 = r-m;

        int l1[] = new int[n1];
        int r1[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            l1[i] = a[l + i];
        for (int j = 0; j < n2; ++j)
            r1[j] = a[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (l1[i] <= r1[j]) {
                a[k] = l1[i];
                i++;
            }
            else {
                a[k] = r1[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = l1[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = r1[j];
            j++;
            k++;
        }
    }


    static void ms(int arr[], int l, int r){
        
        if (l < r)
        {int m = l+(r-l)/2;

            ms(arr,l,m);
            ms(arr,m + 1,r);
            merge(arr,l,m,r);
        }
    }
public static void main(String args[]){
        
    	Scanner in=new Scanner(System.in);
    	  System.out.print("Enter the number of elements you want to add in the array");
    	  int n=in.nextInt();
    	  int a[]=new int[n];
    	  for(int i=0;i<n;i++){
    	  System.out.println("Enter an element");
    	  int x=in.nextInt();
    	  a[i]=x;
    	  }
        
        ms(a, 0, a.length - 1);
        
        int m = a.length;
        for (int i = 0; i < m; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
