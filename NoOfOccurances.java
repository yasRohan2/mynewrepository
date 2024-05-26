import java.util.*;



public class NoOfOccurances {
    public static int count(int []arr,int n, int value)
{
    int count =0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==value)
        {
            count++;
        }
    }
    return count;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of an Array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to check occurances ");
        int num=sc.nextInt();
        System.out.println("The occurance of number "+num+" is : "+count(arr,n,num));
    }
}
