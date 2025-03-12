public class searchinarray{
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};;
        int n=matrix.length;
        int m=matrix[0].length;
        int key=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(matrix[i][j]==key){
                System.out.println("Found at: ("+i+","+j+")");
                return;
               }
            }
        }
        System.out.print("Key not found!!"); 
        
    }
}