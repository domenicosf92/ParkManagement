package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Parking parking= new Parking();
        /*int choice, hour, minute;
        String vehiclePlate;
        Vehicle vehicle1, vehicle2;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("-- Parking Area Management --");
            System.out.println("1. Add vehicle to parking \n2. Remove vehicle (when it leave parking) \n3. Print parking situation \n0. Exit");
            System.out.print("Your choice: ");
            choice = s.nextInt();
            switch (choice){
                case 0:
                    return;
                case 1:
                    System.out.println("0. Car \n1. Truck");
                    int type = s.nextInt();
                    Vehicle.Type t;
                    System.out.print("Vehicle license plate: ");
                    vehiclePlate = s.next();
                    System.out.println("Stop start time \nHour: ");
                    hour = s.nextInt();
                    System.out.println("Minute: ");
                    minute = s.nextInt();
                    switch (type){
                        case 0:
                            t = Vehicle.Type.Car;
                            vehicle1 = new Vehicle(t, vehiclePlate, hour, minute);
                            parking.addVehicle(vehicle1);
                            break;
                        case 1:
                            t = Vehicle.Type.Truck;
                            vehicle2 = new Vehicle(t, vehiclePlate, hour, minute);
                            parking.addVehicle(vehicle2);
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println(parking);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }while (choice!=0);*/
    }
}
