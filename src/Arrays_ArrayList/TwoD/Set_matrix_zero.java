package Arrays_ArrayList.TwoD;

public class Set_matrix_zero {
    public static void setZeros(int matrix[][]) {
        // Write your code here..


        int rows = matrix.length;
        int col = matrix[0].length;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < col; k++) {
                        matrix[i][k]=0;
                    }
                }
                System.out.print(matrix[i][j]);


            }
            System.out.println();

        }

    }
    public static void main (String[]args){
        int[][] matrix = {{1, 2, 3}, {2, 1, 3}, {3, 0, 1}};
        setZeros(matrix);
    }
}