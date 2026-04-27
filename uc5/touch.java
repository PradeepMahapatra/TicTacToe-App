public class MoveValidator {

    // Method to validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Boundary check (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("❌ Invalid move! Out of bounds.");
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != ' ') {
            System.out.println("❌ Cell already occupied!");
            return false;
        }

        return true; // move is valid
    }
}
