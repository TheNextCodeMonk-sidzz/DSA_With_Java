package Leetcode_daily;
//https://leetcode.com/problems/sort-vowels-in-a-string/description/?envType=daily-question&envId=2025-09-11
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_Vowels_in_string {
    public String sortVowels(String s) {
        String vow="aeiouAEIOU";
        int n=s.length();
        List<Character> vowList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (vow.indexOf(c)!=-1) {
                vowList.add(c);
            }
        }
        Collections.sort(vowList);
        StringBuilder x=new StringBuilder();
        int vowId=0;
        for(int i=0;i<n;i++){
            if(vow.indexOf(s.charAt(i))!=-1){
                x.append(vowList.get(vowId++));
            }
            else{
                x.append(s.charAt(i));
            }
        }

        return x.toString();
    }
}
