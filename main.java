import java.util.Random;

class GameState {
    String currentPlayer;
    char playerSymbol;
    char computerSymbol;
}

public class TicTacToe {

    public static GameState toss() {
        Random random = new Random();
        int result = random.nextInt(2); // 0 or 1

        GameState state = new GameState();

        if (result == 0) {
            state.currentPlayer = "Player";
            state.playerSymbol = 'X';
            state.computerSymbol = 'O';
        } else {
            state.currentPlayer = "Computer";
            state.playerSymbol = 'O';
            state.computerSymbol = 'X';
        }

        return state;
    }

    public static void main(String[] args) {
        GameState state = toss();

        System.out.println("🎲 Tossing...");
        System.out.println("Starting Player: " + state.currentPlayer);
        System.out.println("Player Symbol: " + state.playerSymbol);
        System.out.println("Computer Symbol: " + state.computerSymbol);
    }
}
