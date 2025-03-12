public class searchinsorted{
    public static void main(String args[]){
        int[][] matrix={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=30;
        // int row=0;
        // int col=matrix[0].length-1;
        // while(row<matrix.length && col>=0){
        //     if(key==matrix[row][col]){
        //         System.out.println("key found at ("+row+","+col+")");
        //         return;
        //     }
        //     else if(key<matrix[row][col]){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }
        int row=matrix.length-1;
        int col=0;
        while(row<matrix.length && col>=0){
            if(key==matrix[row][col]){
                System.out.println("key found at ("+row+","+col+")");
                return;
            }
            else if(key<matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("key not found!!");
       

    }
}