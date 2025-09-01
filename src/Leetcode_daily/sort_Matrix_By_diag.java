package Leetcode_daily;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/sort-matrix-by-diagonals/submissions/1751060396/?envType=daily-question&envId=2025-08-28


public class sort_Matrix_By_diag {

    public int[][] sortMatrix(int[][] grid) {

        int n=grid.length;

        for (int startRow = 0; startRow < n; startRow++) {
            List<Integer> diagonal = new ArrayList<>();
            int r = startRow, c = 0;

            // collect
            while (r < n && c < n) {
                diagonal.add(grid[r][c]);
                r++; c++;
            }

            // sort descending
            diagonal.sort(Collections.reverseOrder());

            // put back
            r = startRow; c = 0;
            for (int val : diagonal) {
                grid[r][c] = val;
                r++; c++;
            }
        }

        // --- Top-right diagonals (row < col) --- non-decreasing
        for (int startCol = 1; startCol < n; startCol++) { // startCol=1 avoids main diag
            List<Integer> diagonal = new ArrayList<>();
            int r = 0, c = startCol;

            // collect
            while (r < n && c < n) {
                diagonal.add(grid[r][c]);
                r++; c++;
            }

            // sort ascending
            Collections.sort(diagonal);

            // put back
            r = 0; c = startCol;
            for (int val : diagonal) {
                grid[r][c] = val;
                r++; c++;
            }
        }

        return grid;

    }

    /// ////////or////////////////

    public void swap(int[][]grid ,int row1,int col1,int row2,int col2){
        int temp=grid[row1][col1];
        grid[row1][col1]=grid[row2][col2];
        grid[row2][col2]=temp;
    }
    public int[][] sortMatrixx(int[][] grid) {

        int n=grid.length;
        int m=grid[0].length;
        boolean changed=true;

        while(changed){
            changed=false;
            for(int row=0;row<n-1;row++){
                for(int col=0;col<m-1;col++){
                    if( row>=col && grid[row][col] < grid[row + 1][col + 1] ){
                        swap(grid,row,col,row+1,col+1);
                        changed = true;
                    }
                    if( row<col && grid[row][col]>grid[row+1][col+1]){
                        swap(grid,row,col,row+1,col+1);
                        changed=true;
                    }
                }
            }



        }
        return grid;

    }
}

/*
* 🔹 Approach 1: Bubble-Sort Style (your first idea)

Steps:

Loop over the grid comparing diagonal neighbors (row, col) and (row+1, col+1).

If bottom-left (row ≥ col) → ensure non-increasing. Swap if needed.

If top-right (row < col) → ensure non-decreasing. Swap if needed.

Wrap this loop inside a while(changed) or repeat n times.

Each pass “bubbles” the correct element one step closer to its place.

Keep repeating until no swaps happen.

End when matrix is stable.

Mental model: like running bubble sort on each diagonal but indirectly by scanning the whole matrix.

Pros: easy to write if you already coded the swap logic.
Cons: slower (O(n³) worst case).

🔹 Approach 2: Collect–Sort–Replace (optimal)

Steps:

Identify diagonals:

Bottom-left diagonals → start from first column (all rows).

Top-right diagonals → start from first row (all cols, skip main).

For each diagonal:

Collect elements into a temporary list.

Sort list (descending for bottom-left, ascending for top-right).

Write sorted values back along the same diagonal.

Done in one shot per diagonal.

Mental model: treat each diagonal as an independent 1D array. Sort it directly.

Pros: clean, efficient (O(n² log n)).
Cons: slightly more code to collect/write diagonals.

🚀 Next time ask yourself:

“Do I want a quick hacky fix?” → go with bubble-style repeated swaps.

“Do I want the clean & optimal solution?” → go with collect–sort–replace.

Do you want me to also give you a visual rule of thumb diagram (like sketch: bottom-left arrows ↓ sorted descending, top-right arrows ↑ sorted ascending) so you can instantly recall the directions?*/
