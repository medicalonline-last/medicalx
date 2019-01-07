package medical.mapper;

import java.util.List;

import medical.entity.Doctor;

public interface DoctorMapper {
	public List<Doctor> getTenDoctor();
	public List<Doctor> getChuyenmonDoctor();
	public List<Doctor> findTenbychuyenmonDoctor();
}
