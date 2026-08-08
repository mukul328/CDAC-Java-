package ContructorAssignment;






// Q 1 Write a Java class Car with the following attributes: make,
// model, year, and color. Implement a constructor that initializes these
// attributes when an object of the Car class is created. Write a main
// method to create an instance of Car and display its attributes.
// Enhance
// the Car class from the previous question by adding a parameterized
// constructor that takes values for make, model, year, and color as
import java.util.Date;

public class Car {
    String maker;
    String model;
    int year;
    String color;

    Car(){
        System.out.println("Default Constructor");
    }

    Car(String maker, String model,int year,String color){
        System.out.println("Parameterized Constructor");
        this.model= model;
        this.maker = maker;
        this.color =color;
        this.year = year;
    }

    public static void main(String []args){
         Car car = new Car();
        // car.maker ="Ford";
        // car.model ="Ecosport";
        // car.color ="grey";
        // car.year = 2017;

        Car car2 = new Car("ford","Ecosport",2017,"grey");
        System.out.println(car2.maker);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.year);
    }

    

}
