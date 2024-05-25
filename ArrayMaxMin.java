public class ArrayMaxMin {

    public static void maxMin(int []arr)
    {
        int min=arr[0];
        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element is "+min);
        System.out.println("Maximum element is "+max);

        

    }
    public static void main(String[] args) {
        int arr[]={34,9,37,11,31,25,98};
        maxMin(arr);
    }
}
