package Search_And_Sort.Searching_Techniques;

public class Linear_Search {
    public static void main(String[] args) {

        int[] arr={11,22,13,15,24,30};
        int target=18;
        boolean ans= linearsearch(arr,target);
        System.out.println(ans);
    }

    static boolean linearsearch(int[] arr,int target){
        // check if the array is empty
        if(arr.length==0){
            return false;
        }

        // loop through the array to find the target element
        //you can iterate using index or advanced for loop
        for(int element: arr){
            if(element==target){
                return true;
            }
        }

        return false;
    }
}

// same goes for string , just use the for each and convert the string to string arr and search
