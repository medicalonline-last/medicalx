package medical.entity;

public class DatLich {
	private Integer id;
	private String ngay;
	private String gio;
	private String diadiem;
	private Integer idbenhnhan;
	private Integer idbacsi;
	
	public DatLich(String ngay, String gio, String diadiem, int idbenhnhan, int idbacsi) {
		super();
		this.ngay = ngay;
		this.diadiem = diadiem;
		this.gio = gio;
		this.idbacsi = idbacsi;
		this.idbenhnhan = idbenhnhan;
	}
	public DatLich() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNgay() {
		return ngay;
	}
	public void setNgay(String ngay) {
		this.ngay = ngay;
	}
	public String getGio() {
		return gio;
	}
	public void setGio(String gio) {
		this.gio = gio;
	}
	public int getIdbenhnhan() {
		return idbenhnhan;
	}
	public void setIdbenhnhan(int idbenhnhan) {
		this.idbenhnhan = idbenhnhan;
	}
	public int getIdbacsi() {
		return idbacsi;
	}
	public void setIdbacsi(int idbacsi) {
		this.idbacsi = idbacsi;
	}
}
