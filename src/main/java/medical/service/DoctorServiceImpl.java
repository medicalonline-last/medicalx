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
	public List<String> getTenDoctor(){
		return doctorMapper.getTenDoctor();
	}
	public List<String> getChuyenmonDoctor(){
		return doctorMapper.getChuyenmonDoctor();
	}
	public List<Doctor> findTenbychuyenmon(){
		return doctorMapper.findTenbychuyenmonDoctor();
	}
	public List<Doctor> findTenbychuyenmonDoctor() {
		// TODO Auto-generated method stub
		return doctorMapper.findTenbychuyenmonDoctor();
	}
	public String getPhonglamviecDoctor() {
		// TODO Auto-generated method stub
		return doctorMapper.getPhonglamviecDoctor();
	}
	public Doctor getDoctorbyName(String ten) {
		// TODO Auto-generated method stub
		return doctorMapper.getDoctorbyName(ten);
	}
}
