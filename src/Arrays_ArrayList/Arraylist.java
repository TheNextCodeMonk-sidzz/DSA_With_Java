package Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
class Arraylists{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList <Integer>> lists= new ArrayList<>();

        for (int i = 0; i < 3 ; i++) {
            lists.add(new ArrayList<>());
        }
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                lists.get(i).add(sc.nextInt());
            }
        }

        System.out.println(lists);
    }
}

public class Arraylist {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);


        for (int i=0;i<5;i++){
            list.add(sc.nextInt());
        }

        for (int i=0;i<5;i++){
            System.out.println(list.get(i));
        }


    }




}
