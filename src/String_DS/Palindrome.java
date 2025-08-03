package String_DS;
import java.util.*;

public class Palindrome {
    public static boolean isPermutation(String str1, String str2) {
        //Your code goes here

        //first think and check if size is same
        // then easy method was not just to check each ch like in int ; convert them in arrays
        //then sort them
        // then check if they are equal;
        if(str1.length()!=str2.length()){
            return false;
        }

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);


    }

    public static void main(String[] args) {
        String str1="aabcde";
        String str2="bcdeaa";

        System.out.println(isPermutation(str1,str2));




    }
}
