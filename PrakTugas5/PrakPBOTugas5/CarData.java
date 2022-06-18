package PrakPBOTugas5;
import java.util.ArrayList;
// Nama : Dyah Yuliana Abidah
// NIM  : 215150601111017

public class CarData {
    static ArrayList<Car> carList = new ArrayList<Car>();

    public void addCar(String carTipe, String noPol, String merk){
        carList.add(new Car(carTipe, noPol, merk, true));
    }

    public void listOfCar(){
        System.out.println("========================================");
        System.out.println(" DAFTAR MOBIL ");
        System.out.println("========================================");
        for(Car daftar : carList){
            System.out.println(" Tipe Mobil : " + daftar.getCarTipe());
            System.out.println(" No. Polisi : " + daftar.getNoPol());
            System.out.println(" Merk Mobil : " + daftar.getMerk());
            System.out.println("----------------------------------------");
        }
        System.out.println(" ");
    }
}
