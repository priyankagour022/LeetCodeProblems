import java.util.Scanner;
public class SumOfMatrix {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the values of row :");
        int r = sc.nextInt();
        System.out.print("Enter the values of col :");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        System.out.print("Enter the value in matrix a :");
        matrixRead(a);
        System.out.print("Enter the value in matrix b :");
        matrixRead(b);
        
        int[][] d = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                d[i][j] = a[i][j]+b[i][j];
            }
         }
         System.out.println("The resultant matrix is :");

         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
         }
        

     }
     static void matrixRead(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j] = sc.nextInt();
            }
        }
     }
}
