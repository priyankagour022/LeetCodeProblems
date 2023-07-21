public class Multiplication {
    public static void main(String[] args) {
        int[][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] m2 = {{1,2,3},{4,5,6},{7,8,9}};
        int n = m1.length;
        int[][] res = matMultiplication(m1,m2,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] matMultiplication(int[][]m1 , int[][] m2 , int n){
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[i][j] = 0;
                for(int k=0;k<n;k++){
                   res[i][j] += m1[i][k]*m2[k][j]; 
                }
            }
        }
        return res;
    }
}
