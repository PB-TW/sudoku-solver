package solution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SudokuSolverTest {

    @Test
    void solve_shouldFindTheSolution_givenSudokuGrid() {
        int[][] grid = {
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

        int[][] expected = {
                {9,5,8,  7,1,2,  4,6,3 },
                {1,4,7,  3,6,9,  2,8,5 },
                {2,3,6,  8,4,5,  7,1,9 },

                {6,8,4,  5,2,1,  9,3,7 },
                {3,2,1,  9,7,8,  5,4,6 },
                {7,9,5,  4,3,6,  8,2,1 },

                {5,1,3,  2,8,7,  6,9,4 },
                {4,7,2,  6,9,3,  1,5,8 },
                {8,6,9,  1,5,4,  3,7,2 }
        };

        SudokuSolver s = new SudokuSolver(grid);
        s.solve();

        SudokuSolver expectedSolution = new SudokuSolver(expected);
        assertEquals(expectedSolution.gridToString(), s.gridToString());
    }

    @Test
    void possible_shouldReturnTrue_givenGridIsEmpty() {
        int[][] grid = {
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },

                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },

                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 }
        };

        SudokuSolver s = new SudokuSolver(grid);
        assertTrue(s.possible(0, 0, 1));
    }

    @Test
    void possible_shouldReturnFalse_givenRowContainsInput() {
        int[][] grid = {
                {0,0,0,     0,0,1,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },

                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },

                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 }
        };

        SudokuSolver s = new SudokuSolver(grid);
        assertFalse(s.possible(0, 0, 1));
    }

    @Test
    void possible_shouldReturnFalse_givenColumnContainsInput() {
        int[][] grid = {
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },

                {0,0,0,     0,0,0,      0,0,0 },
                {1,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },

                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 }
        };

        SudokuSolver s = new SudokuSolver(grid);
        assertFalse(s.possible(0, 0, 1));
    }

    @Test
    void possible_shouldReturnFalse_givenSquareContainsInput() {
        int[][] grid = {
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },
                {0,1,0,     0,0,0,      0,0,0 },

                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },

                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 }
        };

        SudokuSolver s = new SudokuSolver(grid);
        assertFalse(s.possible(0, 0, 1));
    }

    @Test
    void gridToString_shouldReturnFormattedGrid_givenGrid() {
        int[][] grid = {
                {1,2,3,     4,5,6,      7,8,9 },
                {4,5,6,     0,0,0,      0,0,0 },
                {7,8,9,     0,0,0,      0,0,0 },

                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },

                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 },
                {0,0,0,     0,0,0,      0,0,0 }
        };

        String expected =
                "123  456  789\n" +
                "456  000  000\n" +
                "789  000  000\n" +
                "\n" +
                "000  000  000\n" +
                "000  000  000\n" +
                "000  000  000\n" +
                "\n" +
                "000  000  000\n" +
                "000  000  000\n" +
                "000  000  000\n";

        SudokuSolver s = new SudokuSolver(grid);
        assertEquals(expected, s.gridToString());
    }
}
