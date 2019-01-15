package lt.baltictalents.stoteliutinklas.code;

import java.util.ArrayList;
import java.util.List;
import lt.baltictalents.stoteliutinklas.data.beans.Station;

public class findStops {
	private Coordinates TopLeft;
	private Coordinates BottomRight;
	private List<Station> sarasas;

	public findStops(Coordinates TopLeft,Coordinates TopRight,Coordinates BottomLeft,Coordinates BottomRight, List<Station> sarasas) {
		this.TopLeft = TopLeft;
		this.BottomRight = BottomRight;
		this.sarasas = sarasas;
		stotelesKvadrate();
	}
	
	
	private boolean isInside(String x, String y) {
		x = x.replace("\"", "");
		y = y.replace("\"", "");
		Double xDouble = Double.parseDouble(x);
		Double yDouble = Double.parseDouble(y);
		if(TopLeft.getX() < xDouble && TopLeft.getY() > yDouble && BottomRight.getX() > xDouble && BottomRight.getY()<yDouble) {
			System.out.println();

			return true;}
		else { 
			return false;}
		
		
		}
	
	
	public List<String> stotelesKvadrate() {
        List<String> FinalListt = new ArrayList<String>();
        for(Station i : this.sarasas) {
        	if(isInside(i.getLongtitute(), i.getLatitude()) == true) {
        		FinalListt.add(i.getName());
        	}

        }
        
		return FinalListt;
	}
	public List<Station> stotelesKvadrateNeString() {
        List<Station> FinalListt = new ArrayList<Station>();
        for(Station i : sarasas) {
        	if(isInside(i.getLongtitute(), i.getLatitude()) == true) {
        		FinalListt.add(i);
        	}
        }
        
		return FinalListt;
	}
	public String stotelesKvadrateMax(){
		String pavadinimas = null;
		int skaicius = 0;
        List<Station> FinalList = stotelesKvadrateNeString();
        for(Station i:FinalList) {
    		if(i.getRoutes().length > skaicius) {
    			skaicius = i.getRoutes().length;
    			pavadinimas = i.getName();
    		}
        }

		return pavadinimas;
	}
}
