package lt.baltictalents.stoteliutinklas.code;


import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class ArtimiausiaStotele {
	
	private String stringTaskasX;
	private String stringTaskasY;
	private HardCodedDb stoteles = new HardCodedDb();

	public ArtimiausiaStotele(String x, String y) {
		this.stringTaskasX = x;
		this.stringTaskasY = y;
		Coordinates taskas = new Coordinates(stringTaskasX,stringTaskasY);
		distance(taskas);
	}
	
	public double getTaskasX() {
		double doubleTaskasX = Double.parseDouble(stringTaskasX);
		return doubleTaskasX;
	}
	
	public double getTaskasY() {
		double doubleTaskasY = Double.parseDouble(stringTaskasY);
		return doubleTaskasY;
	}
	
	public String distance(Coordinates taskas) {
		double g = 99;
		String pav = null;
		for(Station a : stoteles.getStoteles()) {
			Double dx = getTaskasX() - Double.parseDouble(a.getLongtitute());
			Double dy = getTaskasY() - Double.parseDouble(a.getLatitude());
			if(Math.abs(dx) + Math.abs(dy) < g) {
				g = Math.abs(dx) + Math.abs(dy);
				pav = a.getName();
			}
		}
		return pav;
	}
}
