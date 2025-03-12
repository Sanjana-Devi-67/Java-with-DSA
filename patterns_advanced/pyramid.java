public class pyramid {
    public static void main(String[] args) {
        int n=4;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=i;k++){
                System.out.print(count+"\t"+"\t");
                count++;
            }
            System.out.println();
        }
    }
}
