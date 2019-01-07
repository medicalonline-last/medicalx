package medical.entity;

public class Doctor {
	private int id;
	private String ten;
	private String quequan;
	private String ngaysinh;
	private String chuyenmon;
	private String phonglamviec;
	private int iddangnhap;
	/*private int idthuoc;*/
	private String sodienthoai;
	private String email;
	private String gioitinh;

	public Doctor(String ten, String quequan, String ngaysinh,String chuyenmon, String phonglamviec, int iddangnhap,/* int idthuoc,*/
			String sodienthoai, String email, String gioitinh) {
		super();
		this.ten = ten;
		this.quequan = quequan;
		this.ngaysinh = ngaysinh;
		this.iddangnhap = iddangnhap;
		/*this.idthuoc = idthuoc;*/
		this.sodienthoai = sodienthoai;
		this.email = email;
		this.gioitinh = gioitinh;
	}
	
	public Doctor() {
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
	public String getChuyenmon() {
		return chuyenmon;
	}
	public void setChuyenmon(String chuyenmon) {
		this.chuyenmon = chuyenmon;
	}
	public String getPhonglamviec() {
		return phonglamviec;
	}
	public void setPhonglamviec(String phonglamviec) {
		this.phonglamviec = phonglamviec;
	}
	public int getIddangnhap() {
		return iddangnhap;
	}
	public void setIddangnhap(int iddangnhap) {
		this.iddangnhap = iddangnhap;
	}
/*	public int getIdthuoc() {
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
	}*/
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
