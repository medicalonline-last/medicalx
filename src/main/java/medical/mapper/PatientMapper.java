package medical.mapper;

import medical.entity.Patient;

public interface PatientMapper {
	public int insertPatient(Patient patient);
	public int updatePatient(Patient patient);
	public int deletepatient(int id);
	

}
