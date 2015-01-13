package pacman;

import java.util.StringTokenizer;

import objects.Wall;

public class LevelInput { 

    static int [][] wallkoords; 

    public LevelInput(Game game) { 
        String sTemp; 
        int i,j; 
        wallkoords = new int [40][40]; 
        
        try { 
            // Datei oeffnen 
            java.io.BufferedReader oReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File("test.txt")))); 
            // Zeile fuer Zeile einlesen 
            i=0; 
            while ((sTemp = oReader.readLine()) != null) { 
               // Zeile in Einzelteile zerlegen (wir trennen durch , 
                StringTokenizer stWerte = new StringTokenizer(sTemp,","); 
                j=0; 
                // Nun eintragen in den Array. Es wird nicht ueberprueft, ob die Grenzen ueberschritten werden! 
                while(stWerte.hasMoreTokens()) {
                    wallkoords[i][j] = Integer.parseInt(stWerte.nextToken()); 
                    j++; 
                } 
                i++; 
            } 
        } catch (java.io.FileNotFoundException e) { 
            e.printStackTrace();
        } catch (java.io.IOException e) { 
            e.printStackTrace();
        } 
        for(i=0;i<40;i++){
        	for(j=0;j<40;j++){
        		if(wallkoords [i][j] == 1){
        			game.getObjectsToRender().add(new Wall(j*25,i*25));
        		}
        	}
        }
    } 
}