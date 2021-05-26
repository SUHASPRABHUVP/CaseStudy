package com.sonata.PatientModel;

public class Patient {
	private int patient_id;
	private String p_name;
	private String p_contact;
	private String p_location;
	private String p_consultation_scheduled;
	private String p_consultation_history;
	private String p_health_history;
	
	public String getP_consultation_scheduled() {
		return p_consultation_scheduled;
	}

	public void setP_consultation_scheduled(String p_consultation_scheduled) {
		this.p_consultation_scheduled = p_consultation_scheduled;
	}

	public String getP_consultation_history() {
		return p_consultation_history;
	}

	public void setP_consultation_history(String p_consultation_history) {
		this.p_consultation_history = p_consultation_history;
	}

	public String getP_health_history() {
		return p_health_history;
	}

	public void setP_health_history(String p_health_history) {
		this.p_health_history = p_health_history;
	}

	public int getPatient_id() {
		return patient_id;
	}
	
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_contact() {
		return p_contact;
	}
	public void setP_contact(String p_contact) {
		this.p_contact = p_contact;
	}
	public String getP_location() {
		return p_location;
	}
	public void setP_location(String p_location) {
		this.p_location = p_location;
	}

	
	
	
}
