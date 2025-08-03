package String_DS;

public class Count_words {

    public static void Split(String saying){
        String[] s=saying.split(" ");
        System.out.println(s.length);
    }


    public static void main(String[] args) {
/// / using for loop
//        String saying="Hi , How are you";
//        System.out.println(saying);
//        int words=1;
//
//
//        for(int i=0;i<saying.length();i++){
//            if(saying.charAt(i)==' '){
//                words++;
//            }
//        }
//
//        System.out.println(words);

        /// / using Split method

        String saying="Hi , How are you";
        Split(saying);


    }
}
