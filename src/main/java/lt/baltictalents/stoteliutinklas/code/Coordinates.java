package lt.baltictalents.stoteliutinklas.code;

public class Coordinates {
private String x;
private String y;
 public Coordinates(String x, String y) {
	 this.x = x;
	 this.y = y;
 }
 public double getX() {
	 return Double.parseDouble(x);
 }
 public double getY() {
	 return Double.parseDouble(y);
 }
}//d
