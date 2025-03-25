package conwaysGameOfLife;


// Grundlage bzw Vorlage für Grid -> Grundlagen werden Definiert
public interface Matrix {
	
	void setValue(int row, int col, int value);
	
	int getValue(int row, int col);

	int getRowsCount();
	int getColsCount();
	
}
