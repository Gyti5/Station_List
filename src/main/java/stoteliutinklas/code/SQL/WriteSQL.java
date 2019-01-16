package stoteliutinklas.code.SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteSQL {
	String j =System.getProperty("user.dir");

	private final String url = "jdbc:sqlite:C:\\Users\\Gytis\\";
	private final String table = "CREATE TABLE IF NOT EXISTS Stoteles (\n"
            + "	Name text,\n"
            + "	Longitude text,\n"
            + "	Latitude text,\n"
            + "	Marsrutai text \n"
            + ");";

	public WriteSQL(String fileName) {
	    try (Connection conn = DriverManager.getConnection(url+fileName+".db")) {
	        if (conn != null) {
	            Statement stmt = conn.createStatement(); 
	            stmt.execute(table);
	            
	        }

	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}


	}



