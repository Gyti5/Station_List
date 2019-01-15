package lt.baltictalents.stoteliutinklas.code;

import java.util.Arrays;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class stotelesMarsrutai {
	
	private String stotelesPavadinimas;
	private HardCodedDb stoteles = new HardCodedDb();
	
	public stotelesMarsrutai(String pav) {
		this.stotelesPavadinimas = pav;
		marsrutuPaieska(stotelesPavadinimas);
	}
	
	public String marsrutuPaieska(String stotelesPavadinimas) {
		String b = "";
		for (Station a : stoteles.getStoteles()) {
	    	System.out.println("+");

			if (stotelesPavadinimas == a.getName()) {
				 b+= Arrays.toString(a.getRoutes());
			    	System.out.println("-");

			}
		}
		return b;
	}
}
