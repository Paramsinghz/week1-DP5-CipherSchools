
public class Sortedmatrixsearch {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0, j = m - 1;

        while (i <= n - 1 && j >= 0) {
            if (target == matrix[i][j]) {
                return true;
            } else if (target < matrix[i][j]) {
                j--;
            } else if (target > matrix[i][j]) {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
