package PrakPBOTugas5;

// Nama : Dyah Yuliana Abidah
// NIM  : 215150601111017

public class CarRider {
    private String nama;
    private int umur;
    private String noHp;

    public CarRider(String nama, int umur, String noHp){
        this.nama   = nama;
        this.umur   = umur;
        this.noHp   = noHp;
    }

    public String getNama(){
        return nama;
    }

    public int getUmur(){
        return umur;
    }

    public String getNoHP(){
        return noHp;
    }
}
