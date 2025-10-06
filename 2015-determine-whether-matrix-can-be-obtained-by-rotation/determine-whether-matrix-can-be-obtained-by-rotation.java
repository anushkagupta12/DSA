class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int k = 0; k < 4; k++) { // check all 4 rotations
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            mat = rotate(mat); // rotate 90° clockwise
        }
        return false;
    }

     public int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
        return matrix;
}
}