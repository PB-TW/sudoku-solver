package solution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SudokuSolverTest {

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
}
