package medical.mapper;

import java.util.ArrayList;
import java.util.List;

import medical.entity.Doctor;

public interface DoctorMapper {
	public List<String> getTenDoctor();
	public List<String> getChuyenmonDoctor();
	public List<Doctor> findTenbychuyenmonDoctor();
}
