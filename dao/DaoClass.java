package com.organdonation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.organdonation.bean.AccepterLoginBean;
import com.organdonation.bean.AccepterRegisterBean;
import com.organdonation.bean.ContactBean;
import com.organdonation.bean.DonateFormBean;
import com.organdonation.bean.DonorBean;
import com.organdonation.bean.DonorLoginBean;
import com.organdonation.bean.DonorRegisterBean;

public class DaoClass {

	boolean status;

	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","xe","admin");
		return connection;
	}

	public boolean donorcheck(DonorLoginBean ab) {

		try {
			String sql = "select * from DonorRegistration where username=? and password=?";
			DaoClass dao = new DaoClass();
			Connection con = dao.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, ab.getUsername());
			stmt.setString(2, ab.getPassword());

			ResultSet rs = stmt.executeQuery();
			status = rs.next();
			//			if(status== true)
			//			{
			//			System.out.println("ok");	
			//			}
			//			else
			//			{
			//				System.out.println(" not ok");
			//			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	int j;

	public int insertDonate(DonorBean u) {

		try {
			String sql = "insert into DonateForm values(?,?,?,?,?,?,?)";

			DaoClass dao = new DaoClass();
			Connection con = dao.getConnection();

			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, u.getUsername());
			stmt.setString(2, u.getAge());
			stmt.setString(3, u.getBloodgp());
			stmt.setString(4, u.getMobile());
			stmt.setString(5, u.getEmail());
			stmt.setString(6, u.getLocation());
			stmt.setString(7, u.getOrgan());
			j = stmt.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return j;
	}

	int i;

	public int insertDonor(DonorRegisterBean u) {

		try {
			String sql = "insert into DonorRegistration values(?,?,?,?,?,?)";

			DaoClass dao = new DaoClass();
			Connection con = dao.getConnection();

			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, u.getUsername());
			stmt.setString(2, u.getPassword());
			stmt.setString(3, u.getMobile());
			stmt.setString(4, u.getEmail());
			stmt.setString(5, u.getLocation());
			stmt.setString(6, u.getCountry());
			i = stmt.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	public int insertAccepter(AccepterRegisterBean u) {

		try {
			String sql = "insert into AccepterRegistration values(?,?,?,?,?,?)";

			DaoClass dao = new DaoClass();
			Connection con = dao.getConnection();

			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, u.getUsername());
			stmt.setString(2, u.getPassword());
			stmt.setString(3, u.getMobile());
			stmt.setString(4, u.getEmail());
			stmt.setString(5, u.getLocation());
			stmt.setString(6, u.getCountry());
			i = stmt.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	public boolean acceptercheck(AccepterLoginBean ab) {

		try {
			String sql = "select * from AccepterRegistration where username=? and password=?";
			DaoClass dao = new DaoClass();
			Connection con = dao.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, ab.getUsername());
			stmt.setString(2, ab.getPassword());

			ResultSet rs = stmt.executeQuery();
			status = rs.next();
			if(status==true) {
				System.out.println("Ok");
			}
			else {
				System.out.println("Not ok");
			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	int k;
	public int insertDonate(DonateFormBean u) {

		try {
			String sql="insert into DonateForm values(?,?,?,?,?,?,?)";

			DaoClass dao=new DaoClass();
			Connection con=dao.getConnection();

			PreparedStatement stmt=con.prepareStatement(sql);

			stmt.setString(1, u.getUsername());
			stmt.setString(2, u.getAge());
			stmt.setString(3, u.getBloodgp());
			stmt.setString(4, u.getMobile());
			stmt.setString(5, u.getEmail());
			stmt.setString(6, u.getLocation());
			stmt.setString(7, u.getOrgan());
			j=stmt.executeUpdate();

			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

		return k;
	}

	public List<DonateFormBean> getAllDonor(String organ){
		List<DonateFormBean> list=new ArrayList<DonateFormBean>();

		try {
			String sql="select * from DonateForm where organ=?";
			DaoClass dao=new DaoClass();
			Connection con=dao.getConnection();
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1, organ);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				DonateFormBean s=new DonateFormBean();
				s.setUsername(rs.getString(1));
				s.setAge(rs.getString(2));
				s.setBloodgp(rs.getString(3));
				s.setMobile(rs.getString(4));
				s.setEmail(rs.getString(5));
				s.setLocation(rs.getString(6));
				s.setOrgan(rs.getString(7));
				list.add(s);
			}
			status=rs.next();
			if(status==true) {
				System.out.println("Search Ok");
			}
			else {
				System.out.println("not found"+organ);
				System.out.println("Not ok");
			}


			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public int contactUs(ContactBean u) {

		try {
			String sql = "insert into contactDetails values(?,?,?,?)";

			DaoClass dao = new DaoClass();
			Connection con = dao.getConnection();

			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, u.getName());
			stmt.setString(2, u.getEmail());
			stmt.setString(3, u.getMobile());
			stmt.setString(4, u.getMessage());

			i = stmt.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

}
