package Arrays_ArrayList;

public class Max_valueinArray {
    public static void main(String[] args) {
        int[] arr={1,2,5,7,16,25,3,7,8};

        System.out.println(max(arr));;
    }

    public static int max(int[] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    max=Math.max(max, arr[i]);

                }

            }
        }
        return max ;

    }
}
