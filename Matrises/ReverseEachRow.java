public class ReverseEachRow {
    public static void main(String[] args) {
        int[][] mat1= {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 6} };
        int[][] reverseMat = reverseRow(mat1);
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                System.out.print(reverseMat[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static int[][] reverseRow(int[][] m1){
        int row = m1.length;
        int col = m1[0].length;
        int[][] reverse = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                reverse[i][j] = m1[i][col-j-1];
            }
        }
        return reverse;
    }

    public static int[][] reverseColumn(int[][] m1){
        int row = m1.length;
        int col = m1[0].length;
        int[][] reverse = new int[row][col];
        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                reverse[i][j] = m1[row-i-1][j];
            }
        }
        return reverse;
    }

    public static int[][] reverseLeftDiagonals(int[][] m1){
        int row = m1.length;
        int col = m1[0].length;

        int[][] reversedMatrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    reversedMatrix[i][j] = m1[col - j - 1][col - j - 1];
                } else {
                    reversedMatrix[i][j] = m1[i][j];
                }
            }
        }

        return reversedMatrix;
    }
}
