package restApi.STG.resources;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class ResourceDao {
	
	//List<ResourcesObj> resources;
	
	Connection db = null;
	
	public ResourceDao () {
		/*
		String url = "jdbc:mysql://localhost:3306/stg?useSSL=false";
		String username = "root";
		String password = "aldebaran123666";
		*/
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
        String user = "testuser";
        String password = "test623";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			db = DriverManager.getConnection(url,user,password);			
		}
		catch(Exception e) {
			System.out.println("Connection error");

			System.out.println(e);
		}
		
	}
	
	public List<ResourcesObj> getResources() {
		List<ResourcesObj> ResourcesObj = new ArrayList<>();
		String sql = "select * from stgResources";
		try {
			Statement st = (Statement) db.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				ResourcesObj a = new ResourcesObj();
				
				a.setId(rs.getInt(1));		
				a.setChargedTo(rs.getString(2));		
				a.setChgdDirectName(rs.getString(3));		
				a.setChgdTelNumber(rs.getString(4));		
				a.setChgdType(rs.getString(5));		
				a.setChgdDate(rs.getString(6));		
				a.setSerial(rs.getString(7));		
				a.setBrand(rs.getString(8));		
				a.setType(rs.getString(9));		
				a.setProvider(rs.getString(10));		
				a.setCommercialValue(rs.getString(11));		
				a.setDateOfPurchase(rs.getString(12));		
				a.setState(rs.getString(13));	
				
				ResourcesObj.add(a);
			}
		}
		catch(Exception e) {
			System.out.println("getResources error");

			System.out.println(e);
		}
		return ResourcesObj;
	}
	
	public ResourcesObj getResource(int id) {
		/*
		for(ResourcesObj a : resources) {
			if (a.getId() == id) {
				return a;
			}
		} 
		
		return new ResourcesObj();
		*/
		
		String sql = "select * from stgResources where id="+id;
		ResourcesObj a = new ResourcesObj();
		try {
			Statement st = (Statement) db.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
				
				a.setId(rs.getInt(1));		
				a.setChargedTo(rs.getString(2));		
				a.setChgdDirectName(rs.getString(3));		
				a.setChgdTelNumber(rs.getString(4));		
				a.setChgdType(rs.getString(5));		
				a.setChgdDate(rs.getString(6));		
				a.setSerial(rs.getString(7));		
				a.setBrand(rs.getString(8));		
				a.setType(rs.getString(9));		
				a.setProvider(rs.getString(10));		
				a.setCommercialValue(rs.getString(11));		
				a.setDateOfPurchase(rs.getString(12));		
				a.setState(rs.getString(13));					

			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return a;
	}
	
	public void createResource(ResourcesObj a1) {
		String sql = "insert into stgResources values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement st = (PreparedStatement) db.prepareStatement(sql);	
			st.setInt(1, a1.getId());
			st.setString(2, a1.getChargedTo());			
			st.setString(3, a1.getChgdDirectName());			
			st.setString(4, a1.getChgdTelNumber());			
			st.setString(5, a1.getChgdType()); 
			st.setString(6, a1.getChgdDate()); 
			st.setString(7, a1.getSerial()); 
			st.setString(8, a1.getBrand()); 
			st.setString(9, a1.getType()); 
			st.setString(10, a1.getProvider()); 
			st.setString(11, a1.getCommercialValue());
			st.setString(12, a1.getDateOfPurchase());
			st.setString(13, a1.getState());
			st.executeUpdate();		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
