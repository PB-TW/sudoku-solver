package solution;

import static java.util.stream.IntStream.range;

public class SudokuSolver {

    private final int[][] grid;

    public SudokuSolver(int[][] grid) {
        this.grid = grid;
    }

    public void solve() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                if (grid[x][y] == 0) {
                    for (int input = 1; input <= 9; input++) {
                        if (possible(x, y, input)) {
                            grid[x][y] = input;
                            solve();
                            grid[x][y] = 0;
                        }
                    }
                    return;
                }
            }
        }
        print();
    }

    public boolean possible(int x, int y, int input) {
        return possibleInRow(x, input)
                && possibleInColumn(y, input)
                && possibleInSquare(x, y, input);
    }

    private boolean possibleInRow(int x, int input) {
        return range(0, 9).noneMatch(i -> grid[x][i] == input);
    }

    private boolean possibleInColumn(int y, int input) {
        return range(0, 9).noneMatch(i -> grid[i][y] == input);
    }

    private boolean possibleInSquare(int x, int y, int input) {
        int x0 = x - x%3;
        int y0 = y - y%3;

        return range(x0, x0 + 3)
                .noneMatch(xInSquare -> range(y0, y0 +3)
                        .anyMatch(yInSquare -> grid[xInSquare][yInSquare] == input)
                );
    }

    public void print() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                System.out.print(grid[x][y] + " ");
                if (y%3 == 2) {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
            if (x%3 == 2) {
                System.out.print("\n");
            }
        }
    }
}
