package Leetcode_daily;

//https://leetcode.com/problems/count-submatrices-with-all-ones/description/?envType=daily-question&envId=2025-08-21
public class Count_Submatrices_With_All_Ones {
    public int numSubmat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int res = 0;
        int[] heights = new int[m];

        //create histogram that depicts the heights of row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }

            for (int j = 0; j < m; j++) {
                int minHeight = heights[j];
                for (int k = j; k >= 0; k--) {
                    if (heights[k] == 0) {
                        break;
                    }
                    minHeight = Math.min(minHeight, heights[k]);
                    res += minHeight;

                }
            }

        }

        return res;

    }
}

/*
*  Step-by-Step Approach

Build heights (histogram idea)

For each row, compute heights[j] = consecutive ones in column j ending at this row.

If mat[i][j] == 0, reset heights[j] = 0.

Count submatrices row by row

For each row’s heights, treat it as a histogram.

For each column j, look leftwards:

Take min_height as the smallest height among consecutive columns ending at j.

Add min_height to your answer (because that many submatrices of width (something) end at j).

 This is where your “sum of natural counts” idea fits: the consecutive nature accumulates submatrices.

Final Answer = Sum of counts across all rows.*/
