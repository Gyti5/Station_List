package stoteliutinklas.code;

import java.util.ArrayList;
import java.util.List;

import stoteliutinklas.data.beans.Station;


public class Circle {

	private List<String> finallist = null;
 public Circle(Coordinates a, double r, List<Station> b) {
	 listas(a, r, b);
 }
 	private void listas(Coordinates a, double r, List<Station> b){
		 List<String> finalllist = new ArrayList<String>();
 		for(Station c: b) {
 			String newClat = c.getLatitude().replace("\"", "");
 			String newClon = c.getLongtitute().replace("\"", "");
 			Coordinates n = new Coordinates(newClat, newClon);
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
