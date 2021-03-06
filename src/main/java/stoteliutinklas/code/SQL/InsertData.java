package stoteliutinklas.code.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	private String url = "";
	public InsertData(String url) {
		this.url = url;
	}
	public void setData(String name,String Latitude, String Longtitude,String Marsrutai) {
    String sql = "insert into Stoteles values(?,?,?,?)";

    try {
    	Connection conn = DriverManager.getConnection(url);
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, Latitude);
        pstmt.setString(3, Longtitude);
        pstmt.setString(4, Marsrutai);

        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
}