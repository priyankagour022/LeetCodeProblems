public class SumOfRow {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        sumOfRow(arr,n);
        System.out.println();
        sumOfColumn(arr,n);
        System.out.println();
        sumOfDiagonals(arr,n);
    }
    //sum of each row--
    public static void sumOfRow(int[][] arr , int n){
         for(int i=0;i<n;i++){
             int sum = 0;
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
            System.out.print(sum+" ");
        }
        
    }
    //sum of each column--
     public static void sumOfColumn(int[][] arr , int n){
         for(int i=0;i<n;i++){
             int sum = 0;
            for(int j=0;j<n;j++){
                sum+=arr[j][i];
            }
            System.out.print(sum+" ");
        }
        
    }
     public static void sumOfDiagonals(int[][] arr , int n){
        int sum1 = 0 , sum2 = 0; 
        for(int i=0;i<n;i++){
                sum1+=arr[i][i];
                sum2+=arr[i][n-i-1];
            

            }
            System.out.print(sum1+sum2); 
    }

}
