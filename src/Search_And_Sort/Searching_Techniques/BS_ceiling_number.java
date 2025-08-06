package Search_And_Sort.Searching_Techniques;
// in this que we are gonna find the smallest yet closest num to the target value.
public class BS_ceiling_number {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,9,25,30,47,65,90};
        int target=95;
        int result =BinarySearch_Ceiling(arr,target);
        System.out.println(result);
    }

    static int BinarySearch_Ceiling(int[] arr,int target) {
        int ans = 0;
        int start = 0;
        int end = arr.length - 1;
        if(target>arr[end]){
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2; // why? if start +end might go out of range in java integer range
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return arr[start];
    }
}
