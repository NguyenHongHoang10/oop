//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
    private boolean[][] grid;

    /**
     * Constructs a new instance with the given grid.
     * Does not make a copy.
     * @param grid is the grid
     */
    public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
    }

    /**
     * Does row-clearing on the grid (see handout).
     */
    public void clearRows() {
        int n= grid.length;
        int m = grid[0].length;
        int cnt= 0;
        for (int i = 0; i < m; i++) {
            if (!isFullRow(i)) {
                for (int x = 0; x < n; x++) {
                    grid[x][cnt] = grid[x][i];
                }
                cnt++;
            }
        }

        for (int y = cnt; y < m; y++) {
            for (int x = 0; x < n; x++) {
                grid[x][y] = false;
            }
        }
    }


    private boolean isFullRow(int y) {
        for (int x = 0; x < grid.length; x++) {
            if (!grid[x][y]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns the internal 2d grid array.
     *
     * @return 2d grid array
     */
    public boolean[][] getGrid() {
        return grid;
    }
}
