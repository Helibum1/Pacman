package pacman;

import java.io.*;

public class LevelInput {
	
	public String LevelName = "Test";
	
	LevelName = LevelName + ".txt"; //Das hier muss noch in eine Funktion verschoben werden, damit der obige Fehler verschwindet. Also z.B: public getTxt() usw.Diese Funktion gibt dann den Namen des Txt mit Endung aus.
	
	FileReader fr = new FileReader(LevelName);
	
	int zeichen1 = fr.read();
	
}
