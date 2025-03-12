public class largest{
    public static void main(String[] args) {
        int[][] matrix={{8,12,3},{4,5,16},{7,1,9}};
        int n=matrix.length;
        int m=matrix[0].length;
        int lar=Integer.MIN_VALUE;
        int sma=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]>lar)
                    lar=matrix[i][j];
                }
            }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]<sma){
                    sma=matrix[i][j];
                }
            }
        }
        System.out.println("largest:"+lar);
        System.out.println("smallest:"+sma);
    }
}