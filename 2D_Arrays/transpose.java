public class transpose {
    public static void main(String[] args) {
        int[][] matrix= { {2,3,7}, {5,6,7} };
        int row=2;
        int col=3;
        int[][] transpose=new int[col][row];
        for(int i=0;i<row;i++) 
        {
            for(int j=0;j<col;j++)
             {
                transpose[j][i] =matrix[i][j];
            }
        }
        for(int i=0;i<col;i++) {
            for(int j=0;j<row;j++)
            {
                System.out.print(transpose[i][j] +" ");
            }
            System.out.println();
        }

    }
}
