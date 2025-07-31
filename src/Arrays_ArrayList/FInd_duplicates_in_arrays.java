package Arrays_ArrayList;
import java.util.*;
public class FInd_duplicates_in_arrays {
    public static void intersections(int arr1[], int arr2[]) {
        //Your code goes here
        ArrayList<Integer> list=new ArrayList<>();
        // List<Integer> resList=new ArrayList<>();
        for(int num:arr2){
            list.add(num);
        }

        for(int num:arr1){
            if(list.contains(num)){
                // resList.add(num);
                System.out.print(num+ " ");
                list.remove(Integer.valueOf(num));
            }

        }
    }
}
/*
* Problem statement
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first array/list(ARR1)


Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1 sec
Sample Input 1 :
2
6
2 6 8 5 4 3
4
2 3 4 7
2
10 10
1
10
Sample Output 1 :
2 4 3
10
Sample Input 2 :
1
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
2 1 2*/