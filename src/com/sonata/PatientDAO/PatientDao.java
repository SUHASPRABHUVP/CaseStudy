package com.sonata.PatientDAO;

import com.sonata.PatientModel.Patient;

public interface PatientDao {
	
	public int savePatient(Object object);
	public int deletePatient(int id);
	public int updatePatient(Object object,int id);
	//public List<Patient> getAllPatientData();

}
