package lt.baltictalents.stoteliutinklas.config; 
import java.util.ArrayList;


import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
import lt.baltictalents.stoteliutinklas.data.beans.*;
import lt.baltictalents.stoteliutinklas.code.gui;
import lt.baltictalents.stoteliutinklas.code.writeSQL;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		String j =System.getProperty("user.dir");
    	System.out.println(j);
   	    HardCodedDb b = new HardCodedDb();
    	@SuppressWarnings("unused")
    	File file = new File(j+"\\src\\main\\resources\\stoteles.txt"); 
    	Scanner sc = new Scanner(file, "UTF-8");
		List<Station> SarasasIsFailo = new ArrayList<Station>(1260);
    	   while (sc.hasNextLine()) {
    		        String[] data = sc.nextLine().split("\\,");
    		        String[] keliai = data[3].split("\\;");
    		        SarasasIsFailo.add(new Station(data[0], data[1],data[2],keliai));
    	}

		gui Gui = new gui(SarasasIsFailo); // uzkomentuot, jeigu nori skaityt is hardcodedDb
//		gui Gui = new gui(b.getStoteles());  // uzkomentuot, jeigu nori skaityt is failo

    }
	
	
    
}





