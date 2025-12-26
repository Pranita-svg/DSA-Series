import java.util.*;

public class selectionsort{
static void ss(int a[])
  { for(int i=0;i<a.length-1;i++){
  int min=i;
  for(int j=i+1;j<a.length;j++)
    if(a[j]<a[min])
      min=j;

  int t=a[i];
  a[i]=a[min];
  a[min]=t;
}
}

static void ap(int a[]){
  for(int i=0;i<a.length;i++)
    System.out.print(a[i]);
  System.out.println();
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
  ss(a);
  ap(a);
}
}
  
