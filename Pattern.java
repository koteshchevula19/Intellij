public class Pattern {


    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println('a');
        int value=0;
        for(int row=0;row<8;row++)
        {
            for(int col=0;col<8;col++)
            {
                 value=4-Math.min(Math.min(row,col),Math.min(7-row,7-col));
                 System.out.print(value+" ");
            }
            System.out.println();
        }

    }
}
