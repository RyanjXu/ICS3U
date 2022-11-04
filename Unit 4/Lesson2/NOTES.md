Global Variables
Global variables aren't permanent storage, they only exist while the program is running, when the program terminates the variable will be deleted from RAM storage
if you were writing a game and you wanted to store a highscore set by the player, leaving it as a declared integer or double will lead to the highscore being
reset as the program is run again
		
a solution to this is the use of a .txt file to store important data that can be edited and changed by the program
most games use text files to:
- keep track of high scores
- keep track of game states and game stats
