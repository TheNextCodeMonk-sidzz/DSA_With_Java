package Search_And_Sort.Searching_Techniques;

public class Find_index_in_Infinite_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9, 25, 30, 47, 65, 90,
                     100, 120, 150, 200, 250, 300, 350, 400, 450,
                     500, 550, 600, 650, 700, 750, 800, 850, 900,
                     950, 1000};
        int target = 1000;
        int result=size(arr, target);
        System.out.println(result);
    }
    static int size(int[] arr, int target) {
        int start=0;
        int end = 1;

        while(end < arr.length && target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;// double the end index to find the range
        }
        if (end >= arr.length) {
            end = arr.length - 1;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr, int target, int start, int end){
        int ans=-1;
        while(start<=end){
            int mid=start +(end-start)/2; // why? if start +end might go out of range in java integer range
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid; // return the index of the target element
            }
        }
        return ans;
    }


}
