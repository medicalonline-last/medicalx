package medical.mapper;

import java.util.List;

import medical.entity.DatLich;

public interface DatLichMapper {
	public int insertDatLich(DatLich datLich);
	public List<DatLich> getAllLich();
}
