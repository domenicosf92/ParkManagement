package com.company;

import java.util.ArrayList;

public class Parking {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private int maxSize=200;
    private int space=0;

    public boolean addVehicle(Vehicle vehicle){
        if (this.space < maxSize){
            this.vehicles.add(vehicle);
            if (vehicle.type == Vehicle.Type.Car){
                this.space ++;
            }else
                if (vehicle.type == Vehicle.Type.Truck){
                    this.space += 3;
                }
            return true;
        }
        return false;
    }

    public boolean removeVehicle(Vehicle vehicle, int hourOfEnd, int minuteOfEnd){
        if (this.vehicles != null) {
            this.vehicles.remove(vehicle);
            if ((vehicle.type == Vehicle.Type.Car) && (this.space != 0)){
                this.space --;
            }else
                if ((vehicle.type == Vehicle.Type.Truck) && (this.space != 0)){
                    this.space -= 3;
                }
                vehicle.setStopEndTime(hourOfEnd,minuteOfEnd);
                vehicle.calculateStopTime();
                vehicle.calculateParkingCost();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
       String s="";
       int freeSpace = this.maxSize - this.space;
       s += "--Parking-- \nMax size: " + this.maxSize + "\nFree space: " + freeSpace;
       for (int i=0; i< this.vehicles.size(); i++){
           s += "\nVehicle type: " + this.vehicles.get(i);
       }
       s += "\n";
       return s;
    }
}
