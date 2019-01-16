package stoteliutinklas.config; 

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import stoteliutinklas.code.GUI.GUI;
import stoteliutinklas.data.beans.*;


public class Application {

	@SuppressWarnings({"unused"})
	public static void main(String[] args) throws FileNotFoundException {
		String j =System.getProperty("user.dir");
    	File file = new File(j+"\\src\\main\\resources\\stoteles.txt");
		Scanner sc = new Scanner(file, "UTF-8");
		List<Station> SarasasIsFailo = new ArrayList<Station>(1260);
    	   while (sc.hasNextLine()) {
    		        String[] data = sc.nextLine().split("\\,");
    		        String[] keliai = data[3].split("\\;");
    		        SarasasIsFailo.add(new Station(data[0], data[1],data[2],keliai));
    	}
		GUI Gui = new GUI(SarasasIsFailo);
    	sc.close();

    }
	
	
    
}





