package lt.baltictalents.stoteliutinklas.data.beans;

public class Station {
	String name;
	String longtitute;
	String latitude;
	String[] routes;
	String data = "undefined";


	public Station(String name, String lon, String lat, String[] routes) {
		super();
		this.name = name;
		this.longtitute = lon;
		this.latitude = lat;
		this.routes = routes;
	}

	public String getName() {
		return name;
	}
//zdrv
	public void setName(String name) {
		this.name = name;
	}

	public String getLongtitute() {
		return longtitute;
	}

	public void setLongtitute(String longtitute) {
		this.longtitute = longtitute;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String[] getRoutes() {
		return routes;
	}

	public void setRoutes(String[] routes) {
		this.routes = routes;
	}
	public void setNewDate(String data) {
		this.data = data;
	}

}