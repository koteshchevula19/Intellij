import java.util.Arrays;
import java.util.HashMap;

public class Solution {

        public static int getKth(int lo, int hi, int k) {

            int j=hi*k;
            int i=0;
            int a[]=new int[hi-lo+1];
            int min=Integer.MAX_VALUE;
            int x=0;
            int low=lo;
            while(lo<=hi&&i<a.length)
            { int temp=lo;

                while(j>=0)
                {
                    if(temp%2==0)
                    {
                        temp=temp/2;
                        a[i]++;
                        j--;
                    }
                    if(temp%2!=0&&temp!=1)
                    {
                        temp=3*temp+1;
                        a[i]++;
                        j--;
                    }
                    if(temp==1)
                    {
                        break;
                    }
                }
                 min=Math.min(min,a[i]);
                if(min>=a[i])
                    x=lo;


                i++;
                lo++;
                j=hi*k;






            }
            System.out.println(Arrays.toString(a));
             System.out.println(x);
            HashMap<Integer,Integer> hm=new HashMap<>();
            for (int m=0;m<a.length;m++)
            {
                hm.put(low,a[m]);
                low++;
            }
            System.out.println(hm);
             return  min;

        }


    public static void main(String[] args) {
            System.out.println(getKth(12,15,2));

    }
    }

