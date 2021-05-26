module com.patient {
	exports com.sonata.PatientDAOImpl;
	exports com.sonata.PatientModel;
	exports com.sonata.PatientDAO;

	requires java.sql;
}