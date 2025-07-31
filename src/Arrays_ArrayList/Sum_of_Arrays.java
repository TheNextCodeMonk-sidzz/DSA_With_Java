package Arrays_ArrayList;

import java.util.Arrays;

public class Sum_of_Arrays {
    public static void main(String[] args) {
        int[] arr1={3, 9 , 9};
        int[] arr2={1,4 ,8 ,7};
        int n=arr1.length;
        int m=arr2.length;
        int max=Math.max(n,m);
        int[] sum=new int[max];
        int carry=0;
        int digit=0;
        int i=n-1;
        int j=m-1;
        int k=max-1;

        while(i>=0 && j>=0){
            digit=arr1[i]+arr2[j]+carry;
            carry=digit/10;
            digit=digit%10;
            sum[k]=digit;
            i--;j--;k--;
        }
        while(i>=0){
            digit=arr1[i]+carry;
            carry=digit/10;
            digit=digit%10;
            sum[k]=digit;
            i--;k--;
        }
        while(j>=0){
            digit=arr2[j]+carry;
            carry=digit/10;
            digit=digit%10;
            sum[k]=digit;
            j--;k--;
        }
        System.out.println(Arrays.toString(sum));

    }
}
