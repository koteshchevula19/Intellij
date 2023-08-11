package charArray;

import java.util.Arrays;

public class charArray1 {
    public static void main(String[] args) {
        String s1="Hello!";
        char c1[]=s1.toCharArray();
        for(char c:c1){
            System.out.println(c);
        }
        for(int i=0;i<c1.length;i++)
        {
            System.out.print(c1[i]+", ");
        }
        System.out.println();
        int j=0;
        while(j<c1.length){
            System.out.print(c1[j]+", ");
            j++;
        }
        System.out.println();
        System.out.println(s1);
        String s2[]={"Hello", "my", "Name" ,"is" };
        System.out.println(Arrays.toString(s2));
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int a[] :arr1){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }

    }
}
