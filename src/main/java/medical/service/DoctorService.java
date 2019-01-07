package medical.service;

import java.util.List;

import medical.entity.Doctor;

public interface DoctorService {
	public List<Doctor> getTenDoctor();
	public List<Doctor> getChuyenmonDoctor();
	public List<Doctor> findTenbychuyenmonDoctor();
}
