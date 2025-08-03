package Arrays_ArrayList;

import java.util.Arrays;

public class second_largest {
    public static void main(String[] args) {
        int[] arr={12,15,27,45,25,1,65,88,15,32};

        int n=arr.length;
        Arrays.sort(arr);
        System.out.println(arr[n-2]);

    }
}
