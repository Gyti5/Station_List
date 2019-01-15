package lt.baltictalents.stoteliutinklas.code;

import java.util.List;
import static java.util.stream.Collectors.toList;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class AtstumaiTarpStoteliuPavilijonu {
		
	private double atstumasMetrais;
	private HardCodedDb stoteles = new HardCodedDb();
	
	public AtstumaiTarpStoteliuPavilijonu(double distance) {
		this.atstumasMetrais = distance;
		tinkamosStoteles(atstumasMetrais);
	}
	
	public double tinkamosStoteles(double atstumasMetrais) {
		for (Station a : stoteles.getStoteles()) {
			List<Station> m = pavilijonaiPagalPavadinima(a.getName());
			for (int i=0; i<m.size(); i++) {
				for (int j=i+1; j<m.size(); j++) {
					Station station1 = m.get(i);
					Station station2 = m.get(j);
					if(atstumasTarpTaskuMetrais(station1, station2) <= atstumasMetrais) {
						System.out.println(station1 + " " + station2);
					}
				}
			}
		}
		return 0;
	}
	
	public List<Station> pavilijonaiPagalPavadinima (String name){
		final String pavilijonoPavadinimas = name;
		List<Station> pavilijonaiPagalPavadinima = stoteles.getStoteles().stream()
				.filter(stotele -> stotele.getName().contains(pavilijonoPavadinimas))
				.collect(toList());
		return pavilijonaiPagalPavadinima;
	}
	
	public static double atstumasTarpTaskuMetrais( Station station1, Station station2 ) {
				
		double x1 = Double.parseDouble(station1.getLatitude());
		double y1 = Double.parseDouble(station1.getLongtitute());
		double x2 = Double.parseDouble(station2.getLatitude());
		double y2 = Double.parseDouble(station2.getLongtitute());
		
		final double R = 6378.1; // þemës spindulys kilometrais
	    double latDistance = Math.toRadians(y2 - y1);
	    double lonDistance = Math.toRadians(x2 - x1);
	    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
	            + Math.cos(Math.toRadians(y1)) * Math.cos(Math.toRadians(y2))
	            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	    double distance = R * c * 1000; // keitimas á metrus
		return distance;
	}
}
