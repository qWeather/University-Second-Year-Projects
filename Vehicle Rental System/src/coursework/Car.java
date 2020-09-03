package coursework;

public class Car extends Vehicle {
    
    private int numberOfSeats;
    private boolean isConvertible;
    
    public Car(String plateNumber, String vehicleMake, String vehicleColour, int numberOfSeats, boolean convertible) {
        
        super(plateNumber, vehicleMake, vehicleColour);
        this.numberOfSeats = numberOfSeats;
        this.isConvertible = convertible;
    }
    
    public void setNumberOfSeats (int numberOfSeats) {
        
        this.numberOfSeats = numberOfSeats;
    }
    
    public int getNumberOfSeats () {
        
        return numberOfSeats;
    }
    
    public void setIsConvertible (boolean isConvertible) {
        
        this.isConvertible = isConvertible;
    }
    
    public boolean getIsConvertible () {
        
        return isConvertible;
    }

    @Override
    public String vehicleType() {
    	
        return "Car";
    }
    
    @Override
    public String toString() {
    	
    	Vehicle.class.toString();
        String carStr = "Number of Seats: " + numberOfSeats + "\n" + "Convertible: " + isConvertible;
        return carStr;
    } 
}
