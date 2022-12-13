import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
// if he wants you to display an opened map after a loss or win, just set all tiles to open and remove gamestates 4/5

class Cell { // created an object to store the individual cell stats
    // Cell stats
    public boolean isMine;
    public int adjacentMines;
    public boolean isOpened;
    public boolean isFlagged;
}

public class minesweeper extends JPanel implements MouseListener, Runnable {
    // TODO
    // Import images
    // do all graphics lol
    // mouse clicking + coordinates of mouse click
    // textFileStreaming
    // General Stats
    public static int posX;
    public static int posY;
    public static int difficulty = 1; // all variables are set to easy so that the board may initialize
    // 1 = easy, 10 x 10, 10 mines, 500x500 gameboard
    // 2 = medium, 16 x 16, 40 mines, 800x800 gameboard
    // 3 = hard, 30 x 16, 99 mines, 1500x800 gameboard
    public static int[] difficultyOffset = {0, 100, 400, 550}; // offset of cells for difficulty, 100 is added for index
    public static int ROWS = 10;
    public static int COLS = 10;
    public static int numMines = 10;
    public static Cell[][] board = new Cell[ROWS][COLS];
    // '' = unopened
    // ' ' = empty and revealed
    // '*' = mine
    // '#' = # of mines adjacent to this tile
    public static int gameState = 5;
    // GS0 --> Menu Screen
    // GS1 --> Difficulty Selection
    // GS2 --> Game Screen
    // GS3 --> Highscores
    // GS4 --> Game Lost
    // GS5 --> Game Won
    public static String[] highscores = new String[3]; // array to store highscore 
    // images
    public static BufferedImage[] GS = new BufferedImage[6]; // BufferedImage array for the different gamestates
    public static BufferedImage Mine; // one mine file, 50x50
    public static BufferedImage Flag; // one flag file, 50x50
    public static BufferedImage Unopened; // clickable cell 50x50
    public static BufferedImage[] adjacentMines = new BufferedImage[9]; // 0 is empty cell, 1-8 are the # of mines

    // Game stats
    public static int time = 0;
    public static int score = 0;

    public minesweeper() {
        setPreferredSize(new Dimension(1600, 900));
        addMouseListener(this);
        Thread thread = new Thread(this);
        thread.start();
    }

    public static void placeMines() { // places mines around the map at random spots
        Random r = new Random();
        for (int i = 0; i < numMines; i++) {
            board[r.nextInt(ROWS)][r.nextInt(COLS)].isMine = true;
        }
    }

    public static void readBoard() { // reads the board and computes how many mines are adjacent to the cell
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (board[i][j].isMine)
                    break;
                if (i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1].isMine)
                    board[i][j].adjacentMines++; // top left corner
                if (i - 1 >= 0 && board[i - 1][j].isMine)
                    board[i][j].adjacentMines++; // top cell
                if (i - 1 >= 0 && j + 1 < COLS && board[i - 1][j + 1].isMine)
                    board[i][j].adjacentMines++; // top right corner
                if (j - 1 >= 0 && board[i][j - 1].isMine)
                    board[i][j].adjacentMines++; // left cell
                if (j + 1 < COLS && board[i][j + 1].isMine)
                    board[i][j].adjacentMines++; // right cell
                if (i + 1 < ROWS && j - 1 >= 0 && board[i + 1][j - 1].isMine)
                    board[i][j].adjacentMines++; // bottom left corner
                if (i + 1 < ROWS && board[i + 1][j].isMine)
                    board[i][j].adjacentMines++; // bottom cell
                if (i + 1 < ROWS && j + 1 < COLS && board[i + 1][j + 1].isMine)
                    board[i][j].adjacentMines++; // bottom right corner
            }
        }
    }

    public static void openCell(int row, int col) { // opens each cell and uses DFS to find the next cell
        if(row<0 || row>=ROWS || col<0 || col<=COLS) return; 
        board[row][col].isOpened = true;
        if (board[row][col].isMine) { // if a mine is clicked we lose the game
            loseGame();
        } else if (board[row][col].adjacentMines == 0) { // if an empty cell is clicked, we will recursively search for more
            for(int r = -1; r<2; r++) { // recursively opens all the cells around it
                for(int c = -1; c<2; c++) {
                    if(!r==0 || !c==0) { //makes sure we don't check the current cell
                    openCell(r, c);
                    }
                }
            }
        }
    }

    public static void reset() { // game stats are reset
        difficulty = 1;
        ROWS = 10;
        COLS = 10;
        numMines = 10;
        board = new Cell[ROWS][COLS];
        time = 0;
    }

    public static void loseGame() { // gameState is set to lost, game stats are reset
        gameState = 4;
        reset();
        score = 0;
    }

    public static void winGame() {
        gameState = 5;
        if (time > Integer.parseInt(highscores[0])) {
            highscores[0] = "" + time;
            Arrays.sort(highscores);
        }
        score = time;
        reset();
    }

    public void run() { // timer to keep track of score
        while (gameState == 2) {
            try {
                Thread.sleep(1000);
                time++;
                repaint();
            } catch (Exception e) {
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        switch (gameState) {
            case 0: // Menu
                g.drawImage(GS[gameState], 0, 0, null);

                break;
            case 1: // Difficulty Selection
                g.drawImage(GS[gameState], 0, 0, null);
                break;
            case 2: // Game Screen
                g.drawImage(GS[gameState], 0, 0, null);
                for (int i = 0; i < ROWS; i++) {
                    for (int j = 0; j < COLS; j++) {
                        if (board[i][j].isFlagged) {
                            g.drawImage(Flag, difficultyOffset[difficulty], 100, null);
                        } else if (!board[i][j].isOpened) {
                            g.drawImage(Unopened, difficultyOffset[difficulty], 100, null);
                        } else {
                            g.drawImage(adjacentMines[board[i][j].adjacentMines], difficultyOffset[difficulty], 100, null);
                        }
                    }
                }
                break;
            case 3: // Highscore screen
                g.drawImage(GS[gameState], 0, 0, null);
                break;
            case 4: // Game Lost
                g.drawImage(GS[gameState], 0, 0, null);
                break;
            case 5: // Game Won
                g.drawImage(GS[gameState], 0, 0, null);
                g.setFont(new Font("Arial", Font.PLAIN, 30));
                g.setColor(new Color(0, 0, 0));
                g.drawString("Time: " + score, 620, 650);
                break;
        }
    }

    public static void main(String[] args) {
        try {
            // Image importation
            for (int i = 0; i < 6; i++) {
                GS[i] = ImageIO.read(new File("GS" + i + ".png"));
            }
            for (int i = 0; i < 9; i++) {
                adjacentMines[i] = ImageIO.read(new File("AM" + i + ".png"));
            }
            Mine = ImageIO.read(new File("mine.png"));
            Flag = ImageIO.read(new File("flag.png"));
        } catch (Exception e) {
        }
        JFrame frame = new JFrame("minesweeper");
        minesweeper panel = new minesweeper();
        frame.add(panel);
        frame.setVisible(true);
        frame.pack();
    }

    public void mousePressed(MouseEvent e) {
        posX = e.getX();
        posY = e.getY();
        switch (gameState) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}