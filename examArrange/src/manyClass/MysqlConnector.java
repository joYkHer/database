package manyClass;
import java.sql.*;
import java.util.*;

public class MysqlConnector {
	private Connection conn = null;
	public void InitConnector() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://106.12.121.18:3306/test","shnucs001","shnucs001");
	}
	
	public ArrayList<String> getTyearFromPKe() throws Exception{
		Statement stat = this.conn.createStatement();
		String sql_Q = "select year from pke_program "+
						"where exam = 1";
		ResultSet res = stat.executeQuery(sql_Q);
		ArrayList<String> resSet = new ArrayList<String>();
		
		while(res.next()) {
			
			if( !resSet.contains(res.getString(1)) ) {
				resSet.add(res.getString(1));
			}
		}
		return resSet;
	}
	
}

