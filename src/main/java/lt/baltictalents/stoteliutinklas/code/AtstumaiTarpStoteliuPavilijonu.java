package lt.baltictalents.stoteliutinklas.code;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class AtstumaiTarpStoteliuPavilijonu {
	
	private String atstumasMetrais;
	private HardCodedDb stoteles = new HardCodedDb();
	
	public AtstumaiTarpStoteliuPavilijonu(String distance) {
		this.atstumasMetrais = distance;
		naujasMetodas(distance);
	}
	
	public String naujasMetodas(String distance) {
		
		return null;
	}
}
