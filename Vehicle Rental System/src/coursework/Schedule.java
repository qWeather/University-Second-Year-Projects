package coursework;

public class Schedule {
	
    private int year;
    private int month;
    private int day;
    private int dropOff;
    private int pickUp;
    
    public Schedule(int day, int month, int year) {
    	
        if ((year > 1939) && (year<2099) && (month > 0) && (month < 13) && (day > 0) && (day < 32)) {
        	
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
        	
            System.err.println("Not the correct date.");
        }
        
}
    public void setYear(int year) {
    	
        if ((year > 1939) && (year<2099)) {
        	
            this.year = year;
        } else {
        	
            System.err.println("Not the correct range.");
        }   
    }
    
    public void setMonth(int month) {
    	
        if ((month > 0) && (month<13)) {
        	
            this.month = month;
        } else {
        	
            System.err.println("Not the correct range.");
        }
    }
    
    public void setDay(int day) {
    	
        if ((day > 0) && (day<32)) {
        	
            this.day = day;
        } else {
        	
            System.err.println("Not the correct range.");
        }
    }
    
    public int getYear() {
    	
        return year;
    }
    
    public int getMonth() {
    	
        return month;
    }
    
    public int getDay() {
    	
        return day;
    }
    
    public String getDate() {
    	
        String dateStr = String.format("%02d/%02d/%04d", day, month, year);
        return dateStr;
    }
    
    public void setDropOff(int dropOff) {
        
    	this.dropOff = dropOff;
    }
    
    public int getDropOff() {
    	
    	return dropOff;
    }
    
    public void setPickUp(int pickUp) {
    	
    	this.pickUp = pickUp;
    }
    
    public int getPickUp() {
    	
    	return pickUp;
    }
    
    @Override
    public String toString() {
    	
        String dateStr = String.format("%02d/%02d/%04d", day, month, year);
        return dateStr;
    }
}
