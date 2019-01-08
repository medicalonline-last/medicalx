package medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import medical.entity.Doctor;
import medical.mapper.DoctorMapper;

@Service(value = "doctorService")
public class DoctorServiceImpl implements DoctorService{
	@Autowired
	DoctorMapper doctorMapper;

	public List<String> getTenDoctor() {
		// TODO Auto-generated method stub
		return doctorMapper.getTenDoctor();
	}

	public List<String> getChuyenmonDoctor() {
		// TODO Auto-generated method stub
		return doctorMapper.getChuyenmonDoctor();
	}

	public Doctor getDoctorbyName(String ten) {
		// TODO Auto-generated method stub
		return doctorMapper.getDoctorbyName(ten);
	}

	


	
}
