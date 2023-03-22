package vn.sunasterisk.finalproject.baitap2;
import java.util.ArrayList;

public class Khoa {
	
	private String tenKhoa;
	private ArrayList<SinhVien> sinhViens;
	
	public Khoa(String tenKhoa, ArrayList<SinhVien> sinhViens) {
		this.tenKhoa = tenKhoa;
		this.sinhViens = sinhViens;
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	public ArrayList<SinhVien> getDssv() {
		return sinhViens;
	}

	public void setDssv(ArrayList<SinhVien> sinhViens) {
		this.sinhViens = sinhViens;
	}
	
	// Xac dinh tong so sinh vien chinh quy cua Khoa
	public void tongSoSinhVienChinhQuy() {
		int tong = 0;
		for (int i = 0; i < sinhViens.size(); i++) {
			SinhVien sv = sinhViens.get(i);
			if (sv instanceof SinhVienChinhQuy) {
				tong++;
			}
		}
		System.out.println("Tong so sinh vien chinh quy cua khoa: " + tong);
	}
	
	// Tim ra sinh vien co diem dau vao cao nhat o moi Khoa
	public static void sinhVienCoDiemDauVaoCaoNhat(ArrayList<Khoa> khoa) {
		for (int i = 0; i < khoa.size(); i++) {
			Khoa kh = khoa.get(i);
			kh.tongSoSinhVienChinhQuy();
		}
	}

}
