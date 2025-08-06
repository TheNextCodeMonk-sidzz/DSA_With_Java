package Search_And_Sort.Searching_Techniques;

public class Binary_search_logic {
    public static void main(String[] args){
        /*
        * 1) The Array should be Sorted :
        *           #Ascending
        *           #Descending
        * 2) Then Find the Middle element of the array
        * 3) Check if its less or greater than the target element
        * 4) If less -> traverse right
        * 5) If Greater -> traverse left
        * 6) If the middle element is the target -> target found.
        * 7) you can optimize this approach again by finding the middle again
        * 8) use While loop because we dont know till where the loop will run.

        *
        * */

        int[] arr={1,2,3,4,5,6,9,25,30,47,65,90};
        int target=90;
        boolean result =BinarySearch(arr,target);
        System.out.println(result);

    }

    static boolean BinarySearch(int[] arr, int target){

        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=start +(end-start)/2; // why? if start +end might go out of range in java integer range
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}
