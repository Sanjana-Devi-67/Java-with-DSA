public class shortestpath{
    public static void main(String[] args){
        String path="WNEENESENNN";
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='W'){
                x--;
           }
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        float res=(float)Math.sqrt(X2+Y2);
        System.out.println("Shortest path:"+res);
    }
} 