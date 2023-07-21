public class RotateBy90Degree {
    public static void main(String[] args) {
        int[][] mat1= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] result = rotateBy90DegreeAnticlockWise(mat1);
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    //clockwise--
    public static int[][] rotateBy90DegreeClockWise(int[][] mat){
        int r = mat.length;
        int c = mat[0].length;
        int[][] res = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j] = mat[c-j-1][i];
            }
        }
        return res;
    }

    //anticlockwise--
    public static int[][] rotateBy90DegreeAnticlockWise(int[][] mat){
        int r = mat.length;
        int c = mat[0].length;
        int[][] res = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j] = mat[j][r-i-1];
            }
        }
        return res;
    }
}
