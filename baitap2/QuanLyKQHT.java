package vn.sunasterisk.finalproject.baitap2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class QuanLyKQHT {
	
	public static void kiemTraSinhVien(SinhVien sinhVien) {
		if (sinhVien instanceof SinhVienChinhQuy) {
			System.out.println(sinhVien.getHoTen() + " - Sinh Vien Chinh Quy");
		} else if (sinhVien instanceof SinhVienTaiChuc) {
			System.out.println(sinhVien.getHoTen() + " - Sinh Vien Tai Chuc");
		}
	}
	
	public static void main(String[] args) {
		KetQuaHocTap k1 = new KetQuaHocTap("HK1", 7);
		KetQuaHocTap k2 = new KetQuaHocTap("HK2", 8.5f);
		KetQuaHocTap k3 = new KetQuaHocTap("HK2", 9);
		KetQuaHocTap k4 = new KetQuaHocTap("HK2", 6.5f);
		KetQuaHocTap k5 = new KetQuaHocTap("HK1", 7.5f);
		KetQuaHocTap k6 = new KetQuaHocTap("HK2", 7.5f);
		KetQuaHocTap k7 = new KetQuaHocTap("HK1", 9.5f);

		ArrayList<KetQuaHocTap> kqht1 = new ArrayList<KetQuaHocTap>();
		kqht1.add(k1);
		kqht1.add(k2);
	
		ArrayList<KetQuaHocTap> kqht2 = new ArrayList<KetQuaHocTap>();
		kqht2.add(k3);
		kqht2.add(k4);
		kqht2.add(k5);
		
		ArrayList<KetQuaHocTap> kqht3 = new ArrayList<KetQuaHocTap>();
		kqht2.add(k6);
		kqht2.add(k7);
		
		SinhVien Chau = new SinhVienChinhQuy("11111", "Nguyen Thi Chau", "23/2/1999", 2017, 6, kqht1);
		SinhVien Anh = new SinhVienTaiChuc("22222", "Nguyen Thi Anh", "22/5/2002", 2021, 9, kqht2);
		SinhVien Hieu = new SinhVienTaiChuc("33333", "Nguyen Van Hieu", "20/9/2000", 2018, 8.5f, kqht3);
		
		ArrayList <SinhVien> listSV = new ArrayList<SinhVien>();
		listSV.add(Chau);
		listSV.add(Anh);
		listSV.add(Hieu);
		
		// Tra ve thong tin sinh vien co phai la chinh quy hay khong? 
		System.out.print("\n");
		kiemTraSinhVien(Chau);
		kiemTraSinhVien(Anh);
		
		// Hien thi diem trung binh cac mon hoc cua sinh vien
		System.out.print("\n");
		Chau.hienThiDiemTBCuaSV();
		
		// Tong so sinh vien chinh quy cua khoa 
		System.out.print("\n");
		Khoa k = new Khoa("Tai Chinh Ngan Hang", listSV);
		ArrayList<Khoa> khoaList = new ArrayList<Khoa>();
		khoaList.add(k);
		Khoa.sinhVienCoDiemDauVaoCaoNhat(khoaList);
	}
}
