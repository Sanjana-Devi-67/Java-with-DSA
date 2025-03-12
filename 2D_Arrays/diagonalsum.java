public class diagonalsum{
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sum=0;
    //    for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             //PRIMARY DIAGONAL
    //             if(i==j){
    //                 sum+=matrix[i][j];
    //             }
    //             //SECONDARY DIAGONAL
    //             else if(i+j==matrix.length-1){
    //                 sum+=matrix[i][j];
    //             }
    //         }
    //     }
      //alternate and best approach
      for(int i=0;i<matrix.length;i++){
        //pd
        sum+=matrix[i][i];
        //sd
        if(i!=matrix.length-1-i){
            sum+=matrix[i][matrix.length-1-i];
        }
      }
       System.out.println(sum);
    }
}