package stoteliutinklas.code;

import java.util.List;

import stoteliutinklas.data.beans.Station;

public class control {
	private List<Station> sarasas;
	
	public control(List<Station> a) {
		this.sarasas = a;
	}
	
	
	
	public List<String> StotelesKvadrate(String a, String b, String c, String d){
		Square Square = new Square(a, b, c, d);
		findStops h = new findStops(Square.getTopLeft(), Square.getTopRightt(), Square.getBottomLeft(), Square.getBottomRight(), this.sarasas);
    		System.out.println(h.stotelesKvadrate());
		return h.stotelesKvadrate();
	}
	public String StoteleKvadrateSuMax(String a, String b, String c, String d) {
		Square Square = new Square(a, b, c, d);
		findStops h = new findStops(Square.getTopLeft(), Square.getTopRightt(), Square.getBottomLeft(), Square.getBottomRight(), this.sarasas);
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
		@SuppressWarnings("unused")
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
		}
	}
	public String StotelesMarsrutai(String pav) {
		stotelesMarsrutai s = new stotelesMarsrutai(pav, this.sarasas);
		return s.marsrutuPaieska(pav);
	}

}
