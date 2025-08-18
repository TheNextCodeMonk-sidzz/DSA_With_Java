package Hash.HashMap;

import java.util.HashMap;

public class Practise_hash_map {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int Index=1;
        for(int i=0;i<=10;i++){

            map.put(i, Index);
            Index++;
        }

        System.out.println(map.get(5));
        System.out.println(map.get(3));
        System.out.println(map.get(10));
    }
}
