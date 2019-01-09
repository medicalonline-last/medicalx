package medical.service;

import java.util.List;

import medical.entity.DatLich;

public interface DatLichService {
	public int insertDatLich(DatLich datLich);
	public List<DatLich> getAllLich();
	public String getNameBSFromIdLich();
}
