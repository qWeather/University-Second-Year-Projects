package coursework;

public class Coursework {

    public static void main(String[] args) {
        
        RentalVehicleManager rent = new WestminsterRentalVehicleManager(50);
        boolean exit = false;

        while(!exit) {

            exit = rent.runMenu();
        }
    }
    
}
