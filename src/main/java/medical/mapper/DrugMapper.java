package medical.mapper;

import java.util.List;

import medical.entity.Drug;

public interface DrugMapper {
	 	public int insertThuoc(Drug drug);
	   /* public int updateThuoc(Drug drug);
	    	    
	    public int findById(Drug drug);*/
	 	public int deleteThuoc(int thuocId);
	 	public List<Drug> getAllThuoc();
	 	
	    
}
