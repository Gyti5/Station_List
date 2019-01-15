package lt.baltictalents.stoteliutinklas.code;

import java.util.ArrayList;
import java.util.List;
import lt.baltictalents.stoteliutinklas.data.beans.Station;


public class Rutulys {
	private Coordinates a;
	private double r;
	private List<Station> b;
	private List<String> finallist = null;
 public Rutulys(Coordinates a, double r, List<Station> b) {
	 this.a = a;
	 this.r = r;
	 this.b = b;
	 listas(a, r, b);
 }
 	private void listas(Coordinates a, double r, List<Station> b){
		 List<String> finalllist = new ArrayList<String>();
 		for(Station c: b) {
 			Coordinates n = new Coordinates(c.getLatitude(), c.getLongtitute());
 		 if(checkIfStationIsInCircle(a, r, n) == true) {
 			 finalllist.add(c.getName());
 		 }
 		}
 		 this.finallist = finalllist;
 	}
 
	private boolean checkIfStationIsInCircle(Coordinates a, double r, Coordinates b) {
		
		double x = a.getX();
		double y = a.getY();

		 if ((x - b.getY()) * (x - b.getY()) + (y - b.getX()) * (y - b.getX()) <= r * r) {

		   return true; 
		 }
		 else{
		   return false;
		 }
	} 
					
public List<String> rez(){
	return finallist;
}
	}
