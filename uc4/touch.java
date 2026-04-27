public class BoardUtils {

    // Method to convert slot (1-9) to row and column
    public static int[] getRowCol(int slot) {
        // Convert to zero-based index
        int index = slot - 1;

        int row = index / 3;
        int col = index % 3;

        return new int[]{row, col};
    }
}
