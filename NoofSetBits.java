public class NoofSetBits {
    public static void main(String[] args) {
        int n=1024;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));

    }
    private static int setBits(int n)
    {
        int count=0;
        while(n>0)
        {   if((n&1)==1)
            count++;
           // n-=n&(-n);
            n=n>>1;
        }
        return count;
    }
}
