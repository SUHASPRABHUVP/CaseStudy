package com.sonata.PatientDAOImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sonata.PatientDAO.PatientDao;
import com.sonata.PatientModel.Patient;

public class PatientDaoImpl implements PatientDao {
	
	
	int row=0;
	DbConnection db=new DbConnection();
	Patient p=null;
	
	public int savePatient(Object object) {
		try {
	
			p=(Patient)object;
			PreparedStatement ps=db.getConnection().prepareStatement
					("insert into patient(p_name,p_contact,p_location,p_consultation_scheduled,p_consultation_history,p_health_history) values (?,?,?,?,?,?)");
			
			//System.out.println("s");
			ps.setString(1, p.getP_name());
			ps.setString(2, p.getP_contact());
			ps.setString(3, p.getP_location());
			ps.setString(4, p.getP_consultation_scheduled());
			ps.setString(5, p.getP_consultation_history());
			ps.setString(6,p.getP_health_history());
			
			
			row=ps.executeUpdate();
			db.closeConnection();
			}
	
		catch(SQLException e) {e.printStackTrace();}
		return row;
	}
	
	public int deletePatient(int id) {
		try {
			PreparedStatement ps=db.getConnection().prepareStatement
					("delete from patient where patient_id="+id);
		
			row=ps.executeUpdate();
			db.closeConnection();
		
		}
		
		catch(SQLException e) {e.printStackTrace();}
		return row;
	}
	
	public int updatePatient(Object object,int id) {
		try {
			
			p=(Patient)object;
			PreparedStatement ps=db.getConnection().prepareStatement
					("update patient set P_name=?,p_contact=?,P_location=?,p_consultation_scheduled=?,P_consultation_history=?,P_health_history=? where patient_id= "+id);
			
			ps.setString(1, p.getP_name());
			ps.setString(2, p.getP_contact());
			ps.setString(3, p.getP_location());
			ps.setString(4,p.getP_consultation_scheduled());
			ps.setString(5,p.getP_consultation_history());
			ps.setString(6, p.getP_health_history());
			
			row=ps.executeUpdate();
			db.closeConnection();
		}
		catch(SQLException e) {e.printStackTrace();}
		return row;
	}
	
	public Object access(int id) {
		
		Patient pa=new Patient();
		try {
			PreparedStatement ps=db.getConnection().prepareStatement
					("select * from patient where patient_id= "+id);
			
			ResultSet rs =ps.executeQuery();
			rs.next();
		
			pa.setP_name(rs.getString(2));
			pa.setP_contact(rs.getString(3));
			pa.setP_location(rs.getString(4));
			pa.setP_consultation_scheduled(rs.getString(5));
			pa.setP_consultation_history(rs.getString(6));
			pa.setP_health_history(rs.getString(5));
			
		}
		catch(SQLException e) {e.printStackTrace();}
		return pa;
	}
}
