package medical.service;

import medical.entity.Patient;

public interface PatientService {
	public int insertPatient(Patient patient);
	public int updatePatient(Patient patient);
	public int deletepatient(int id);

}
