package PrakPBOTugas5;

// Nama : Dyah Yuliana Abidah
// NIM  : 215150601111017

public class CarRent {
    private CarRider rider;
    private Car car;
    private int rentDur;

    public CarRent(CarRider rider, Car car, int rentDur){
        this.rider      = rider;
        this.car        = car;
        this.rentDur    = rentDur;
    }

    public CarRider getCarRider(){
        return rider;
    }

    public Car getCar(){
        return car;
    }

    public int getRentDur(){
        return rentDur;
    }
}
