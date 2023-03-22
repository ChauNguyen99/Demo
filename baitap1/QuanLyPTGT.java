package vn.sunasterisk.finalproject.baitap1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class QuanLyPTGT {
	
private List<Vehicle> vehicles;
    
    public QuanLyPTGT() {
        this.vehicles = new ArrayList<>();
    }
    
    public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	// Yeu cau 1 - Them PTGT
    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
    
    // Yeu cau 2 - Tim kiem PTGT theo so xe
    public Vehicle timKiemPTGTTheoSoXe(String numberOfCar) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getSoXe() == numberOfCar) {
                return vehicle;
            }
        }
        return null;
    }
    
    // Yeu cau 3 - Tim PTGT cua chu xe co so CMND tuong ung
    public List<Vehicle> timPTGTCuaChuXeTheoSoCMND(String soChungMinhNhanDan) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getChuXe().getSoCMND() == soChungMinhNhanDan) {
                result.add(vehicle);
            }
        }
        return result;
    }
    
    // Yeu cau 4 - Xoa tat ca PTGT cua 1 NSX bat ky
    public void xoaPTGTCuaNSX(String nhaSX) {
    	for (int i = 0; i < vehicles.size(); i++) {
    		if (vehicles.get(i).getNhaSanXuat() == nhaSX) {
    			vehicles.remove(i);
    		}
    	}
    }
    
    // Yeu cau 5 - Cho biet NSX nao co nhieu xe nhat dang duoc quan ly 
    public String nhaSXCoNhieuXeNhat() {
    	HashMap<String, Integer> manufacturers = new HashMap<String, Integer>();
    	for (Vehicle vehicle : vehicles) {
    		String manufacturer = vehicle.getNhaSanXuat();
    		int count = manufacturers.getOrDefault(manufacturer, 0);
    		manufacturers.put(manufacturer, count + 1);
    	}
    	int maxCount = 0;
        String maxManufacturer = null;
    	for (String manufacturer : manufacturers.keySet()) {
		  if (manufacturers.get(manufacturer) > maxCount) {
              maxCount = manufacturers.get(manufacturer);
              maxManufacturer = manufacturer;
          }
		}
    	return maxManufacturer + " voi " + maxCount + " xe";
    }
    
    // Yeu cau 6 - Sap xep cac PTGT theo so xe giam dan
    public void sapXepPTGTTheoSoXeGiamDan() {
        Collections.sort(vehicles);
        Collections.reverse(vehicles);
        System.out.println("Danh sach cac phuong tien giao thong theo so xe giam dan: ");
        for (Vehicle vehicle : vehicles) {
        	System.out.println(vehicle.getSoXe());
    	}
    }
    
    // Yeu cau 7 - Thong ke
    public void thongKe() {
    	HashMap<String, Integer> statisticsVehicle = new HashMap<String, Integer>();
    	for (Vehicle vehicle : vehicles) {
    		String type = vehicle.getClass().getSimpleName();
    		int count = statisticsVehicle.getOrDefault(type, 0);
    		statisticsVehicle.put(type, count + 1);
    	}
    	System.out.println("Thong ke so xe ma moi loai phuong tien dang quan ly: ");
    	for (String type : statisticsVehicle.keySet()) {
		  System.out.println(type + " - " + statisticsVehicle.get(type));
		}
    }
    
}
