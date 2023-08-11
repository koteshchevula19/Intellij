public class Fibnocci {

    static int  fib(int n)
    {
        if(n<2&&n>=0)
            return n;
        return fib(n-1)+fib(n-2);

    }

    public static void main(String[] args) {
        int x=fib(7);
        System.out.println(x);

    }
}
