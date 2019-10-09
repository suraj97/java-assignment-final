package com.assesment.java1;
import java.util.ArrayList;
abstract class TollBooth {
    public ArrayList<Truck> trucksArrived = new ArrayList<>();
    public double totalToll;
 
    public void arrived(Truck truck) {
        double toll = calculateToll(truck.getAxles(), truck.getWeight());
        truck.displayData();
        System.out.printf("Toll Due:$%.2f\n", toll);
        addToll(toll);
        trucksArrived.add(truck);
    }
 
    public void addToll(double toll) {
        this.totalToll += toll;
    }
 
    public double getTotalToll() {
        return totalToll;
    }
 
    abstract public double calculateToll(int axles, double weight);
 
    abstract public void displayData();
 
}
class AlleghenyTollBooth extends TollBooth {
	 
    public double calculateToll(int axles, double weight) {
        double toll;
        toll = 5 * axles;
        weight = weight / 500;
        if (weight <= 60) {
            toll = toll + (10 * weight);
        } else {
            weight = weight - 60;
            toll = toll + (10 * 60) + (weight * 5);
        }
        return toll;
    }
 
    public void displayData() {
        System.out.printf("\nTotal Truck Arrived : %d   Total Receipt : $%.2f\n", trucksArrived.size(), getTotalToll());
    }
    }

