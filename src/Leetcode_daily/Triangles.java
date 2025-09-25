package Leetcode_daily;
//https://leetcode.com/problems/triangle/description/?envType=daily-question&envId=2025-09-25
import java.util.List;

public class Triangles {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col < triangle.get(row).size(); col++) {
                int current = triangle.get(row).get(col);
                int down = triangle.get(row + 1).get(col);
                int downRight = triangle.get(row + 1).get(col + 1);

                triangle.get(row).set(col, current + Math.min(down, downRight));
            }
        }

        return triangle.get(0).get(0);

    }
}
