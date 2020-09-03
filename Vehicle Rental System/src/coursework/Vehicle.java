package coursework;

public abstract class Vehicle {
    
    private String plateNumber;
    private String vehicleMake;
    private String vehicleColour;
    
    public Vehicle (String plateNumber, String vehicleMake, String vehicleColour) {
        
        this.plateNumber = plateNumber;
        this.vehicleMake = vehicleMake;
        this.vehicleColour = vehicleColour;
    }
    
    public void setPlateNumber (String plateNumber) {
        
        this.plateNumber = plateNumber;
    }
    
    public String getPlateNumber () {
        
        return plateNumber;
    }
    
    public void setVehicleMake (String vehicleMake) {
        
        this.vehicleMake = vehicleMake;
    }
    
    public String getVehicleMake () {
        
        return vehicleMake;
    }
    
    public void setVehicleColour (String vehicleColour) {
        
        this.vehicleColour = vehicleColour;
    }
    
    public String getVehicleColour () {
        
        return vehicleColour;
    }
    
    public abstract String vehicleType();
    
    @Override
    public String toString() {
    	
        String vehicleStr = "Plate Number: " + plateNumber + "\n" + "Make: " + vehicleMake + "\n" + "Colour: " + vehicleColour;
        return vehicleStr;
    }
}
