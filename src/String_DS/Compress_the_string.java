package String_DS;
import java.util.*;
public class Compress_the_string {
    public static String getCompressedString(String str) {
        // Write your code here.

        if (str == null || str.length() == 0) return "";

        StringBuilder s=new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++){

            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                s.append(str.charAt(i-1));
                if(count!=1){
                    s.append(count);
                }

                count=1;

            }


        }
        s.append(str.charAt(str.length()-1));
        if(count!=1){
            s.append(count);
        }


        return s.toString();
    }


    public static void main(String[] args) {
        String str="aaabbcdde";

        System.out.println(getCompressedString(str));
    }

}
