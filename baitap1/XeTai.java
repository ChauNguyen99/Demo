package vn.sunasterisk.finalproject.baitap1;

public class XeTai extends Vehicle {

	private int trongTai;

	public XeTai(String soXe, String nhaSanXuat, int namSX, String mauXe, Owner chuXe, int trongTai) {
		super(soXe, nhaSanXuat, namSX, mauXe, chuXe);
		this.trongTai = trongTai;
	}

	public int getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(int trongTai) {
		this.trongTai = trongTai;
	}

}
