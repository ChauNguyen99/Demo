package vn.sunasterisk.finalproject.baitap2;

public class KetQuaHocTap {
	
	private String tenHocKy;
	private float diemTB;

	public KetQuaHocTap(String tenHocKy, float diemTB) {
		this.tenHocKy = tenHocKy;
		this.diemTB = diemTB;
	}

	public String getTenHocKy() {
		return tenHocKy;
	}

	public void setTenHocKy(String tenHocKy) {
		this.tenHocKy = tenHocKy;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public void hienThiThongTin() {
		System.out.println("Ket qua hoc tap:");
		System.out.println("Ten hoc ky: " + getTenHocKy());
		System.out.println("Diem trung binh: " + getDiemTB());
	}
}
