package com.company;

import java.time.LocalTime;

public class Vehicle {
    public Type type;
    private String vehicleLicensePlate;
    private LocalTime stopStartTime;
    private LocalTime stopEndTime;
    private int totalStopHours, totalStopMinutes, stopStartHours, stopStartMinutes, stopEndHours , stopEndMinutes;
    private double payment;
    public enum Type{
        Car,
        Truck;
    }

    public Vehicle(Type typeOfVehicle, String vehicleLicensePlate, int hour, int minute){
        this.vehicleLicensePlate = vehicleLicensePlate;
        this.stopStartTime = LocalTime.of(hour, minute);
        this.stopStartHours = hour;
        this.stopStartMinutes = minute;
                switch (typeOfVehicle) {
            case Car:
                this.type = Type.Car;
                break;
            case Truck:
                this.type = Type.Truck;
                break;
        }
    }

    public void calculateStopTime(){
        if (stopEndMinutes==0){
            this.stopEndHours -= 1;
            this.stopEndMinutes = 60;
        }
        this.totalStopHours = this.stopEndHours - this.stopStartHours;
        this.totalStopMinutes = this.stopEndMinutes - this.stopStartMinutes;
    }

    public void setStopEndTime(int hour, int minute) {
        this.stopEndTime = LocalTime.of(hour,minute);
        this.stopEndHours = hour;
        this.stopEndMinutes = minute;
    }

    public double calculateParkingCost(){
        int timeInMinute = (this.totalStopHours*60) + this.totalStopMinutes;
        if (timeInMinute <= (2 * 60)) {
            this.payment = timeInMinute/100;
        }else
            if (timeInMinute < 3 * 60) {
            this.payment = 4;
            } else
                if (timeInMinute < (8 * 60)) {
                    this.payment = 2 + (timeInMinute/100);
                }else {
                    this.payment = 6;
                }
        return this.payment;
    }

    @Override
    public String toString() {
        return "Vehicle " + "\nType: " + type + "\nVehicle License Plate: " + vehicleLicensePlate + "\nStop Start: " + this.stopStartHours + ":"
                + this.stopStartMinutes/* + "\nStop End: " + this.stopEndHours + ":" + this.stopEndMinutes*/ + "\nTotal parking time: "
                + this.totalStopHours + ":" + this.totalStopMinutes + "\nParking cost: " + this.payment + "€";
    }
}
