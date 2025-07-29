package Arrays_ArrayList;

import java.util.Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] n){
        int rev=0;
        int m=n.length-1;
        int start=0;
        int end=m;
        System.out.println(m);
        System.out.println(start);

        while(start<end){
            int temp=n[start];
            n[start]=n[end];
            n[end]=temp;
            start++;
            end--;
        }


    }
}
