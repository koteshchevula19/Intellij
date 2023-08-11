public class LeetCode2604 {
    public static int num(int n)
    {
        int temp=n;
        temp=nnum(n);
        while(temp>9)
        {
            temp=nnum(temp);

        }
        return temp;



    }

    public static int nnum(int n)
    {
        int temp=0;
        while(n>9)
        {
            temp+=n%10;
            n/=10;
        }
        return temp+n;
    }
    public static void main(String[] args) {
        System.out.println(num(38));

    }

}
