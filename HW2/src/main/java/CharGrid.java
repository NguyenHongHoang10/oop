// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
    private char[][] grid;

    /**
     * Constructs a new CharGrid with the given grid.
     * Does not make a copy.
     * @param grid
     */
    public CharGrid(char[][] grid) {
        this.grid = grid;
    }

    /**
     * Returns the area for the given char in the grid. (see handout).
     * @param ch char to look for
     * @return area for given char
     */
    public int charArea(char ch) {
        int maxi = 0, mini = grid.length, maxj = 0, minj = grid[0].length;
        boolean found = false;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == ch) {
                    found = true;
                    if(i > maxi) maxi = i;
                    if(i < mini) mini = i;
                    if(j > maxj) maxj = j;
                    if(j < minj) minj = j;
                }
            }
        }
        if(!found) return 0;
        return (maxi - mini + 1) * (maxj - minj + 1);
    }

    /**
     * Returns the count of '+' figures in the grid (see handout).
     * @return number of + in grid
     */
    public int countPlus() {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                char c = grid[i][j];
                int k = 1;
                while (i - k >= 0 && i + k < n &&
                        j - k >= 0 && j + k < m &&
                        grid[i - k][j] == c &&
                        grid[i + k][j] == c &&
                        grid[i][j - k] == c &&
                        grid[i][j + k] == c) {
                    k++;
                }
                if (k > 1) cnt++;
            }
        }
        return cnt;
    }


}
