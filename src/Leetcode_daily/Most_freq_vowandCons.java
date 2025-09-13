package Leetcode_daily;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/description/?envType=daily-question&envId=2025-09-13
public class Most_freq_vowandCons {

    public int maxFreqSum(String s) {
        Map<Character , Integer> map=new HashMap<>();
        String c="aeiou";
        int n=s.length();
        int maxVow=0;
        int maxCons=0;

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

            int count = map.get(ch);

            if(c.indexOf(ch)!=-1){
                maxVow=Math.max(maxVow,count);
            }else{
                maxCons=Math.max(maxCons,count);
            }


        }
        return maxVow+maxCons;


    }
}

