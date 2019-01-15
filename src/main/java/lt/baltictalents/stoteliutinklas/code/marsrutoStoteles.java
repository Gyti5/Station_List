package lt.baltictalents.stoteliutinklas.code;

import java.util.List;
import java.util.function.Predicate;
import static java.util.stream.Collectors.toList;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class marsrutoStoteles {
	
	private String marsrutoNumeris;
	private HardCodedDb stoteles = new HardCodedDb();
	
	public marsrutoStoteles( String num ) {
		this.marsrutoNumeris = num;
		arStoteleTuriTaMarsruta(marsrutoNumeris);
	}
	
	public List<Station> arStoteleTuriTaMarsruta(String marsrutoNumeris){
		Predicate<Station> a = stotele -> {
			for (String marsrutas : stotele.getRoutes()) {
				if(marsrutas.contains(marsrutoNumeris)) {
					return true;
				}
			}
			return false;
		};
	
		List<Station> tinkamosStoteles = stoteles.getStoteles().stream().filter(a).collect(toList());
		return tinkamosStoteles;
	} 
}
