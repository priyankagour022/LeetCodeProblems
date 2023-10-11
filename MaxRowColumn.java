public class MaxRowColumn {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int maxSum = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum+=arr[j][i];
            }
            if(sum>maxSum){
                maxSum = sum;
            }
        }
         System.out.print(maxSum);
    }
}
