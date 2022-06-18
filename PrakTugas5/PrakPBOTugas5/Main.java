package PrakPBOTugas5;

// Nama : Dyah Yuliana Abidah
// NIM  : 215150601111017

public class Main {

    public static void main(String[] args) {
	    CarRider ardi = new CarRider("Ardi", 29, "081237689267");
        CarRider reni = new CarRider("Reni", 26, "085243158890");
        CarRider tejo = new CarRider("Tejo", 29, "089434548897");
        CarRider yuni = new CarRider("yuni", 29, "088122349065");

        CarData data = new CarData();
        data.addCar("SPORT", "N 1788 KX", "Toyota");
        data.addCar("PICK UP", "N 1392 SH", "Mitsubishi");
        data.addCar("SEDAN", "N 2354 YV", "Mercedes");
        data.addCar("SUV", "N 3879 LI", "Daihatsu");

        data.listOfCar();

        RentArchive cadangan = new RentArchive();
        cadangan.Rent(ardi, data.carList.get(0), 4);
        cadangan.Rent(reni, data.carList.get(2), 3);
        cadangan.Rent(tejo, data.carList.get(1), 2);
        cadangan.Rent(yuni, data.carList.get(0), 5);

        System.out.println("");
        cadangan.info();
    }
}
