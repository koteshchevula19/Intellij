public class SimplifyPath {

    public static String simplifyPath(String path) {

        String[] origin = path.split("/");
        System.out.println("===> " + origin.length);
        System.out.println("===> " + origin[0].length());
        System.out.println("===> " + origin[1]);
        System.out.println("For loop");
        for (int i = 0; i < origin.length; i++) {
            System.out.println("===> " + origin[i]);
        }

        String[] res = new String[origin.length];
        int k = 0;
        for (int i = 0; i < origin.length; i++) {
            if (origin[i].equals(".") || origin[i].equals("")) continue;
            else if (origin[i].equals("..")) k = k > 0 ? k - 1 : k;
            else res[k++] = origin[i];
        }
        String ans = "";
        for (int i = 0; i < k; i++) {
            ans += "/" + res[i];
            System.out.println(ans);
        }
        return ans.length() == 0 ? "/" : ans;

    }

    public static void main(String[] args) {
         System.out.println(simplifyPath("//Hello///world//!"));
         String s1="My  name is kotesh  Chevula";
        String[] s2= s1.split(" ");
        System.out.println("====> "+s2.length);


    }
}