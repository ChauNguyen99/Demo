package vn.sunasterisk.finalproject.baitap2;

import java.util.ArrayList;

public class SinhVien {
	
	private String maSV;
	private String hoTen;
	private String ngaySinh;
	private int namVaoHoc;
	private float diemDauVao;
	private ArrayList<KetQuaHocTap> kq = new ArrayList<KetQuaHocTap>();

	public SinhVien(String maSV, String hoTen, String ngaySinh, int namVaoHoc, float diemDauVao, ArrayList<KetQuaHocTap> kq) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.namVaoHoc = namVaoHoc;
		this.diemDauVao = diemDauVao;
		this.kq = kq;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getNamVaoHoc() {
		return namVaoHoc;
	}

	public void setNamVaoHoc(int namVaoHoc) {
		this.namVaoHoc = namVaoHoc;
	}

	public float getDiemDauVao() {
		return diemDauVao;
	}

	public void setDiemDauVao(float diemDauVao) {
		this.diemDauVao = diemDauVao;
	}

	public ArrayList<KetQuaHocTap> getKetQuas() {
		return kq;
	}

	public void setKetQuas(ArrayList<KetQuaHocTap> kq) {
		this.kq = kq;
	}

	public void hienThiThongTin() {
		System.out.println("Thong tin sinh vien: ");
		System.out.println("\t MSSV: " + getMaSV());
		System.out.println("\t Ho ten: " + getHoTen());
		System.out.println("\t Ngay sinh: " + getNgaySinh());
		System.out.println("\t Nam vao hoc: " + getNamVaoHoc());
		System.out.println("\t Diem dau vao: " + getDiemDauVao());
		kq.forEach(kq -> kq.hienThiThongTin());
	}

	public void hienThiDiemTBCuaSV() {
		System.out.println("Diem TB cac ky hoc cua sinh vien ten: " + hoTen);
			for (KetQuaHocTap ketQuas : kq) {
				System.out.println(" - " + ketQuas.getTenHocKy() + " la : " + ketQuas.getDiemTB());
		}
	}
}
