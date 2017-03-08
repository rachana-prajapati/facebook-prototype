package org.ooad.facebook_v01.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.ooad.facebook_v01.database.Convertor;
import org.ooad.facebook_v01.database.DatabaseConnection;
import org.ooad.facebook_v01.model.ContactAndBasicInfo;

public class ContactAndBasicInfoService {
	private ResultSet myResult;
	private DatabaseConnection myConn;
	
	private void estabilishConnection(){
		myConn = new DatabaseConnection();
	}
	
	private void closeConnection() throws SQLException{
		myConn.getConn().close();
	}
	
	public int editPoliticalView(int userId,String political_view) throws Exception{
		estabilishConnection();
		int res;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String query = "UPDATE facebook_v01.CONTACT_AND_BASIC_INFO"+
							" SET contact_and_basic_info_political_view='"+political_view+"'"+ 
							" WHERE userdetails_pk='"+userId+"';";
			res = myConn.getStmt().executeUpdate(query);
		}
		catch(SQLException e){
			System.out.println(""+e.getMessage());
			return -1;
		}
		catch(ClassNotFoundException e){
			System.out.println(""+e.getMessage());
			return -2;
		}		
		closeConnection();
		return res;
	}
	
	public int editPoliticalViewName(int userId,String political_view) throws Exception{
		estabilishConnection();
		int res;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String query = "update facebook_v01.CONTACT_AND_BASIC_INFO SET political_views_pk="+
							"(select political_views_pk from facebook_v01.POLITICAL_VIEWS where political_views_name=lower('"+political_view+"'))"+
							" where userdetails_pk="+userId+";";
			res = myConn.getStmt().executeUpdate(query);
		}
		catch(SQLException e){
			System.out.println(""+e.getMessage());
			return -1;
		}
		catch(ClassNotFoundException e){
			System.out.println(""+e.getMessage());
			return -2;
		}		
		closeConnection();
		return res;
	}
	
	public int editReligiousView(int userId,String religious_view) throws Exception{
		estabilishConnection();
		int res;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String query = "UPDATE facebook_v01.CONTACT_AND_BASIC_INFO"+
							" SET contact_and_basic_info_religious_view='"+religious_view+"'"+ 
							" WHERE userdetails_pk='"+userId+"';";
			res = myConn.getStmt().executeUpdate(query);
		}
		catch(SQLException e){
			System.out.println(""+e.getMessage());
			return -1;
		}
		catch(ClassNotFoundException e){
			System.out.println(""+e.getMessage());
			return -2;
		}		
		closeConnection();
		return res;
	}
	
	public int editReligionName(int userId,String religion_name) throws Exception{
		estabilishConnection();
		int res;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String query = "update facebook_v01.CONTACT_AND_BASIC_INFO SET religions_pk="+
							"(select religions_pk from facebook_v01.RELIGIONS where religions_religion_name=lower('"+religion_name+"'))"+
							" where userdetails_pk="+userId+";";
			res = myConn.getStmt().executeUpdate(query);
		}
		catch(SQLException e){
			System.out.println(""+e.getMessage());
			return -1;
		}
		catch(ClassNotFoundException e){
			System.out.println(""+e.getMessage());
			return -2;
		}		
		closeConnection();
		return res;
	}
	
	public int editInterestedIn(int userId,char gender) throws Exception{
		estabilishConnection();
		int res;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String query = "UPDATE facebook_v01.CONTACT_AND_BASIC_INFO"+
							" SET contact_and_basic_info_interested_in='"+gender+"'"+ 
							" WHERE userdetails_pk='"+userId+"';";
			res = myConn.getStmt().executeUpdate(query);
		}
		catch(SQLException e){
			System.out.println(""+e.getMessage());
			return -1;
		}
		catch(ClassNotFoundException e){
			System.out.println(""+e.getMessage());
			return -2;
		}		
		closeConnection();
		return res;
	}
	
	public int editUserAddress(int userId,String address) throws Exception{
		estabilishConnection();
		int res;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String query = "UPDATE facebook_v01.CONTACT_AND_BASIC_INFO"+
							" SET contact_and_basic_info_user_address='"+address+"'"+ 
							" WHERE userdetails_pk='"+userId+"';";
			res = myConn.getStmt().executeUpdate(query);
		}
		catch(SQLException e){
			System.out.println(""+e.getMessage());
			return -1;
		}
		catch(ClassNotFoundException e){
			System.out.println(""+e.getMessage());
			return -2;
		}		
		closeConnection();
		return res;
	}
	
	public int editGender(int userId,char gender) throws Exception{
		estabilishConnection();
		int res;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String query = "UPDATE facebook_v01.USERDETAILS"+ 
							" SET userdetails_gender='"+gender+"'"+ 
							" WHERE userdetails_pk='"+userId+"';";
			res = myConn.getStmt().executeUpdate(query);
		}
		catch(SQLException e){
			System.out.println(""+e.getMessage());
			return -1;
		}
		catch(ClassNotFoundException e){
			System.out.println(""+e.getMessage());
			return -2;
		}		
		closeConnection();
		return res;
	}
	
	public int editDOB(int userId,String dob) throws Exception{
		estabilishConnection();
		int res;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String query = "UPDATE facebook_v01.USERDETAILS"+ 
							" SET userdetails_dob='"+dob+"'"+ 
							" WHERE userdetails_pk='"+userId+"';";
			res = myConn.getStmt().executeUpdate(query);
		}
		catch(SQLException e){
			System.out.println(""+e.getMessage());
			return -1;
		}
		catch(ClassNotFoundException e){
			System.out.println(""+e.getMessage());
			return -2;
		}		
		closeConnection();
		return res;
	}
	
	//if needed in case
	/*public int deleteEmailAddress(int userId) throws Exception{
		estabilishConnection();
		int res;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String query = "UPDATE facebook_v01.USERDETAILS "+ 
							"SET userdetails_email='' "+ 
							"WHERE userdetails_pk='"+userId+"';";
			res = myConn.getStmt().executeUpdate(query);
		}
		catch(SQLException e){
			System.out.println(""+e.getMessage());
			return -1;
		}
		catch(ClassNotFoundException e){
			System.out.println(""+e.getMessage());
			return -2;
		}		
		closeConnection();
		return res;
	}*/
	
	public int editEmailAddress(int userId,String email) throws Exception{
		estabilishConnection();
		int res;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String query = "UPDATE facebook_v01.USERDETAILS "+ 
							"SET userdetails_email='"+email+"' "+ 
							"WHERE userdetails_pk='"+userId+"';";
			res = myConn.getStmt().executeUpdate(query);
		}
		catch(SQLException e){
			System.out.println(""+e.getMessage());
			return -1;
		}
		catch(ClassNotFoundException e){
			System.out.println(""+e.getMessage());
			return -2;
		}		
		closeConnection();
		return res;
	}
	
	//if needed in case
	/*public int deletePhoneNumber(int userId) throws Exception{
		estabilishConnection();
		int res;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String query = "UPDATE facebook_v01.USERDETAILS "+ 
							"SET userdetails_mobile='' "+ 
							"WHERE userdetails_pk='"+userId+"';";
			res = myConn.getStmt().executeUpdate(query);
		}
		catch(SQLException e){
			System.out.println(""+e.getMessage());
			return -1;
		}
		catch(ClassNotFoundException e){
			System.out.println(""+e.getMessage());
			return -2;
		}		
		closeConnection();
		return res;
	}*/
	
	public int editPhoneNumber(int userId,String phnNo) throws Exception{
		estabilishConnection();
		int res;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String query = "UPDATE facebook_v01.USERDETAILS "+ 
							"SET userdetails_mobile='"+phnNo+"' "+ 
							"WHERE userdetails_pk='"+userId+"';";
			res = myConn.getStmt().executeUpdate(query);
		}
		catch(SQLException e){
			System.out.println(""+e.getMessage());
			return -1;
		}
		catch(ClassNotFoundException e){
			System.out.println(""+e.getMessage());
			return -2;
		}		
		closeConnection();
		return res;
	}
	
	public int getContactAndBasicInfo(int userId,ContactAndBasicInfo cbi) throws Exception{
		estabilishConnection();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String query = "select userdetails_mobile,userdetails_email,contact_and_basic_info_user_address,"+
							"userdetails_dob,userdetails_gender,religions_religion_name,"+
							"contact_and_basic_info_religious_view,"+
							"contact_and_basic_info_interested_in,"+
							"political_views_name,"+
							"contact_and_basic_info_political_view "+
							"from facebook_v01.USERDETAILS U,facebook_v01.CONTACT_AND_BASIC_INFO C,"+
							"facebook_v01.RELIGIONS R,facebook_v01.POLITICAL_VIEWS P "+
							"where "+
							"U.userdetails_pk="+userId+" and U.userdetails_pk=C.userdetails_pk "+
							"and C.religions_pk=R.religions_pk "+
							"and C.political_views_pk=P.political_views_pk;";
			myResult = myConn.getStmt().executeQuery(query);
			while (myResult.next()){
				cbi.setUserdetails_mobile(myResult.getString("userdetails_mobile"));
				cbi.setUserdetails_email(myResult.getString("userdetails_email"));
				cbi.setContact_and_basic_info_user_address(myResult.getString("contact_and_basic_info_user_address"));
				cbi.setUserdetails_dob(myResult.getString("userdetails_dob"));
				cbi.setUserdetails_gender(myResult.getString("userdetails_gender").charAt(0));
				cbi.setReligions_religion_name(myResult.getString("religions_religion_name"));
				cbi.setContact_and_basic_info_religious_view(myResult.getString("contact_and_basic_info_religious_view"));
				cbi.setContact_and_basic_info_interested_in(myResult.getString("contact_and_basic_info_interested_in").charAt(0));
				cbi.setPolitical_views_name(myResult.getString("political_views_name"));
				cbi.setContact_and_basic_info_political_view(myResult.getString("contact_and_basic_info_political_view"));
			}
			
		}
		catch(SQLException e){
			System.out.println(""+e.getMessage());
			return -1;
		}
		catch(ClassNotFoundException e){
			System.out.println(""+e.getMessage());
			return -2;
		}
		closeConnection();
		return 1;
	}
	
}
