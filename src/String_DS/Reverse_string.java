package String_DS;

public class Reverse_string {

    /// / main is you have to concat each char. to make it as string.
    /// dont forget
    /// unlike int
    public static void main(String[] args) {
//        String s="ravet";
//        for(int i=s.length()-1;i>=0;i--){
//            System.out.print(s.charAt(i));
//        }
        char[] arr={'a','b','c'};
        String s=new String(arr);
        System.out.println(s);
        String a="";

        for(int i=s.length()-1;i>=0;i--){
            a=a+(s.charAt(i));
        }
        System.out.println(a);
    }
}
