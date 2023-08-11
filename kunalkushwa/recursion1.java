package kunalkushwa;

public class recursion1 {
    public static void main(String[] args) {
//        fun(10);
//        funrev(10);
//        System.out.println(digitsum(123));
//        System.out.println(digitproduct(120 ));
//        x(5);
//        System.out.println(rev(1234));
        System.out.println("====>"+countzeroes(302));

    }
    /*public static void fun(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        fun(n-1);

    }*/
    public static void funrev(int n)
    {
        if(n==0)
            return;
        funrev(n-1);
        System.out.println(n);

    }
    public static int digitsum(int n)
    {
        if(n<=9)
            return n%10;
        return n%10+digitsum(n/10);
    }
    public static int digitproduct(int n)
    {
        if(n<=9&&n>0)
            return n%10;
        return n%10*digitproduct(n/10);
    }
    public static void x(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        x(--n);

    }
    public static int rev(int n)
    {
         int digits=0;
         digits=(int)(Math.log10(n)+1);
         return helper(n,digits);
    }
    static int helper(int n,int digits)
    {
      if(n%10==n)
          return n;
      int temp=n%10;
      return temp*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);


    }
    static int countzeroes(int n)
    {
       return zhelper(n,0);

    }
    static int zhelper(int n,int c)
    {
        if(n==0)
            return c;
        int rem=n%10;
        if(rem==0)
            return zhelper(n/10,c+1);
        return zhelper(n/10,c);

    }


}
