import java.util.Scanner;

class InputOutput2DArray{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the no. of rows and columns:");
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] mat = new int[row][col];
            System.out.print("Enter the elements:");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    mat[i][j] = sc.nextInt();
                }
            }
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            sc.close();
        }            
}