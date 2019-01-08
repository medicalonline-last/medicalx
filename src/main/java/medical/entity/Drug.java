package medical.entity;

public class Drug {
	private Integer id;
	private String ten;
	private String thongtin;
	private double giatien;
	private String loaihinh;
	private byte[] anh;
	public Drug(String ten, String thongtin, double giatien, String loaihinh, byte[] anh) {
		super();
		this.ten = ten;
		this.thongtin = thongtin;
		this.giatien = giatien;
		this.loaihinh = loaihinh;
		this.anh = anh;
	}
	public Drug() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getThongtin() {
		return thongtin;
	}
	public void setThongtin(String thongtin) {
		this.thongtin = thongtin;
	}
	public double getGiatien() {
		return giatien;
	}
	public void setGiatien(double giatien) {
		this.giatien = giatien;
	}
	public String getLoaihinh() {
		return loaihinh;
	}
	public void setLoaihinh(String loaihinh) {
		this.loaihinh = loaihinh;
	}
	public byte[] getAnh() {
		return anh;
	}
	public void setAnh(byte[] anh) {
		this.anh = anh;
	}
	
	
	
	
}
