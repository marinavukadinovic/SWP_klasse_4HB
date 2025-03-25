package conwaysGameOfLife;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// wird matrix importiert
public class Grid implements Matrix {
	private int[][] grid;											/**2D Array*/
	private int rows;	//Variable für die Reihen
	private int cols;	//
	
	//Konstruktur
	public Grid(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		grid = new int[rows][cols];
	}
//Getter & Setter
	public int getColsCount() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public int getRowsCount() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getValue(int rows, int cols) {	//Aktueller Wert der Matrix wird ausgerufen
		return grid[rows][cols];
	}
	public void setValue(int rows, int cols, int value) { //Wert wird in die Matrix reingeschrieben
		grid[rows][cols] = value;
	}

	/**
	 * Abfrage Spielfeldgröße
	 * @return
	 */
	public static int GridSizeLenght() {									
		Scanner sc = new Scanner(System.in); 								/** Scanner zum einlesen von Benutzerdaten */
		System.out.println("Länge des Spielfeldes eingeben:"); 				/** Spieler wird gebeten die Länge einzugeben */
		int length = sc.nextInt();
		return length;
	}
	/**
	 * 	Abfrage Spielfeldgröße
	 * @return
	 */
	public static int GridSizeWidth() {
			Scanner sc = new Scanner(System.in); 								/** Scanner zum einlesen von Benutzerdaten */
			System.out.println("Breite des Spielfeldes eingeben:"); 				/** Spieler wird gebeten die Länge einzugeben */
			int width = sc.nextInt();
			return width;
	}
									
	/**
	 * 
	 * @param grid
	 */
	public static void InitializeRandomGrid(Grid grid) {
		/** Methode zum initialisieren des Spielfeldes mit zufälligen Werten (0,1) */
		for (int i = 0; i < grid.getRowsCount(); i++) {
			for (int j = 0; j < grid.getColsCount(); j++) {
				if (ThreadLocalRandom.current().nextInt(2) == 0) { //Zufallswert ändern 2= 50; 3=33
					grid.setValue(i, j, 0); 
				} else {
					grid.setValue(i, j, 1);
				}
			}
		}
	}
	/**
	 * 
	 * @param gridOLD
	 * @param gridNEW
	 */
	public static void copyGrid(Grid gridOLD, Grid gridNEW) {			// siehe oben
		for (int i = 0; i < gridOLD.getRowsCount(); i++) {
			for (int j = 0; j < gridOLD.getColsCount(); j++) {
				int value = gridNEW.getValue(i, j);				//holt aus der Neuen Matrix die werte 
				gridOLD.setValue(i, j, value);
			}
		}
	}

	/**
	 * 
	 * @param grid
	 */
	public static void printGrids(Grid grid) {
		for (int i = 0; i < grid.getRowsCount(); i++) {
			for (int j = 0; j < grid.getColsCount(); j++) {
				int value = grid.getValue(i, j);			//holt sich den Wert aus der Matrix raus
				if (value == 1) {
					System.out.print("0");
				}else {
					System.out.print(".");
				}
				
			}
			System.out.println();
		}
	}

}
