package temp.Inheritance;

public class Car extends Vehicle{


    private int noOfSeats;

    public Car(){
        System.out.println("Car const");
    }

    public Car(String name, String transmissionType, int wheels, int noOfSeats){
        super(name,transmissionType,wheels);
        this.noOfSeats = noOfSeats;

        System.out.println("Car const");
    }

    public void playMusic(){

        System.out.println("Playing music");
    }

    @Override
    public void kickStart(){
        System.out.println("Not able to kick start");
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }


    public double calculateMilage(){
        return 50;
    }

    public double calculateMilage(String fuelType){
        if(fuelType.equals("Petrol")){
            return 70;

        }
        else{
            return 50;
        }
    }

    public double calculateMilage(String fuelType, int data){
        if(fuelType.equals("Petrol")){
            return 70;

        }
        else{
            return 50;
        }
    }

    @Override
    public String toString() {
        return getName()+" "+getTransmissionType()+" "+getWheels()+" "+this.noOfSeats;
    }
}
