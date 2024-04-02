package net.mappa.electrodomestiks;

public class Fridge extends Electrodomestic{
    
    private float temperature;

    public Fridge(String brand, String model, float weight, int power, float temperature) {
        super(brand, model, weight, power);
        this.temperature = temperature;
    }

    public float getTemperature() {
        return this.temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }


    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("¡Ños, fuerte pelete!");
    }

    @Override
    public String toString() {
        return "-------------------------------------------------------------------------------------------------\n* Tipo de electrodoméstico: Nevera \n* Marca: " + this.getBrand() + "\n* Modelo: " + this.getModel() + "\n* Peso: " + this.getWeight() + " kg" +"\n* Potencia: " + this.getPower() + " kW" + "\n* Temperatura: " + this.getTemperature() + " ºC" + "\n* Está encendido: " + this.isTurnOn() + "\n-------------------------------------------------------------------------------------------------";
    }
}
