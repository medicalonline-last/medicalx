package medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import medical.entity.Drug;
import medical.mapper.DrugMapper;

@Service(value = "drugService")
public class DrugServiceImpl implements DrugService {
	@Autowired
	DrugMapper drugmapper;
	public int insertThuoc(Drug drug) {
		// TODO Auto-generated method stub
		return drugmapper.insertThuoc(drug);
	}

	public int updateThuoc(Drug drug) {
		// TODO Auto-generated method stub
		return drugmapper.updateThuoc(drug);
	}

	public int deleteThuoc(int thuocId) {
		// TODO Auto-generated method stub
		return drugmapper.deleteThuoc(thuocId);
	}

	public List<Drug> getAllThuoc() {
		// TODO Auto-generated method stub
		return drugmapper.getAllThuoc();
	}

	public int findById(Drug drug) {
		// TODO Auto-generated method stub
		return drugmapper.findById(drug);
	}
}
