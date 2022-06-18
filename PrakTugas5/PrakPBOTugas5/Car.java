package PrakPBOTugas5;

// Nama : Dyah Yuliana Abidah
// NIM  : 215150601111017

public class Car {
    private String carTipe;
    private String noPol;
    private String merk;
    private boolean status;

    public Car(String carTipe, String noPol, String merk, boolean status){
        this.carTipe    = carTipe;
        this.noPol      = noPol;
        this.merk       = merk;
        this.status     = true;
    }

    public String getCarTipe(){
        return carTipe;
    }

    public String getNoPol() {
        return noPol;
    }

    public String getMerk() {
        return merk;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status){
        this.status     = status;
    }
}
