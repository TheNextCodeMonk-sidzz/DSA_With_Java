package Arrays_ArrayList;

import java.util.Arrays;

public class Arrange_the_array {
    public static void main(String[] args) {
        int n=11;
        int[] arr= new int[n];
        int i=0;
        int j=1;
        int m=1;
        int k=2;
        while(m<=n){
            arr[i]=m;
            m+=2;
            i++;
        }
        while(k<=n){

            arr[n-j]=k;
            k+=2;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }

}
