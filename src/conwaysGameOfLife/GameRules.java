package conwaysGameOfLife;

public class GameRules {



	
	//Gamelogic
	/**
	 * 
	 */
	public static void rules(Grid gridOLD, Grid gridNEW) {								/**Anwendung der Spielregeln*/
		for (int i = 0; i < gridOLD.getRowsCount(); i++) {
			for (int j = 0; j < gridOLD.getColsCount(); j++) {
				
				int count = countNeighbors(i, j, gridOLD);
				
				// Wenn Genau 3 dann Geburt
				if(gridOLD.getValue(i, j) == 0) {
					if(count == 3) {
						gridNEW.setValue(i, j, 1);
					}
				}
				if(gridOLD.getValue(i, j) == 1) {
					//Wert <2 oder > 3 - Stribt
					if(count < 2 || count > 3 ) {
						gridNEW.setValue(i,j,0);
					}else {
						gridNEW.setValue(i, j, 1);
					}
					
				}
			}
		}
	}
	
	//GameLogik
	/**
	 * 
	 * @param j
	 * @param i
	 * @return
	 */
	private static int countNeighbors(int row, int cols, Grid grid) {
		int rowCount = grid.getRowsCount();		//länge und breite aus der Matrix geholt
		int colsCount = grid.getColsCount();
		int neighbors = 0;						//int neighbours
		
		for (int i = row - 1; i < row + 1; i++) {		
			for (int j = cols - 1; j < cols + 1; j++) {
				
				if( i == row && j == cols) {	//Aktuelle position darf nicht mitgezählt werden
					continue;
				}
				
				int tempRow = (i + rowCount) % rowCount;		//Division mit Rest
				int tempCols = (j + colsCount) % colsCount;		//Bevor man die Matrix verlassen sprint das Programm auf die gegenüberliegende Seite und fängt wieder am Anfang an
				
				if(grid.getValue(tempRow, tempCols)== 1) {
					neighbors++;
				}
				
				
			}
		}
	return neighbors;
	}
}															/**Anzahl der lebenden Nachbarn wird zurückgegeben*/
	
	

	
