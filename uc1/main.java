import random

# Create board
def create_board():
    return [" " for _ in range(9)]

# Display board
def display_board(board):
    print("\n")
    for i in range(3):
        print(" | ".join(board[i*3:(i+1)*3]))
        if i < 2:
            print("--+---+--")
    print("\n")

# Check winner
def check_winner(board, player):
    win_patterns = [
        [0,1,2], [3,4,5], [6,7,8],  # rows
        [0,3,6], [1,4,7], [2,5,8],  # cols
        [0,4,8], [2,4,6]            # diagonals
    ]
    
    for pattern in win_patterns:
        if all(board[i] == player for i in pattern):
            return True
    return False

# Check draw
def is_draw(board):
    return " " not in board

# Player move
def player_move(board):
    while True:
        try:
            move = int(input("Enter position (1-9): ")) - 1
            if move < 0 or move > 8:
                print("Invalid position!")
            elif board[move] != " ":
                print("Already taken!")
            else:
                board[move] = "X"
                break
        except:
            print("Enter a number!")

# Computer move (basic AI)
def computer_move(board):
    print("Computer's turn...")
    available = [i for i in range(9) if board[i] == " "]
    move = random.choice(available)
    board[move] = "O"

# Game loop
def play_game():
    board = create_board()
    
    while True:
        display_board(board)
        
        # Player turn
        player_move(board)
        if check_winner(board, "X"):
            display_board(board)
            print("You win! 🎉")
            break
        
        if is_draw(board):
            display_board(board)
            print("It's a draw!")
            break
        
        # Computer turn
        computer_move(board)
        if check_winner(board, "O"):
            display_board(board)
            print("Computer wins 🤖")
            break
        
        if is_draw(board):
            display_board(board)
            print("It's a draw!")
            break

# Run game
play_game()
