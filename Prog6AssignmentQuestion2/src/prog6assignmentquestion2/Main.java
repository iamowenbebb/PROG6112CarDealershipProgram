package Prog6AssignmentQuestion2;

import java.util.Scanner;

// Base Class Vehicle
class Vehicle {

    // Private Fields
    private String make;
    private String color;
    private String year;
    private String model;


    // Parameterized Constructor
    public Vehicle(String make, String color, String year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    // public method to print details
    public void printDetails() {
        System.out.println("\t\tManufacturer: " + make);
        System.out.println("\t\tModel: " + model);
        System.out.println("\t\tColor: " + color);
        System.out.println("\t\tYear: " + year);

    }

}

// Derived Class Car
class Car extends Vehicle {

    // Private field
    private String bodyStyle;
    private String price;

    // Parameterized Constructor
    public Car(String make, String color, String year, String model, String bodyStyle,  String price) {
        super(make, color, year, model);  //calling parent class constructor
        this.bodyStyle = bodyStyle;
        this.price = price;
    }

    public void carDetails() {  //details of car
        printDetails();         //calling method from parent class
        System.out.println("\t\tBody Style: " + bodyStyle);
        System.out.println("\t\tPrice: " + price);
    }

}

class Main {

    public static void main(String[] args) {
        //An array to store the data of cars available for sale
        String[][] cars_for_sale = {
                {"Toyota", " Camry", " Sedan", "2019","Black","R900,000"},
                {"Toyota", "Corolla", "SUV ", "2017", "Red","R754,000"},
                {"VolksWagen","Golf ", " Convertible"," 2020","Black","R879,000"},
                {"Ford","Everest","Convertible"," 2019", "white"," R1,200,000"}
                 };
//Menu
        System.out.println("Welcome to Owen Car Delearship");
        System.out.println("View our stock");
        System.out.println("1. View all cars");
        System.out.println("2. View car by make");
        System.out.print("Enter your option: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option == 1)
        {

            for(int i = 0; i<cars_for_sale.length;i++)
          {
            System.out.print(i+1);
            Car elantraSedan = new Car(cars_for_sale[i][0],cars_for_sale[i][4],
                    cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); //creation of car Object
            elantraSedan.carDetails(); //calling method to print details
          }
        }
        else if(option==2)
        {
            System.out.println("1.View Toyota cars");
            System.out.println("2.View Ford cars");
            System.out.println("3.View Volkswagen cars");
            System.out.print("Enter you option: ");
            int myoption = sc.nextInt();
            if(myoption == 1)
            {  int count = 1;
                for(int i = 0; i<cars_for_sale.length;i++)
                {
                    if(cars_for_sale[i][0] == "Toyota") {
                        System.out.print(count);
                        Car elantraSedan = new Car(cars_for_sale[i][0], cars_for_sale[i][4],
                                cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); //creation of car Object
                        elantraSedan.carDetails(); //calling method to print details
                        count = count +1;
                    }
                }
            }
            else if(myoption == 2)
            {
                int count = 1;
                for(int i = 0; i<cars_for_sale.length;i++)
                {
                    if(cars_for_sale[i][0] == "VolksWagen") {
                        System.out.print(count);
                        Car elantraSedan = new Car(cars_for_sale[i][0], cars_for_sale[i][4],
                                cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); //creation of car Object
                        elantraSedan.carDetails(); //calling method to print details
                        count = count +1;
                    }
                }
            }
            else if(myoption == 3)
            {
                int count = 1;
                for(int i = 0; i<cars_for_sale.length;i++)
                {
                    if(cars_for_sale[i][0] == "Ford") {
                        System.out.print(count);
                        Car elantraSedan = new Car(cars_for_sale[i][0], cars_for_sale[i][4],
                                cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); //creation of car Object
                        elantraSedan.carDetails(); //calling method to print details
                        count = count +1;
                    }
                }
            }
            else
            {
                System.out.println("Invalid option, please try again");
            }
        }
        else
        {
            System.out.println("Invalid option please try again");
        }
    }
}