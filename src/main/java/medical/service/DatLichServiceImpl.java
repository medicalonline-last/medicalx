package medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import medical.entity.DatLich;
import medical.mapper.DatLichMapper;

@Service(value="datLichService")
public class DatLichServiceImpl implements DatLichService {
	@Autowired
	DatLichMapper datLichMapper;
	public int insertDatLich(DatLich datLich) {
		return datLichMapper.insertDatLich(datLich);
	}
	public List<DatLich> getAllLich() {
		// TODO Auto-generated method stub
		return datLichMapper.getAllLich();
	}
	public String getNameBSFromIdLich() {
		// TODO Auto-generated method stub
		return datLichMapper.getNameBSFromIdLich();
	}
	public int deleteLich(int lichId) {
		// TODO Auto-generated method stub
		return datLichMapper.deleteLich(lichId);
	}
}
