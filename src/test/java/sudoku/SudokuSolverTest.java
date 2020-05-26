package sudoku;

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
}
