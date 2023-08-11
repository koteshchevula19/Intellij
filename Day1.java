public class Day1 {

    public static void main(String[] args) {
        int[][] arr={{0,1,2},{3,4,5},{6,7,8}};
        for(int row=0;row<1;row++)//outer loop
        {
            for(int col=0;col<=2;col++)
            {
                System.out.print(arr[row][col]+" | ");
            }
            System.out.println();

        }

    }
}
