package org.progmatic.nov18.vehicle;

public class VehicleApp {

    public static void main(String[] args) {
        VehicleApp vehicleApp = new VehicleApp();
        Sedan sedan = new Sedan(250, 5, 1600, 500, 3);
        Cabrio cabrio = new Cabrio(220, 2, 1200, 250, 3);
        vehicleApp.recommendation(cabrio);
    }

    public void recommendation(Vehicle vehicle) {
        if (vehicle instanceof Sedan) {
            System.out.println("Cégeknek");
        } else if (vehicle instanceof Sport) {
            System.out.println("Versenyzőknek");
        } else if (vehicle instanceof Suv) {
            System.out.println("Családoknak");
        } else if (vehicle instanceof Truck) {
            System.out.println("Kamionosoknak");
        } else {
            System.out.println("Szingliknek");
        }
    }
}
