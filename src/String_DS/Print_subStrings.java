package String_DS;

public class Print_subStrings {

    public static void main(String[] args) {
        String str="abc";
        int n=str.length();
        String res="";
        for(int i=0;i<n;i++){
            /// this was initial approach
//            for(int j=i;j<n;j++){
//                res+=str.charAt(j);
//                System.out.println(res);
//            }
            for(int j=i;j<n;j++){
                System.out.println(str.substring(i,j+1));
            }
//            res="";

        }
    }
}
