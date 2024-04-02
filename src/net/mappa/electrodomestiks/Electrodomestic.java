package net.mappa.electrodomestiks;

public class Electrodomestic {
    protected String brand;
    protected String model;
    protected float weight;
    protected int power;
    protected boolean isOn;

    public Electrodomestic(String brand, String model, float weight, int power) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.power = power;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public String isTurnOn() {
        if (this.isOn) {
            return "Si";
        } else {
            return "No";
        }
    }
}
