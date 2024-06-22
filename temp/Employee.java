package temp;

public class Employee {


    private String name;
    private int id;
    private double sal;


    public Employee(){

    }

    public Employee(String name, int id, double sal){
        System.out.println("Double");
        this.name = name;
        this.id = id;
        this.sal = sal;
    }
    public Employee(String name, int id, int sal){
        System.out.println("INT");
        this.name = name;
        this.id = id;
        this.sal = sal;
    }


    public void setName(String name){
        if(name != null && name.length() > 5) {
            this.name = name;
        }
    }

    public String getName(){
        return this.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String toString(){
        return "Id: "+this.id+" Name: "+this.name+" Salary: "+this.sal;
    }




}
