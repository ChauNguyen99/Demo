package vn.sunasterisk.finalproject.baitap1;

public class Vehicle implements Comparable<Vehicle>{

	private String soXe;
	private String nhaSanXuat;
	private int namSX;
	private String mauXe;
	private Owner chuXe;

	public Vehicle(String soXe, String nhaSanXuat, int namSX, String mauXe, Owner chuXe) {
		this.soXe = soXe;
		this.nhaSanXuat = nhaSanXuat;
		this.namSX = namSX;
		this.mauXe = mauXe;
		this.chuXe = chuXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public int getNamSX() {
		return namSX;
	}

	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}

	public String getMauXe() {
		return mauXe;
	}

	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}

	public Owner getChuXe() {
		return chuXe;
	}

	public void setChuXe(Owner chuXe) {
		this.chuXe = chuXe;
	}

	@Override
	public int compareTo(Vehicle otherVehicle) {
		return this.getSoXe().compareTo(otherVehicle.getSoXe());
	}


}
