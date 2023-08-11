public class StaticBlock_staticMethods_StaticVariables {


   static int x=10;
   static
   {
       System.out.println(x);
       System.out.println(getB());

   }

    public static void main(String[] args) {
//        System.out.println(StaticBlock_staticMethods_StaticVariables.x);

    }
    static int getB() {
        return b;
    }
    static int b=20;






}
