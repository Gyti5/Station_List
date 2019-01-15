package lt.baltictalents.stoteliutinklas.code;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class writeSQL {
	String j =System.getProperty("user.dir");

	private final String url = "jdbc:sqlite:C:\\Users\\Gytis\\";
	private final String table = "CREATE TABLE IF NOT EXISTS Stoteles (\n"
            + "	Name text,\n"
            + "	Longitude text,\n"
            + "	Latitude text,\n"
            + "	Marsrutai text,\n"
            + "	Prieziuros_Darbai date \n"
            + ");";

	public writeSQL(String fileName) {
	    try (Connection conn = DriverManager.getConnection(url+fileName+".db")) {
	        if (conn != null) {
	            DatabaseMetaData meta = conn.getMetaData();
	            Statement stmt = conn.createStatement(); 
	            stmt.execute(table);
	            
	        }

	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}


	}



