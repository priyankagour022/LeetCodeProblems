public class Addition {
    public static void main(String[] args) {
        int[][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] m2 = {{1,2,3},{4,5,6},{7,8,9}};
        int n = m1.length;
        int[][] m3 = matSubtraction(m1,m2,n);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(m3[i][j]+" ");;
            }
            System.out.println();
        }
    }
    public static int[][] matAddition(int[][] m1 , int[][] m2 , int n){
        int[][] m3 = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m3[i][j] = m1[i][j]+m2[i][j];
            }
        }
        return m3;
    }

     public static int[][] matSubtraction(int[][] m1 , int[][] m2 , int n){
        int[][] m3 = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m3[i][j] = m1[i][j]-m2[i][j];
            }
        }
        return m3;
    }
}
