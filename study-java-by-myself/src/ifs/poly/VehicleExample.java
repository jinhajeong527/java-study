package ifs.poly;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.run();
        // vehicle.checkFare();
        //  강제 타입 변환
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
