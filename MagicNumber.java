public class MagicNumber {
    public static void main(String[] args) {

        int base=5;
        int ans=0;
         int n=6;
            while (n > 0) {
                int last = n & 1;
                n = n >> 1;
                ans += last * base;
                base = base * 5;

            }
            System.out.print(ans+" ");

    }
}
