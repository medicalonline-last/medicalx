package medical.mapper;

import java.util.List;

import medical.entity.Doctor;

public interface DoctorMapper {
	public List<String> getTenDoctor();
	public List<String> getChuyenmonDoctor();
	public List<Doctor> findTenbychuyenmonDoctor();
	public String getPhonglamviecDoctor();
	public Doctor getDoctorbyName(String ten);
}
