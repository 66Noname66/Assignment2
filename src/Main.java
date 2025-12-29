public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("John Smith", "DL12345");
        Driver driver2 = new Driver("Anna Brown", "DL67890");

        Vehicle car = new Car("Toyota", 2020, 4, "Petrol");
        Vehicle motorcycle = new Motorcycle("Yamaha", 2018, false);
        Vehicle truck = new Truck("Volvo", 2019, 15.5, 4);

        car.setDriver(driver1);
        motorcycle.setDriver(driver1);
        truck.setDriver(driver2);

        Vehicle[] vehicles = { car, motorcycle, truck };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();

            if (v.getDriver() != null) {
                v.getDriver().displayDriverInfo();
            } else {
                System.out.println("No driver assigned.");
            }

            v.stopEngine();
            System.out.println(" ");
        }
    }
}
