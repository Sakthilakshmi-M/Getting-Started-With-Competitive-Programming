import java.util.Scanner;

class ReverseSort {
  public static void main(String[] args)
  {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
    reversort(arr, n);
    for(int i=0;i<n;i++)
      System.out.println(arr[i]);

  }

  static void reversort(int arr[],int n)
  {
    int min;
    for(int i=0;i<n-1;i++)
    {
      min=i;
      for(int j=i+1;j<n;j++)
        if(arr[min]>arr[j])
          min=j;
      reverse(i,min,arr);
    }
  }

  static void reverse(int i,int j,int arr[])
  {
    int temp=0;
    while(i<j)
    {
      temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      i++;
      j--;
    }
  }
}