package stoteliutinklas.code;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import stoteliutinklas.data.beans.Station;

public class MostRoutes {
	private final int n;
	private List<Station> stotys;
 public MostRoutes(List<Station> stotys, int n) {
	 this.n = n;
	 this.stotys = stotys;
	 daugiausia();
 }
 public void daugiausia() {
     Collections.sort(this.stotys, new Comparator<Station>() {

			public int compare(Station o1, Station o2) {
				return o2.getRoutes().length - o1.getRoutes().length;
			}
     	
     });

 }
 public String get() {
     String a ="";
     for(int i = 0; i <this.n; i++) {
         a+=this.stotys.get(i).getName()+"   |   ";

     }
     return a;
 }
}
