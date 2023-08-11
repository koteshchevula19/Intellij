public class General {
    public static void main(String[] args) {
        int x=5;

        System.out.println(x);
        show();

    }
    static void show()
    {
        int num = true ? getNumber() : 20;
        System.out.println("TOMATO=" + num);
    }

    static int getNumber()
    {
        System.out.println(30);
        int a = 25, b=33;
        String name = true?"CAT":"";
        System.out.println(name);
        return 30;
    }
}
