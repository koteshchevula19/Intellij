public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(20,9
        ));

    }
    static int gcd(int a,int b)
    {
        if(a>b)
        {
            if(b==0)
                return a;
            return gcd(b,a%b);

        }
        else
        {
            if(a==0)
                return b;
            return gcd(b%a,a);

        }


    }
}
