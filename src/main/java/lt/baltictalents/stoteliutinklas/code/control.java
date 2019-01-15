package lt.baltictalents.stoteliutinklas.code;

import java.util.List;
import lt.baltictalents.stoteliutinklas.data.hardcode.*;
import lt.baltictalents.stoteliutinklas.data.beans.Station;

public class control {
	private List<Station> sarasas;
	
	public control(List<Station> a) {
		this.sarasas = a;
	}
	
	
	
	//gytis
	public List<String> StotelesKvadrate(String a, String b, String c, String d){
		Square Square = new Square(a, b, c, d);
		findStops h = new findStops(Square.getTopLeft(), Square.getTopRightt(), Square.getBottomLeft(), Square.getBottomRight());
		return h.stotelesKvadrate();
	}
	public String StoteleKvadrateSuMax(String a, String b, String c, String d) {
		Square Square = new Square(a, b, c, d);
		findStops h = new findStops(Square.getTopLeft(), Square.getTopRightt(), Square.getBottomLeft(), Square.getBottomRight());
		return h.stotelesKvadrateMax();
	}
	public List<String> StotelesRutuly(String x, String y, int r){
		Rutulys m = new Rutulys(new Coordinates(x,y), r, this.sarasas);
		return m.rez();
	}
	public String DaugiausiaMarsrutu(List<Station> b, int n) {
    	daugiausiaMarsrutu c = new daugiausiaMarsrutu(b, n);
    	return c.get();
	}
	public void writeSQL(String pavadinimas) {
		writeSQL a =new writeSQL(pavadinimas);
	}
	public void AddDataToTable(String pavadinimas) {
		AddData a = new AddData(pavadinimas);
		for(Station b : sarasas) {
			String keliai = "";
			for(int i = 0; i < b.getRoutes().length; i++) {
				keliai += b.getRoutes()[i]+" | ";
			}
		a.CreateStop(b.getName(), b.getLatitude(), b.getLongtitute(),keliai);
		b.setNewDate("Undefined");
		}
	}
	public void PakeistiDarbuData(String fileName, String name, String data) {
		UpdateData m = new UpdateData(name, data, fileName);
		for(Station h : sarasas) {
			if(h.getName()==name) {
				h.setNewDate(data);
			}
		}
	}
	
	//modestas
	public String ArtimiausiaStotele(String x, String y) {
		ArtimiausiaStotele z = new ArtimiausiaStotele(x, y);
		return z.distance((new Coordinates(x,y)));
	}
	public String StotelesMarsrutai(String pav) {
		stotelesMarsrutai s = new stotelesMarsrutai(pav);
		return s.marsrutuPaieska(pav);
	}
	public String MarsrutuPaeiska(String x, String y) {
		paviljonoMarsrutuPaieska b = new paviljonoMarsrutuPaieska(x, y);
		return b.marsrutuPaieska(x, y);
	}
	public List<Station> marsrutoStoteles(String a) {
		marsrutoStoteles s = new marsrutoStoteles(a);
		return s.arStoteleTuriTaMarsruta(a);
	}
	public String MarsrutuSusikirtimoVietos(String skaiciai) {
		marsrutuSusikirtimoVieta a = new marsrutuSusikirtimoVieta(skaiciai);
		return a.marsrutuSusikirtimai(skaiciai);
		
	}

	
	
	
	
	

}
