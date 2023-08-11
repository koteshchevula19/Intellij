public class Do_While {
    static void m1()
    { int i=10;
        do {
            System.out.println("Hello I'm in Do block");
            System.out.println(i);
            i++;
        }
        while (i>10&&i<=100);

    }

    public static void main(String[] args) {
        m1();
    }
}
