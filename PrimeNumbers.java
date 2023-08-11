public class PrimeNumbers {
    public static void main(String[] args) {
        int n=30;
        boolean[] prime=new boolean[n+1];
        isPrime(n,prime);

    }



    static void isPrime(int n,boolean[] prime)
    {
        for(int i=2;i*i<=n;i++)
        {
            for(int j=2*i;j<=n;j+=i)
            {
                if(!prime[j])
                    prime[j]=true;
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(!prime[i])
            {
                System.out.print(i+"  ");
            }
        }
    }
}
