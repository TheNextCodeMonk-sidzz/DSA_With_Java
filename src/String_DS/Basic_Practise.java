package String_DS;

import java.util.Scanner;

public class Basic_Practise {
    public static void main(String[] args) {
        char[] ch={'a','b','c','d'};
        System.out.println(ch.getClass());;
        System.out.println(Character.toUpperCase(ch[0]));

        String name="Siddhant";
        String Surname="Bhujbal";
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        int n=name.length();
        System.out.println(n);
        System.out.println(name.equals("siddhant"));
        System.out.println(name.charAt(3));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String k=name+Surname;
        System.out.println(k);
        String fullname= name.concat(Surname);
        System.out.println(fullname);
        System.out.println(name.contains("S"));

        System.out.println(name.substring(0,3));
        System.out.println(name.replace('a','A'));
        System.out.println(name.compareTo(Surname));

//        Scanner sc=new Scanner(System.in);
//        String sentence=sc.nextLine();
        String saying="Hi , How are you";
        System.out.println(saying);
        int words=0;
        for(int i=0;i<saying.length();i++){
            if(saying.endsWith(" ")){
                words++;
            }
        }
        System.out.println(words);

    }
}
