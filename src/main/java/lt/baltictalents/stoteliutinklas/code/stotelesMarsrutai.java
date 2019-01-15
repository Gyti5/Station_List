package lt.baltictalents.stoteliutinklas.code;

import java.util.Arrays;
import java.util.List;
import lt.baltictalents.stoteliutinklas.data.beans.Station;

public class stotelesMarsrutai {
	
	private String stotelesPavadinimas;
	private List<Station> sarasas;
	
	public stotelesMarsrutai(String pav, List<Station> sarasas) {
		this.sarasas = sarasas;
		this.stotelesPavadinimas = pav;
		marsrutuPaieska(stotelesPavadinimas);
	}
	
	public String marsrutuPaieska(String stotelesPavadinimas) {
		String b = "";
		for (Station a : sarasas) {
	    	System.out.println("+");

			if (stotelesPavadinimas == a.getName()) {
				 b+= Arrays.toString(a.getRoutes());
			    	System.out.println("-");

			}
		}
		return b;
	}
}
