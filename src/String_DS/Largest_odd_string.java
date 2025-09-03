package String_DS;
//https://leetcode.com/problems/largest-odd-number-in-string/
public class Largest_odd_string {
    public String largestOddNumber(String num) {
        int n= num.length(); // here we can just check the length of string

        for(int i=n-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){ // here we check if the lagt digit is odd or even
                return num.substring(0,i+1);
            }

        }
        return "";


    }
}
