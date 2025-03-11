package conwaysGameOfLife;
 
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
 
public class GameOfLife{
 
    public static char[][] grid;
    public static int gridLength = 0;
    public static int gridWidth = 0;
 
    public static void GridSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Länge des Spielfeldes eingeben:");
        gridLength = sc.nextInt();
        System.out.println("Breite des Spielfeldes eingeben:");
        gridWidth = sc.nextInt();
        grid = new char[gridLength][gridWidth];
        sc.close();
    }
 
    public static void InitializeRandomGrid() {
        for (int i = 0; i < gridLength; i++) {
            for (int j = 0; j < gridWidth; j++) {
                if (ThreadLocalRandom.current().nextInt(2) == 0) {
                    grid[i][j] = 'O';
                } else {
                    grid[i][j] = '.';
                }
            }}
        }
        
 
    public static void printGrids() {
        for (int i = 0; i < gridLength; i++) {
            for (int j = 0; j < gridWidth; j++) {
                System.out.print(" " + grid[i][j] + " ");
            }
            System.out.println();
        }}
    
    public void rules() {
        char[][] nextGrid = new char[gridWidth][gridLength];
        for (int j = 0; j < gridWidth; j++) {
        	 for (int i = 0; i < gridLength; i++) {
                int neighbors = countNeighbors(j, i);
                if (neighbors < 2 || neighbors > 3) {
                    nextGrid[j][i] = '.'; 
                } else if (neighbors == 3) {
                    nextGrid[j][i] = 'O'; 
                } else {
                    nextGrid[j][i] = grid[j][i]; 
        }
            }
             }
        }
    private int countNeighbors(int j, int i) {
		 int count = 0;
		 int [][] directions = {
			{1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

		 for (int[] dir : directions) {
	            int ni = i + dir[0];
	            int nj = j + dir[1];

	     if (isInBounds(ni, nj) && grid[ni][nj] == 'O') {
	                count++;
	            }
	        }
	        return count;	
	    }
    
    
    public void rulesLoop(int rules) {
        int rules = 0;
        while (true) {
            rules++;
            System.out.println("Press enter to quit!");
            rules();
            System.out.println("\nNach einer Generation:");
            rules();
            System.out.println("Generation: " + rules);

            try {
                if (System.in.available() > 0) {
                    Scanner sc;
					sc.nextLine();
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    
    
		 
		 private boolean isInBounds(int ni, int nj) {
		// TODO Auto-generated method stub
		return false;
	}

	

	public static void main(String[] args) {
        GameOfLife.GridSize();
        GameOfLife.InitializeRandomGrid();
        GameOfLife.printGrids();
    }
}
 
 