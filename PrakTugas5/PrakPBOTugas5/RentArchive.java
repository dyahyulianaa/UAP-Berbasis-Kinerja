package PrakPBOTugas5;
import java.util.ArrayList;

// Nama : Dyah Yuliana Abidah
// NIM  : 215150601111017

public class RentArchive {
    static ArrayList<CarRent> rentData = new ArrayList<CarRent>();

    public void Rent(CarRider rider, Car car, int rentDur){
        if (car.getStatus() == true){
            System.out.println("Mobil Berhasil Disewa");
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, rentDur));
        }else {
            System.out.println("Maaf, Mobil Sudah Disewa");
        }
    }

    public void info(){
        System.out.println("========================================");
        System.out.println(" INFORMASI PELANGGAN ");
        System.out.println("========================================");

        for (int i = 0; i < rentData.size(); i++) {
            System.out.println("NAMA PEMINJAM   : " +rentData.get(i).getCarRider().getNama());
            System.out.println("TIPE MOBIL      : " +rentData.get(i).getCar().getCarTipe());
            System.out.println("NO. POLISI      : " +rentData.get(i).getCar().getNoPol());
            System.out.println("LAMA RENTAL     : " +rentData.get(i).getRentDur());
            System.out.println("----------------------------------------");
        }
        System.out.println(" ");
    }
}
