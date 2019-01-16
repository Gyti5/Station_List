package stoteliutinklas.code.SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteSQL {
	String j =System.getProperty("user.dir");
	private final String url = "jdbc:sqlite:";
	private final String table = "CREATE TABLE IF NOT EXISTS Stoteles (\n"
            + "	Name text,\n"
            + "	Longitude text,\n"
            + "	Latitude text,\n"
            + "	Marsrutai text \n"
            + ");";

	public WriteSQL(String fileName) {
		j = j.replace("\\", "\\\\");
	    try (Connection conn = DriverManager.getConnection(url+j+"\\database\\"+fileName+".db")) {
	        if (conn != null) {
	        	System.out.println("+");
	            Statement stmt = conn.createStatement(); 
	            stmt.execute(table);
	        	System.out.println("++");

	        }

	    } catch (SQLException e) {
        	System.out.println("+++");
	        System.out.println(e.getMessage());
	    }
	}


	}



