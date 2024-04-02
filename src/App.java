import net.mappa.calculator.Calculator;
import net.mappa.electrodomestiks.Fridge;
import net.mappa.electrodomestiks.Microwave;

public class App {
    public static void main(String[] args) throws Exception {
        float[] numsList = {10, 4, 6, 1, 7};
        System.out.println(Calculator.elevatedSumN(3));
        System.out.println(Calculator.calculateGradesAvg(numsList));

        Fridge fridgy = new Fridge("Zukamoro", "AifonPluh3090", 450, 20, 4);

        fridgy.turnOn();
        System.out.println(fridgy.toString());
        fridgy.turnOff();
        
        Microwave microwiwi = new Microwave("Xanthuom", "Murgatario Zen Plus", 70, 120, true);

        microwiwi.turnOn();
        System.out.println(microwiwi.toString());
        microwiwi.turnOff();
    }
}
