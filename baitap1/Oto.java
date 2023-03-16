package vn.sunasterisk.finalproject.baitap1;

public class Oto extends Vehicle {
	
	private int soChoNgoi;
	private String kieuDongCo;

	public Oto(String soXe, String nhaSanXuat, int namSX, String mauXe, Owner chuXe, int soChoNgoi, String kieuDongCo) {
		super(soXe, nhaSanXuat, namSX, mauXe, chuXe);
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
	}

	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	public String getKieuDongCo() {
		return kieuDongCo;
	}

	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}
}
