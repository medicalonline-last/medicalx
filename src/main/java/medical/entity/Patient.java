package medical.entity;

public class Patient {
	private int id;
	private String ten;
	private String quequan;
	private String ngaysinh;
	private int iddangnhap;
	private int idthuoc;
	private int iddichvu;
	private String sodienthoai;
	private String email;
	private String gioitinh;
	private String cmnd;

	public Patient(String ten, String quequan, String ngaysinh, int iddangnhap, int idthuoc, int iddichvu,
			String sodienthoai, String email, String gioitinh, String cmnd) {
		super();
		this.ten = ten;
		this.quequan = quequan;
		this.ngaysinh = ngaysinh;
		this.iddangnhap = iddangnhap;
		this.idthuoc = idthuoc;
		this.iddichvu = iddichvu;
		this.sodienthoai = sodienthoai;
		this.email = email;
		this.gioitinh = gioitinh;
		this.cmnd = cmnd;
	}
	
	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public Patient() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getQuequan() {
		return quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public int getIddangnhap() {
		return iddangnhap;
	}
	public void setIddangnhap(int iddangnhap) {
		this.iddangnhap = iddangnhap;
	}
	public int getIdthuoc() {
		return idthuoc;
	}
	public void setIdthuoc(int idthuoc) {
		this.idthuoc = idthuoc;
	}
	public int getIddichvu() {
		return iddichvu;
	}
	public void setIddichvu(int iddichvu) {
		this.iddichvu = iddichvu;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	

}
