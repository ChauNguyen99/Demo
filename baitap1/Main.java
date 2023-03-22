package vn.sunasterisk.finalproject.baitap1;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		QuanLyPTGT ql = new QuanLyPTGT();

		ql.addVehicle(new Oto("79-A1", "Yamaha", 1999, "White", new Owner("111111111111", "Chau", "aaa@gmail.com"), 7, "Gas"));
		ql.addVehicle(new Oto("43-B1", "Suzuki", 2000, "Black", new Owner("222222222222", "Anh", "bbb@gmail.com"), 12, "Gas"));
		ql.addVehicle(new Oto("51-C1", "Honda", 2001, "Brown", new Owner("333333333333", "Hieu", "ccc@gmail.com"), 10, "Gas"));
		ql.addVehicle(new XeMay("92-D1", "Suzuki", 2002, "Red", new Owner("444444444444", "Xuan", "ddd@gmail.com"), 220));
		ql.addVehicle(new XeMay("81-E1", "Honda", 2003, "Grey", new Owner("555555555555", "Thang", "eee@gmail.com"), 150));
		ql.addVehicle(new XeMay("82-F1", "Yamaha", 2004, "Green", new Owner("666666666666", "Thanh", "fff@gmail.com"), 125));
		ql.addVehicle(new XeTai("77-G1", "Toyota", 2005, "Blue", new Owner("777777777777", "Thinh", "ggg@gmail.com"), 5000));
		ql.addVehicle(new XeTai("78-H1", "Suzuki", 2006, "Yellow", new Owner("888888888888", "Sinh", "hhh@gmail.com"), 10000));
		ql.addVehicle(new XeTai("36-J1", "Toyota", 2007, "Pink", new Owner("999999999999", "Na", "jjj@gmail.com"), 15000));
		
	    Vehicle v1 = ql.timKiemPTGTTheoSoXe("79-A1");
	    System.out.println("Tim kiem PTGT theo so xe: " + v1.getSoXe());
	    System.out.println("----------------------------------------");

	    List<Vehicle> v2 = ql.timPTGTCuaChuXeTheoSoCMND("999999999999");
	    System.out.println("Tim PTGT cua chu xe co so CMND tuong ung: " + v2.size());
	    System.out.println("----------------------------------------");
	    
	    System.out.println("Xoa tat ca PTGT cua 1 NSX bat ky: " + ql.getVehicles().size());
	    ql.xoaPTGTCuaNSX("Honda");
	    System.out.println("----------------------------------------");
	    
	    System.out.println("NSX co nhieu xe nhat dang duoc quan ly: " + ql.nhaSXCoNhieuXeNhat());
	    System.out.println("---------------------------");
	    
	    ql.sapXepPTGTTheoSoXeGiamDan();
	    
	    System.out.println("---------------------------");
	    ql.thongKe();
	    
	    
	}

}
