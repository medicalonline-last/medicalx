package medical.entity;

import java.sql.Date;

public class DatLich {
	private Integer id;
	private Date ngay;
	private String gio;
	private String diadiem;
	private Integer idbenhnhan;
	private Integer idbacsi;
	
	public DatLich(Date ngay, String gio, String diadiem, int idbenhnhan, int idbacsi) {
		super();
		this.ngay = ngay;
		this.diadiem = diadiem;
		this.gio = gio;
		this.idbacsi = idbacsi;
		this.idbenhnhan = idbenhnhan;
	}
	public DatLich(Date ngay, String gio, String diadiem) {
		super();
		this.ngay = ngay;
		this.diadiem = diadiem;
		this.gio = gio;
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
	public Date getNgay() {
		return ngay;
	}
	public void setNgay(Date ngay) {
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
	public String getDiadiem() {
		return diadiem;
	}
	public void setDiadiem(String diadiem) {
		this.diadiem = diadiem;
	}
}
