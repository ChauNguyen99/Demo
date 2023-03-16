package vn.sunasterisk.finalproject.baitap1;

public class XeMay extends Vehicle {
	
	private int congSuat;

	public XeMay(String soXe, String nhaSanXuat, int namSX, String mauXe, Owner chuXe, int congSuat) {
		super(soXe, nhaSanXuat, namSX, mauXe, chuXe);
		this.congSuat = congSuat;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}

}
