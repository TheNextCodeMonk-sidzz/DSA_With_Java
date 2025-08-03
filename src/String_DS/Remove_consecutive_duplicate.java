package String_DS;


import java.util.HashSet;
import java.util.Set;

public class Remove_consecutive_duplicate {
    public static void main(String[] args) {
        String s="aabbcc";

        Set<Character> string=new HashSet<>();
        StringBuilder result= new StringBuilder();

        for(char c: s.toCharArray()){
            if(!string.contains(c)){
                string.add(c);
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
