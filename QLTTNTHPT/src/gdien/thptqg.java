package gdien;

public class thptqg {
	int stt;
	String hoten,gioitinh,cccd,dienthoai;
	float toan,van,ngoaingu,tohop;
	public thptqg() {
	}
	public thptqg(int stt, String hoten, String gioitinh, String cccd, String dienthoai, float toan, float van,
			float ngoaingu, float tohop) {
		this.stt = stt;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.cccd = cccd;
		this.dienthoai = dienthoai;
		this.toan = toan;
		this.van = van;
		this.ngoaingu = ngoaingu;
		this.tohop = tohop;
	}
	public thptqg(String hoten, String gioitinh, String cccd, String dienthoai, float toan, float van, float ngoaingu,
			float tohop) {
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.cccd = cccd;
		this.dienthoai = dienthoai;
		this.toan = toan;
		this.van = van;
		this.ngoaingu = ngoaingu;
		this.tohop = tohop;
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getCccd() {
		return cccd;
	}
	public void setCccd(String cccd) {
		this.cccd = cccd;
	}
	public String getDienthoai() {
		return dienthoai;
	}
	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}
	public float getToan() {
		return toan;
	}
	public void setToan(float toan) {
		this.toan = toan;
	}
	public float getVan() {
		return van;
	}
	public void setVan(float van) {
		this.van = van;
	}
	public float getNgoaingu() {
		return ngoaingu;
	}
	public void setNgoaingu(float ngoaingu) {
		this.ngoaingu = ngoaingu;
	}
	public float getTohop() {
		return tohop;
	}
	public void setTohop(float tohop) {
		this.tohop = tohop;
	}
	
}
