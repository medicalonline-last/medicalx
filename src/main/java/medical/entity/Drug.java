package medical.entity;

public class Drug {
	private Integer id;
	private String ten;
	private String thongtin;
	private double giatien;
	private byte[] anh;
	
	public Drug(Integer id, String ten, String thongtin, double giatien, byte[] anh) {
		super();
		this.ten = ten;
		this.thongtin = thongtin;
		this.giatien= giatien;
		this.anh = anh;
	}
	public Integer getId() {
		return id;
	}
	public void setId(String ten) {
		this.ten = ten;
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
	public byte[] getAnh() {
		return anh;
	}
	public void setAnh(byte[] anh) {
		this.anh = anh;
	}
}
