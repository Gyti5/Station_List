package stoteliutinklas.code.controller;

import java.util.List;

import stoteliutinklas.code.Coordinates;
import stoteliutinklas.code.Circle;
import stoteliutinklas.code.Square;
import stoteliutinklas.code.MostRoutes;
import stoteliutinklas.code.FindStops;
import stoteliutinklas.code.StationRoutes;
import stoteliutinklas.code.SQL.AddData;
import stoteliutinklas.code.SQL.WriteSQL;
import stoteliutinklas.data.beans.Station;

public class Controler {
	private List<Station> sarasas;
	
	public Controler(List<Station> a) {
		this.sarasas = a;
	}
	
	
	
	public List<String> StotelesKvadrate(String a, String b, String c, String d){
		Square Square = new Square(a, b, c, d);
		FindStops h = new FindStops(Square.getTopLeft(), Square.getTopRightt(), Square.getBottomLeft(), Square.getBottomRight(), this.sarasas);
    		System.out.println(h.stotelesKvadrate());
		return h.stotelesKvadrate();
	}
	public String StoteleKvadrateSuMax(String a, String b, String c, String d) {
		Square Square = new Square(a, b, c, d);
		FindStops h = new FindStops(Square.getTopLeft(), Square.getTopRightt(), Square.getBottomLeft(), Square.getBottomRight(), this.sarasas);
		return h.stotelesKvadrateMax();
	}
	public List<String> StotelesRutuly(String x, String y, int r){
		Circle m = new Circle(new Coordinates(x,y), r, this.sarasas);
		return m.rez();
	}
	public String DaugiausiaMarsrutu(List<Station> b, int n) {
    	MostRoutes c = new MostRoutes(b, n);
    	return c.get();
	}
	public void writeSQL(String pavadinimas) {
		@SuppressWarnings("unused")
		WriteSQL a =new WriteSQL(pavadinimas);
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
		StationRoutes s = new StationRoutes(pav, this.sarasas);
		return s.marsrutuPaieska(pav);
	}

}
