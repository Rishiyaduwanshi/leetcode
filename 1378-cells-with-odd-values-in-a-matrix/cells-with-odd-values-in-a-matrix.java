class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];

        for (int[] index : indices) {
            row[index[0]]++;
            col[index[1]]++;
        }

        int oddRows = 0, oddCols = 0;

        for (int r : row) {
            if (r % 2 != 0) oddRows++;
        }

        for (int c : col) {
            if (c % 2 != 0) oddCols++;
        }

        int oddCount = (oddRows * (n - oddCols)) + (oddCols * (m - oddRows));

        return oddCount;
    }

}
