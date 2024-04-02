package net.mappa.electrodomestiks;

public class Microwave extends Electrodomestic{
    private boolean isDoorOpen;

    public Microwave(String brand, String model, float weight, int power, boolean isDoorOpen) {
        super(brand, model, weight, power);
        this.isDoorOpen = isDoorOpen;
    }

    public boolean isDoorOpen() {
        return this.isDoorOpen;
    }

    public void setDoorOpen(boolean isDoorOpen) {
        this.isDoorOpen = isDoorOpen;
    }

    public String checkDoor() {
        if (this.isDoorOpen()) {
            return "Abierta";
        } else {
            return "Cerrada";
        }
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("Algo huele a quemado, talvez un negro");
    }

    @Override
    public String toString() {
        return "-------------------------------------------------------------------------------------------------\n* Tipo de electrodoméstico: Microondas \n* Marca: " + this.getBrand() + "\n* Modelo: " + this.getModel() + "\n* Peso: " + this.getWeight() + " kg" + "\n* Potencia: " + this.getPower() + " kW" +"\n* Puerta: " + this.checkDoor() + "\n* Está encendido: " + this.isTurnOn() + "\n-------------------------------------------------------------------------------------------------";
    }
}
