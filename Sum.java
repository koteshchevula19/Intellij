public class Sum {

    public static void main(String[] args) {
        System.out.println(sum(3,2));

    }
    public static int sum(int x,int y)
    {
        if(x==0)
            return y;
        return 1+sum(x-1,y);
    }
}
