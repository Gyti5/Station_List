package lt.baltictalents.stoteliutinklas.code;

public class Square {
	private String longitudeB;
	private String altitudeB;
	private String longitudeD;
	private String altitudeD;

	
	public Square(String xB, String yB, String xD, String yD) {
		this.longitudeB = xB;
		this.altitudeB = yB;
		this.longitudeD = xD;
		this.altitudeD = yD;
	}


	public Coordinates getTopLeft() {
		return new Coordinates(longitudeB, altitudeB);
	}
	public Coordinates getTopRightt() {
		return new Coordinates(longitudeD, altitudeB);
	}
	public Coordinates getBottomLeft() {
		return new Coordinates(longitudeB, altitudeD);
	}
	public Coordinates getBottomRight() {
		return new Coordinates(longitudeD, altitudeD);
	}

}
