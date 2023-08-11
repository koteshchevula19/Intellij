public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7,8,91,101,203};
        int x=binarysearch(arr,0,arr.length-1,203);
        System.out.println(x);

    }
    static int binarysearch(int[] arr,int start,int end,int target)
    {
        int mid=start+(end-start)/2;
        if(start>end)
            return -1;
        if(arr[mid]==target)
            return mid;
        else if(target<arr[mid])
            return binarysearch(arr,start,mid-1,target);
        else
            return binarysearch(arr,mid+1,end,target);



    }
}
