package lt.baltictalents.stoteliutinklas.code;

import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class findStops {
	private Coordinates TopLeft;
	private Coordinates TopRight;
	private Coordinates BottomRight;
	private Coordinates BottomLeft;

	public findStops(Coordinates TopLeft,Coordinates TopRight,Coordinates BottomLeft,Coordinates BottomRight) {
		this.TopLeft = TopLeft;
		this.BottomRight = BottomRight;
		this.BottomLeft = BottomLeft;
		this.TopRight = TopRight;
		stotelesKvadrate();
	}
	
	
	private boolean isInside(String x, String y) {
		Double xDouble = Double.parseDouble(x);
		Double yDouble = Double.parseDouble(y);

		if(TopLeft.getX() < xDouble && TopLeft.getY() > yDouble && BottomRight.getX() > xDouble && BottomRight.getY()<yDouble) {
			System.out.println();

			return true;}
		else { 
			System.out.println(yDouble);
			System.out.println(BottomRight.getY());

			return false;}
		
		
		}
	
	
	public List<String> stotelesKvadrate() {
        HardCodedDb StoteliuList = new HardCodedDb();
        List<String> FinalListt = new ArrayList<String>();
        for(Station i : StoteliuList.getStoteles()) {
        	if(isInside(i.getLongtitute(), i.getLatitude()) == true) {
        		FinalListt.add(i.getName());
        	}
        }
        
		return FinalListt;
	}
	public List<Station> stotelesKvadrateNeString() {
        HardCodedDb StoteliuList = new HardCodedDb();
        List<Station> FinalListt = new ArrayList<Station>();
        for(Station i : StoteliuList.getStoteles()) {
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
