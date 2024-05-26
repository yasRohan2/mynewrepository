import java.util.Scanner;

public class KthLargest_Smallest {

    public static void smallestLargest(int []arr,int k,int n){
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.print("The Sorted Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nThe Kth Largest Element is "+arr[k-1]);
        System.out.println("The Kth Smallest Element is "+arr[n-k]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of an Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k : ");
        int k=sc.nextInt();
        smallestLargest(arr,k,n);
    }
}
