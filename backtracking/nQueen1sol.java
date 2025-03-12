public class nQueen1sol {
    public static void printBoard(char[][] board){
        System.out.println("-----NQUEENS----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static boolean isSafe(char[][] board,int row,int col){
        //vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal up
        for(int i=row-1, j=col-1;i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right diagonal up
        for(int i=row-1, j=col+1;i>=0 && j<board.length; i--,j++  ){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueens(char[][] board,int row){
        //base case
        if(row==board.length){
            return true;
        }
        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nQueens(board, row+1)){
                    return true;
                
            } 
            board[row][j]='x';//backtracking
        }
    }
        return false;
    }
    public static void main(String[] args){
        int n=2;
        char[][] board=new char[n][n];
        //initialization
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
        if(nQueens(board,0)){
            System.out.println("Solution exists");
            printBoard(board);
        } else{
            System.out.println("Solution does not exists");
        }
       
    }
}
