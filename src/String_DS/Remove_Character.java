package String_DS;

public class Remove_Character {
    public static void main(String[] args) {
        String s="aabbcc";
        char ch='a';
        StringBuilder y=new StringBuilder();
        for(char c: s.toCharArray()){
            if(ch!=c){
                y.append(c);
            }
        }
        System.out.println(y);
    }
}
