package coursework;

public interface RentalVehicleManager {
    
    public abstract void addVehicle(Vehicle vehicle);
    public abstract void deleteVehicle(Vehicle vehicle);
    public abstract void printVehiclesList();
    public abstract void save();
    public abstract boolean runMenu();
}
