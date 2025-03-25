package conwaysGameOfLife;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		int rows = Grid.GridSizeWidth();
		int cols = Grid.GridSizeLenght();
		
		Grid gridOLD = new Grid(rows, cols);
		Grid gridNEW = new Grid(rows, cols);
		
		Grid.InitializeRandomGrid(gridOLD);
		
		Grid.printGrids(gridOLD);
		
		while(true) {
			GameRules.rules(gridOLD, gridNEW);
			//Gamerule verarbeitet die Reglen, dafür wird GridAlt als referenz genommen
			Grid.copyGrid(gridOLD, gridNEW);	
			// neues wird aufs alte kopiert und das alte wird ausgegeben
			Grid.printGrids(gridNEW);
			Thread.sleep(1000);			//Verzögerung im Programmablauf
			
		}
	}


}

		
		// Abfrage nach der Größe -> variablen zum übergeben
		
		//gridOLD = new GRID ....
		//gridNEW
		
				
		
		
		//Weiteren Abhängigkeiten
		// -> Boardsteuerung - Gamerule
		
		//Grid gird = new Gird();

		
		// Grid füllen
		// grid.fill();
		
		
		// while(true)
		
			// loop
		
		//gamerules -> Grid auswerten( Gamerules auf grid alt anwenden und ins grid neu Schreiebn -> neu ín ALte übertragen
		
	