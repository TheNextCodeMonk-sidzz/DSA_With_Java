package Leetcode_daily;
//https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/description/?envType=daily-question&envId=2025-08-26
public class Maximum_Area_of_LongestDiagonalRectangl {

    public int areaOfMaxDiagonal(int[][] dimensions) {

        int n=dimensions.length;
        double max=0;
        int res=0;


        for(int i=0;i<n;i++){
            double x= Math.sqrt((dimensions[i][0]*dimensions[i][0])+(dimensions[i][1]*dimensions[i][1]));
            if(x>max){
                max=x;
                res=dimensions[i][0]*dimensions[i][1];
            }else if (x==max){
                int ans=dimensions[i][0]*dimensions[i][1];
                res=Math.max(res,ans);
            }
        }

        return res;

    }
}
