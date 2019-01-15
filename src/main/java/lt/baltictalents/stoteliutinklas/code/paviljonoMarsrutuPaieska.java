package lt.baltictalents.stoteliutinklas.code;

import java.util.Arrays;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class paviljonoMarsrutuPaieska {
	
	private String stringTaskasX;
	private String stringTaskasY;
	private HardCodedDb stoteles = new HardCodedDb();
	
	public paviljonoMarsrutuPaieska(String x, String y) {
		this.stringTaskasX = x;
		this.stringTaskasY = y;
		marsrutuPaieska(stringTaskasX, stringTaskasY);
	}
	
	public String marsrutuPaieska(String stringTaskasX, String stringTaskasY) {
		String g = "";
		for (Station a : stoteles.getStoteles()) {

			if ( stringTaskasX == a.getLongtitute() && stringTaskasY == a.getLatitude()) {
				g+=Arrays.toString(a.getRoutes());

			}

		}
		return g;
	}
}