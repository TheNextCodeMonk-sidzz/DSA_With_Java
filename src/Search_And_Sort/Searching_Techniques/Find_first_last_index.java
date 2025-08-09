package Search_And_Sort.Searching_Techniques;

public class Find_first_last_index {
        public static void main(String[] args) {
            int[] arr={5,7,7,8,8,10};
            int target=8;

            int[] ans=new Find_first_last_index().searchRange(arr,target);
            System.out.println(ans[0]+" "+ans[1]);
        }
        public int[] searchRange(int[] nums, int target) {
            int[] ans={-1,-1};
            // if the array is empty

            int start=search(nums,target, true);

            int end=search(nums,target, false);

            ans[0]=start;
            ans[1]=end;

            return ans;

        }

        int search(int[] nums,int target, boolean findstartIndex){
            int ans=-1;
            // if the array is empty
            int start=0;
            int end=nums.length-1;
            //while loop to find the target element
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]<target){
                    start=mid+1;
                }else if(nums[mid]>target){
                    end=mid-1;
                }
                else{
                    ans=mid;
                    // if we are finding the start index, we need to move left
                    // if we are finding the end index, we need to move right
                    if(findstartIndex==true){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }

                }
            }
            return ans;
        }
}
