public class JumpStatements {
    static void m1() {
        System.out.println("===> for continue");
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;

            System.out.println(i);
        }
        System.out.println("Came out of the for loop");
    }

    static void m2() {
        System.out.println("===> for Break");
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                break;

            System.out.println(i);
        }
        System.out.println("Came out of the for loop");
    }

    static void m3() {
        System.out.println("===> for Return :");
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                return;

            System.out.println(i);
        }
        System.out.println("Came out of the for loop");
    }

    public static void main(String[] args) {
        m1();
        m2();
        m3();
    }
}


