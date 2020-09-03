package coursework;

import java.util.*;
import java.util.function.Predicate;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WestminsterRentalVehicleManager implements RentalVehicleManager {
    
    public static ArrayList <Vehicle> vehicleList;
    private int numberOfVehicles;
    private Scanner s;
    
    public WestminsterRentalVehicleManager (int numberOfVehicles) {
        
        this.numberOfVehicles = numberOfVehicles;
        vehicleList = new ArrayList<>(50);
    }
    
    @Override
    public void addVehicle(Vehicle vehicle){
        
        if(vehicleList.size() < numberOfVehicles) {
            
            vehicleList.add(vehicle);
        } else {
            
            System.err.println("No more space in the parking lot!");
        }
    }
    
    @Override
    public void deleteVehicle(Vehicle vehicle) {
        
        if(vehicleList.size() > 0) {
            
            vehicleList.remove(vehicle);
        } else {
            
            System.err.println("There is no vehicle parked!");
        }
    }
    
    @Override
    public void printVehiclesList() {
    	
        for(int i = 0; i < vehicleList.size(); i++) {
        		
        	if(vehicleList.size() > 0) {
                    Collections.sort(vehicleList, new Comparator<Vehicle>() {
	            @Override
	            public int compare(Vehicle v1, Vehicle v2) {
	            	return v1.getVehicleMake().compareTo(v2.getVehicleMake());
	            }
	        });
                System.out.println("Plate Number: " + vehicleList.get(i).getPlateNumber());
                System.out.println("Type of vehicle: " + vehicleList.get(i).vehicleType());
        	} else {
        		
                    System.err.println("There is no vehicle in the parking lot.");
        	}
        }
        
        
    }
    
    @Override
    public void save() {
        
        PrintWriter save;
		try {
			
                    save = new PrintWriter("rentalsystem.txt");
                    save.println("These are the available vehicles in stock: " + "\n");
                    
                    for(int z = 0; z < vehicleList.size(); z++) {
				
                    save.println("Plate Number: " + vehicleList.get(z).getPlateNumber());
                    save.println("Make: " + vehicleList.get(z).getVehicleMake());
                    save.println("Colour: " + vehicleList.get(z).getVehicleColour());
                    save.println("\n");
        	}
			
                switch (vehicleList.size()) {
                    case 1:
                        
                        save.println("There is one vehicle in stock.");
                        break;
                    case 0:
                        
                        save.println("There are no vehicles in the stock at the moment.");
                        break;
                    default:
                        
                        save.println("There are " + vehicleList.size() + " vehicles in stock.");
                        break;
                }
			
                save.close();
		} catch (FileNotFoundException e) {
                    
                    System.err.println("There is no file with that name.");
		}
	}
    
    @Override
    public boolean runMenu() {
        
        boolean exit = false;
        s = new Scanner(System.in);
        int choice = 0;
        try {
        	
	    System.out.println("Press '1' to add a vehicle.");
	    System.out.println("Press '2' to delete a vehicle.");
	    System.out.println("Press '3' to print the vehicles list.");
	    System.out.println("Press '4' to save into a file.");
            System.out.println("Press '5' to open the GUI.");
	    System.out.println("Press '6' to exit.");
	        
            choice = s.nextInt();
        }
        
        catch(InputMismatchException e) {
            
            System.err.println("The input needs to be a number between 1 and 6.");
        }
        
        
        switch(choice) {
            
            case 1:
            	
                Scanner i = new Scanner(System.in);
                
                System.out.println("What is the plate number of the vehicle? ");
                String plateNumber = i.nextLine();
                System.out.println("What is the vehicle's make? ");
                String vehicleMake = i.nextLine();
                System.out.println("What is the vehicle's colour? ");
                String vehicleColour = i.nextLine();
                
                Scanner t = new Scanner(System.in);
                String type = "";
                
                while((!"Car".equals(type)) && (!"Motorbike".equals(type))) {
                    
                    try {
                        
                       System.out.println("Is this a 'Car' or a 'Motorbike'? ");
                       type = t.nextLine();
                    }
                    catch(InputMismatchException e) {
                        
                        System.err.println("Invalid input!");
                        break;
                    }
                }
                        
                switch(type) {

                    case "Car":

                        Scanner c = new Scanner(System.in);
                        int numberOfSeats = 0;
                        try {
                            
                            System.out.println("What is the number of seats? ");
                            numberOfSeats = c.nextInt();
                        }
                        catch(InputMismatchException e) {
                            
                            System.err.println("Invalid input!");
                        }
                        
                        boolean convertible = false;
                        String isConvertible = "";
                        
                        while((!"yes".equals(isConvertible)) && (!"no".equals(isConvertible))) {
                    
                            try {
                        
                                System.out.println("Is this car convertible? (yes/no) ");
                                isConvertible = c.nextLine();
                            }
                            catch(InputMismatchException e) {
                        
                                System.err.println("Invalid input!");
                                break;
                            }
                        }
                        
                        Car car = new Car(plateNumber, vehicleMake, vehicleColour, numberOfSeats, convertible);
                        this.addVehicle(car);
                        break;

                    case "Motorbike":

                        Scanner m = new Scanner(System.in);
                        double height = 0;
                        try {
                        
                            System.out.println("What is the height? ");
                            height = m.nextDouble();
                        }
                        catch(InputMismatchException e) {
                        
                            System.err.println("Invalid input!");
                        }
                        
                        double weight = 0;
                        try {
                        
                            System.out.println("What is the weight? ");
                            weight = m.nextDouble();
                        }
                        catch(InputMismatchException e) {
                        
                            System.err.println("Invalid input!");
                        }
                        
                        int numberOfWheels = 0;
                        try {
                        
                            System.out.println("What is the number of wheels? ");
                            numberOfWheels = m.nextInt();
                        }
                        catch(InputMismatchException e) {
                        
                            System.err.println("Invalid input!");
                        }
                        
                        Motorbike motor = new Motorbike(plateNumber, vehicleMake, vehicleColour, height, weight, numberOfWheels);
                        this.addVehicle(motor);
                        break;
                    }
                    numberOfVehicles++;
                    save();
                    System.out.println("Vehicle was succesfully added to the parking lot.");
                    break;
    
            case 2:
                
            	Scanner remove = new Scanner(System.in);
            	System.out.println("What is the plate number of the vehicle?");
                String delete = remove.nextLine();
           
                Predicate<Vehicle> removeVehicle = vehicle -> vehicle.getPlateNumber().equals(delete);
                vehicleList.removeIf(removeVehicle);
                numberOfVehicles--;
                
            	System.out.println("Vehicle was succesfully removed from the parking lot.");
                switch (vehicleList.size()) {
                    case 1:
                        
                        System.out.println("There is one vehicle in stock.");
                        break;
                    case 0:
                        
                        System.err.println("There are no vehicles in the stock at the moment.");
                        break;
                    default:
                        
                        System.out.println("There are " + numberOfVehicles + " vehicles in stock.");
                        break;
                }
            	
            	save();
                break;
                
            case 3:
                
                this.printVehiclesList();
                break;
            
            case 4:
                
            	this.save();
                break;
                
            case 5: 
            	
                try {
                    
                    RentalSystem f = new RentalSystem();
                    f.setVisible(true);
                }
                catch (NullPointerException e) {
                    
                    System.err.println("");
                    break;
                }
                
            	break;
            	
            case 6:
                
                exit = true;
                break;
        }
        
        return exit;
    }
}
