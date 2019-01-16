package stoteliutinklas.code.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AddData {
	private final String url = "jdbc:sqlite:";
	String fileName;
	String j =System.getProperty("user.dir");
	public AddData(String fileName) {
		this.fileName = fileName;
	    try (Connection conn = DriverManager.getConnection(url+j+"\\database\\"+fileName+".db")) {

            
	    }
	    catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
}
	public void CreateStop(String name,String Latitude, String Longtitude,String Marsrutai) {
        InsertData insert = new InsertData(url+j+"\\database\\"+fileName+".db");
        insert.setData(name,Longtitude ,Latitude, Marsrutai);
	}
}