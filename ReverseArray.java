import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int l=0;
        int r=arr.length-1;
        reverse(arr,l,r);
        System.out.println(Arrays.toString(arr));


    }
    static void reverse(int[] arr,int l,int r)
    {
       if(l>=r)
           return ;
        swap(arr,l,r);
        reverse(arr,l+1,r-1);
    }
    static void swap(int[] arr,int l,int r)
    {
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
