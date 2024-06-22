package temp;

import temp.Employee;
import temp.Inheritance.Bike;
import temp.Inheritance.Car;
import temp.Inheritance.Vehicle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TempMain {

    public static void main(String[] args) {
//
//        int x  = 3;
//
//        if(x == 2){
//            System.out.println("It is 2");
//        }else if (x == 3){
//            System.out.println("It is 3");
//        }
//        else if (x == 4){
//            System.out.println("It is 4");
//        }
//        else {
//            System.out.println("It is not 2 or 3");
//        }
//
//        int x = 5;
//
//        switch (x){
//            case 1 :
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            default:
//                System.out.println("Default: "+x);
//        }


//        for (int i=100; i>=1; i--){
//            System.out.println(i);
//        }


//        int i = 200;
//        while (i<100){
//            System.out.println(i);
//            i++;
//        }

//        int i=200;
//        do {
//            System.out.println(i);
//            i++;
//        }while (i<100);


//        String val = "Sushanthddldskd"; // immuatable it cannot be changed
//        System.out.println(val.hashCode());
//        val = "";
//        System.out.println(val.hashCode());
//        val = null;
//        System.out.println(val.hashCode());
        // System.out.println(val);

        //byte,int,short,long,float,double,boolean,char -> primitivie data type -> not an object
        //Byte,Integer,Short,Long,Float,Double, Boolean, Character -> reference/wrappper data type -> it is an object

//        int x = 5;
//        Integer y = 5;
//        System.out.println(x);
//        System.out.println(y);

        //Integer z = 10;
        // int n = z;  // auto unboxing
//        int n = z;
//
//        int x = 5;
//        Integer y = x; // auto boxing
//        System.out.println(y);
//
//        System.out.println(y.equals(x));

//        int[] x = new int[5];
//        x[0] = 5;
//        x[1] = 6;
//        x[2] = 7;
//        x[3] = 8;
//        x[4] = 9;
//       // x[5] = 10;
//        for(int i=0; i<x.length; i++){
//            System.out.println(x[i]);
//        }
//
//        String s [] = new String[3];
//        s[0] = "Sus";
//        s[1] = "hsh";
//        s[2] = "ss";

//        String s [] = new String[]{"SUS", "HA", "S"};
//
//        for(int i=0; i<s.length; i++){
//            System.out.println(s[i]);
//        }

//
//        int[][] x = new int[2][3];
//
//        x[0][0] = 5;
//        x[0][1] = 6;
//        x[0][2] = 7;
//        x[1][0] = 8;
//        x[1][1] = 9;
//        x[1][2] = 10;
//
//        System.out.println(x[0]);
//
//        for (int row=0; row<x.length; row++){
//            for(int col=0; col<x[row].length; col++){
//                System.out.println( row+""+col+" : " + x[row][col]);
//            }
//            System.out.println();
//        }

//        int temp[] = x[1];
//        for(int i=0; i<temp.length; i++){
//            System.out.println(temp[i]);
//        }

//        int[][] x = new int[][]{ {5, 6, 7},
//                                 {8, 9, 10}
//                                };
//
//        for (int row = 0; row < x.length; row++) {
//            for (int col = 0; col < x[row].length; col++) {
//                System.out.println(row + "" + col + " : " + x[row][col]);
//            }
//            System.out.println();
//        }


//        int e1Id = 1;
//        int e1Sal = 56465;
//        String e1Name = "s";
//
//
//        int e2Id = 1;
//        int e2Sal = 56465;
//        String e2Name = "s";


//        Employee e1 = new Employee();
//        e1.name = "Sus";
//        e1.id = 5;
//        e1.sal = 2500;
//
//        System.out.println(e1.hashCode()+" "+ e1.id+" "+ e1.name+" "+e1.sal);
//
//        e1.name = "sasa";
//        System.out.println(e1.hashCode()+" "+ e1.id+" "+ e1.name+" "+e1.sal);
//
//        Employee e2 = new Employee();
//        e2.name = "Sushj";
//        e2.id = 66;
//        e2.sal = 250880;
//
//        System.out.println(e2.hashCode()+" "+e2.id+" "+ e2.name+" "+e2.sal);

//        Employee e1 = new Employee();
//
//        String s1 = "Sushanth";
//        String s2 = "Sushanth";
//
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//
//        String h = s2;
//        System.out.println(h.hashCode());
//        h = "Sushanth23";
//        System.out.println(h.hashCode());


//        Employee e1 = new Employee();
//        System.out.println(e1.hashCode()+" "+ e1.id+" "+ e1.name+" "+e1.sal);
//        e1.name="sa";
//        e1.id=1;
//        e1.sal=855;
//        System.out.println(e1.hashCode()+" "+ e1.id+" "+ e1.name+" "+e1.sal);

//        Employee e1 = new Employee("SSS", 1, 5585.0);
//        System.out.println(e1.toString());
        //System.out.println(e1.hashCode() + " " + e1.id + " " + e1.name + " " + e1.sal);

//
//        Employee e2 = new Employee("SSS2", 2, 77);
//        System.out.println(e2.hashCode() + " " + e2.id + " " + e2.name + " " + e2.sal);
//
//
//        Employee e3 = new Employee();
//        System.out.println(e3.hashCode() + " " + e3.getId() + " " + e3.getName() + " " + e3.getSal());
//        e3.setName("sa");
//        e3.setId(1);
//        e3.setSal(855);
//        System.out.println(e3.hashCode() + " " + e3.getId() + " " + e3.getName() + " " + e3.getSal());
//        System.out.println(e3);

//        Aritmetics aritmetics = new Aritmetics();
//        int res = aritmetics.add(5,6);
//        System.out.println(res);

        //ArthmeticsAbst arthmeticsAbst = new ArthmeticsAbst();
//        ArthmeticsAbstImpl arthmeticsAbst = new ArthmeticsAbstImpl();
//        double res = arthmeticsAbst.division(4,2);
//        System.out.println(res);
//
//
//        ArithmeticsInterf arithmeticsInterf = new ArithmeticsInterfImpl();
//        System.out.println(arithmeticsInterf.division(8,5));

//        Car c = new Car("Tata", "AMT", 4, 7);
//        c.start();
//        c.horn();
//        c.playMusic();
//        c.kickStart();

//        Car c = new Car("Tata", "AMT", 4, 7);
//        c.start();
//        c.horn();
//        c.playMusic();
//        c.kickStart(); // runtime polymorphisum - method overriding
//        c.calculateMilage("Petrol"); // compile time polymorphisum -method overloading
//        //System.out.println(c.getName()+ " "+c.getTransmissionType()+" "+c.getNoOfSeats()+" "+c.getWheels());
//        System.out.println(c);
//        Bike b = new Bike("Yamaha", "MT", 2, "Gear");
//        b.start();
//        b.resetTrip();
//        b.kickStart();
//        System.out.println(b);

        // compile time or checked exceptions
        // runtime or unchecked exceptions
        // Throwable super class of all exceptions


        // 1 runtime or unchecked exceptions
        int i = 10;
        int j = 0;

//        try {
//            System.out.println(i / j);
//            String x = null;
//            x.length();pop
//        }
//        catch (ArithmeticException e){
//            System.out.println("Exception occured: "+e.getMessage());
//        }
//        catch (NullPointerException e){
//            System.out.println("Exception occured: "+e.getMessage());
//        }


//
//        try {
//            System.out.println(i / j);
////            String x = null;
////            if(x != null){
////                x.length();
////            }
//        }
//        catch (Exception e){
//            System.out.println("Exception occured: "+e.getMessage()+" "+e.getClass());
//        }
//
//        int a[] = new int[]{1,2,3};
//        try {
//            System.out.println(a[0]);
//            System.out.println(a[3]);
//
//        }
//        catch (Exception e){
//            System.out.println("Exception occurred: "+e.getMessage()+" "+e.getClass());
//        }
//        finally {
//            System.out.println("Finally block executed");
//        }
//
//
//        System.out.println("dhmsdsdf");
//
//        System.out.println("dhmsdsdf");


        // 2 compile time or checked exceptions

//        BufferedReader br = null;
//        try {
//            File file = new File("C:\\Users\\susha\\OneDrive\\Documents\\sample.txt");
//            FileReader fileReader = new FileReader(file);
//            br = new BufferedReader(fileReader);
//            System.out.println(br.readLine());
//        } catch (Exception e) {
//            System.out.println("Exception: " + e.getMessage()+"  "+e.getClass());
//        }finally {
//            try {
//                br.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        System.out.println("File reading success");

//
//        FileReadingService readingService = new FileReadingService();
//        try {
//            readingService.readData("C:\\Users\\susha\\OneDrive\\Documents\\sample.txt");
//        } catch (Exception e) {
//            System.out.println("Exception: "+e.getMessage()+" "+e.getClass());
//        }
//
//        System.out.println();


//        EmployeService employeService = new EmployeService();
//        Employee employee = null;
//        try {
//            employee = employeService.getEmployee();
//        } catch (Exception e) {
//            System.out.println("Exception: "+e.getMessage()+"  "+e.getClass());
//        }
//        System.out.println(employee);


//        try{
//            int x = 5/10;
//            throw new ArithmeticException("Some exception");
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }

        //Collections -> Array has fixed size, colections has dynamic size
        //List(Interface) -> ArrayList, LinkedList, DoubleLinkedList
        //Set(Interface) -> HashSet, TreeSet, LinkedHashSet
//        Employee e = new Employee("S",1,5555);
//        List list1 = new ArrayList();
//        list1.add("sushanth");
//        list1.add(5);
//        list1.add(88.5);
//        list1.add(true);
//        list1.add(e);
//        System.out.println(list1.size());
//        System.out.println(list1);

//        List<Integer> intList = new ArrayList<>();
//        intList.add(5);
//        intList.add(5);
//        System.out.println(intList);
//
        List<String> stringList = new ArrayList<>();
        stringList.add("5");
        stringList.add("susisu");
//        System.out.println(stringList);'
//        System.out.println(stringList.get(0));
//        for (int z=0; z<stringList.size(); z++){
//            System.out.println(stringList.get(z));
//        }

//        for (String q : stringList){
//            System.out.println(q);
//        }


        List<Integer> intList = new ArrayList<>(); // list preserves insertion order
        intList.add(5);
        intList.add(8);
        intList.add(9);
        intList.add(5);
        System.out.println(intList);

        Set<Integer> intSet = new HashSet<>();  // Hashset doesn't preserves insertion order and doesn't allow duplicates
        intSet.add(5);
        intSet.add(8);
        intSet.add(3);
        intSet.add(2);
        intSet.add(8);
        intSet.add(9);
        intSet.add(5);
        System.out.println(intSet);

        // Set<Integer> intSet = new LinkedHashSet<>();  // LinkedHashSet  preserves insertion order and doesn't allow duplicates

        Set<Integer> intSet1 = new HashSet<>();

        for(int q=0; q<10000; q++){
            intSet1.add(q);
        }

        System.out.println(intSet1);


    }


}
