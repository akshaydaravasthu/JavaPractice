package temp.Inheritance;

public class Vehicle {

    private String name;
    private String transmissionType;
    private int wheels;

    public Vehicle(){
        System.out.println("Vehicle const");
    }

    public Vehicle(String name, String transmissionType, int wheels) {
        System.out.println("Vehicle const");
        this.name = name;
        this.transmissionType = transmissionType;
        this.wheels = wheels;
    }

    public void start(){
        System.out.println("Vehicle started");
    }

    public void stop(){
        System.out.println("Vehicle stopped");
    }

    public void horn(){
        System.out.println("Honking");
    }

    public void brake(){
        System.out.println("brake applied");
    }

    public void kickStart(){
        System.out.println("Kick starting");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }


}
