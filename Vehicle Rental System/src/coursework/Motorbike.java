package coursework;

public class Motorbike extends Vehicle {
    
    private double motorHeight;
    private double motorWeight;
    private int numberOfWheels;
    
    public Motorbike(String plateNumber, String vehicleMake, String vehicleColour, double height, double weight, int numberOfWheels) {
        
        super(plateNumber, vehicleMake, vehicleColour);
        this.motorHeight = height;
        this.motorWeight = weight;
        this.numberOfWheels = numberOfWheels;
    }

    public void setMotorHeight (double motorHeight) {
        
        this.motorHeight = motorHeight;
    }
    
    public double getMotorHeight () {
        
        return motorHeight;
    }
    
    public void setMotorWeight (double motorWeight) {
        
        this.motorWeight = motorWeight;
    }
    
    public double getMotorWeight () {
        
        return motorWeight;
    }
    
    public void setNumberOfWheels (int numberOfWheels) {
        
        this.numberOfWheels = numberOfWheels;
    }
    
    public int getNumberOfWheels () {
        
        return numberOfWheels;
    }

    @Override
    public String vehicleType() {
    	
        return "Motorbike";
    }
    
    @Override
    public String toString() {
    	
    	Vehicle.class.toString();
        String carStr = "Height: " + motorHeight + "\n" + "Weight: " + motorWeight + "\n" + "Number of Wheels: " + numberOfWheels;
        return carStr;
    }
    
}
