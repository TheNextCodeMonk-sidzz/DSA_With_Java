package Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Rotations {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7};
        String dir="LEFT";
        int n= arr.length;
        int x=2;
        ArrayList<Integer> list=new ArrayList<>();
        int[] b=new int[n];
        System.out.println(Arrays.toString(arr));


        switch(dir){
            case "LEFT":
                for(int i=0;i<n;i++){
                    b[(i-x+n)%n]=arr[i];
                }
                System.out.println(Arrays.toString(b));
                break
            ;
            case "Right":
                for(int i=0;i<n;i++){
                    b[(i+x)%n]=arr[i];

                System.out.println(Arrays.toString(b));
                break;
            }
        }
    }
}
