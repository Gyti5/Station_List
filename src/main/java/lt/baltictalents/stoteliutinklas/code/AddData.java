package lt.baltictalents.stoteliutinklas.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AddData {
	private final String url = "jdbc:sqlite:C:\\Users\\Gytis\\";
	String fileName;
	public AddData(String fileName) {
		this.fileName = fileName;
	    try (Connection conn = DriverManager.getConnection(url+fileName+".db")) {

            
	    }
	    catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
}
	public void CreateStop(String name,String Latitude, String Longtitude,String Marsrutai) {
        insertData insert = new insertData(url+fileName+".db");
        insert.setData(name,Longtitude ,Latitude, Marsrutai);
	}
}