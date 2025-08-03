package String_DS;

public class Reverse_each_word {

//    public static StringBuffer Rev(String str){
//        StringBuffer a=new StringBuffer("");
//        for(int i=str.length()-1;i>=0;i--){
//            a=a.append(str.charAt(i));
//        }
//
//        return a;
//    }
    public static void main(String[] args) {

        String str="Hello I am Aadil";
        String[] words=str.split(" ");
        StringBuffer a=new StringBuffer();
        for (String s : words) {
            for (int j = s.length() - 1; j >= 0; j--) {
                a.append(s.charAt(j));
            }
            a.append(" ");
        }

        System.out.println(a);
    }
}

///  my method first was to reverse the whole string
///  then i realized that wach word should be reverdsed individiually
///  then i just added each word in a array and splited them to get the length ;
///  then i use another for loop to loop all the words inside the words array and reverse them individually.
///  to seperate the words i added space after the nested loop
///  and at last i used trim to remove the initial and last space.


// also you should use string buffer to reduce the memory space , it help to mutate the original spring
//. and do the mutable operations
// can use stringReducer also
