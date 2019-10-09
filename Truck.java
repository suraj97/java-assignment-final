package com.assesment.java1;

abstract class Truck {
    private final int axles;
    private double weight;
 
    public Truck(int axles, double weight) {
        this.axles = axles;
        this.weight = weight;
    }
 
    public int getAxles() {
        return axles;
    }
 
    public double getWeight() {
        return weight;
    }
 
    abstract public void displayData();
}
class DaewooTruck extends Truck {
    private static final String name = "DaewooTruck";
 
    public DaewooTruck(int axles, double weight) {
        super(axles, weight);
    }
 
    public void displayData() {
        System.out.printf("%s Axles : %d Total Weight KG: %.2f ", name, getAxles(), getWeight());
    }
}

class FordTruck extends Truck {
    private static final String name = "FordTruck";
 
    public FordTruck(int axles, double weight) {
        super(axles, weight);
    }
 
    public void displayData() {
        System.out.printf("%s   Axles : %d Total Weight KG: %.2f ", name, getAxles(), getWeight());
    }
}

class NissanTruck extends Truck {
    private static final String name = "NissanTruck";
 
    public NissanTruck(int axles, double weight) {
        super(axles, weight);
    }
 
    public void displayData() {
        System.out.printf("%s Axles : %d Total Weight KG: %.2f ", name, getAxles(), getWeight());
    }
  }	
