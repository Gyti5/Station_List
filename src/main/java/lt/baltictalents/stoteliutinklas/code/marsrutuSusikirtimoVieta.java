package lt.baltictalents.stoteliutinklas.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class marsrutuSusikirtimoVieta {
	
	private String marsrutuNumeriai;
	private HardCodedDb stoteles = new HardCodedDb();
	
	public marsrutuSusikirtimoVieta(String skaiciai) {
		this.marsrutuNumeriai = skaiciai;
		marsrutuSusikirtimai(marsrutuNumeriai);
	}
	
	public String marsrutuSusikirtimai(String marsrutuNumeriai) {
		
		String[] numeriuMasyvas = marsrutuNumeriai.split(" ");
		List<String> list2 = new ArrayList<>();
		for(String x : numeriuMasyvas)
			list2.add(x);
		String tinkamosStoteles = null;
		for(Station a : stoteles.getStoteles()) {
			String[] marsrutuMasyvas = a.getRoutes();
			
			for(int i = 0; i < marsrutuMasyvas.length; i++) {
				marsrutuMasyvas[i] = marsrutuMasyvas[i].replaceAll("[^0-9]", "");
			}
			List<String> tikSkaiciuList = new ArrayList<>(Arrays.asList(marsrutuMasyvas));
			
			if (tikSkaiciuList.containsAll(list2)) {
				tinkamosStoteles += a.getName();
			}
		}
		return tinkamosStoteles;
	}	
}
