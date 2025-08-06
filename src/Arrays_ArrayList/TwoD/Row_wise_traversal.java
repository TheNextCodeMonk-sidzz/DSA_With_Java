package Arrays_ArrayList.TwoD;

public class Row_wise_traversal {
        public static int[] printRowWise(int [][]a) {
            // Write your code here.
            int rows=a.length;
            int col=a[0].length;
            int index=0;
            int[] ans=new int[rows*col];
            for (int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    ans[index++]=a[i][j] ;
                }
            }
            return ans;
        }

}
