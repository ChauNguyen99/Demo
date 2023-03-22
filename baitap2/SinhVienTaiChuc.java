package vn.sunasterisk.finalproject.baitap2;
import java.util.ArrayList;

public class SinhVienTaiChuc extends SinhVien {
	
	private String noiLienKetDaoTao;
	
	public SinhVienTaiChuc(String maSV, String hoTen, String ngaySinh, int namVaoHoc, float diemDauVao, ArrayList<KetQuaHocTap> kq) {
		super(maSV, hoTen, ngaySinh, namVaoHoc, diemDauVao, kq);
		this.noiLienKetDaoTao = noiLienKetDaoTao;
	}

	public String getNoiLienKetDaoTao() {
		return noiLienKetDaoTao;
	}

	public void setNoiLienKetDaoTao(String noiLienKetDaoTao) {
		this.noiLienKetDaoTao = noiLienKetDaoTao;
	}

}
