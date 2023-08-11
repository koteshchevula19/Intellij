package kunalkushwa;

public class RotatedbinarySearch {
    public static void main(String[] args) {
        int arr[]={5,6,1,2,3,4};
        System.out.println("Index :"+rbs(arr,2,0,arr.length-1));


    }
    public static int rbs(int arr[],int target,int s,int e)
    {
        int m=s+(e-s)/2;
        if(s>e)
            return -1;
        if(arr[m]==target)
            return m;
        if(arr[s]<=arr[m])
        {
            if(target>=arr[s]&&target<=arr[m])
               return rbs(arr, target, s, m-1);
            else
                return rbs(arr, target, m+1, e);

        }
        if(target>=arr[m]&&target<=arr[e])
        {
            return rbs(arr, target, m+1, e);

        }
        else
            return rbs(arr, target, s, m-1);

    }
}
