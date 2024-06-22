package temp.Inheritance;

public class Bike extends Vehicle{

    private String bikeType;

    public Bike(){
        System.out.println("Bike const");
    }

    public Bike(String name, String transmissionType, int wheels, String bikeType){
        super(name, transmissionType, wheels);
        this.bikeType = bikeType;
    }

    public Bike(String bikeType){
        this.bikeType = bikeType;
    }

    public void resetTrip(){
        System.out.println("Reset trip");
    }

    @Override
    public String toString() {
        return getName()+" "+getTransmissionType()+" "+getWheels()+" "+this.bikeType;
    }
}
