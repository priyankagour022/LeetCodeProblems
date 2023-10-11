class MatrixTranspose{
    public static void main(String[] args) {
        int[][] mat1 = {{1,2},{3,4}};
        int[][] mat = new int[2][2];
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                mat[i][j] = mat1[j][i];
            }
        } 
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.println(mat[i][j]);
            }
        }
    }
}