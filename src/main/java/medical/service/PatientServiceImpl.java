package medical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import medical.entity.Patient;
import medical.mapper.PatientMapper;
@Service("patientService")
public class PatientServiceImpl implements PatientService {
	@Autowired
	PatientMapper patientMapper;
	public int insertPatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientMapper.insertPatient(patient);
	}

	public int updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deletepatient(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
