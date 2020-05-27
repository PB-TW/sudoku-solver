package sudoku;

/*
Sudoku riddle:

9 - -   - - -   - - 3
1 - -   3 - -   2 - -
- - 6   8 4 5   7 1 -

- - -   5 - 1   9 3 -
3 2 -   9 - -   5 - -
- - -   - - 6   - 2 -

5 - -   - - 7   6 - -
- - -   6 - -   - - 8
8 - -   - 5 4   3 - -



Sudoku solution:

9 5 8   7 1 2   4 6 3
1 4 7   3 6 9   2 8 5
2 3 6   8 4 5   7 1 9

6 8 4   5 2 1   9 3 7
3 2 1   9 7 8   5 4 6
7 9 5   4 3 6   8 2 1

5 1 3   2 8 7   6 9 4
4 7 2   6 9 3   1 5 8
8 6 9   1 5 4   3 7 2
 */
public class Main {

    private static final int[][] grid = {
            {9,0,0,     0,0,0,      0,0,3 },
            {1,0,0,     3,0,0,      2,0,0 },
            {0,0,6,     8,4,5,      7,1,0 },

            {0,0,0,     5,0,1,      9,3,0 },
            {3,2,0,     9,0,0,      5,0,0 },
            {0,0,0,     0,0,6,      0,2,0 },

            {5,0,0,     0,0,7,      6,0,0 },
            {0,0,0,     6,0,0,      0,0,8 },
            {8,0,0,     0,5,4,      3,0,0 }
    };

    public static void main(String[] args) {
        SudokuSolver solver = new SudokuSolver(grid);
        System.out.println(solver.gridToString());
        solver.solve();
        System.out.println("-------------\n");
        System.out.println(solver.gridToString());
    }
}
