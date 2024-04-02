package net.mappa.calculator;

public class Calculator {

    public static int elevatedSumN(int num) {
        int sum = 0;
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                sum += Math.pow(i, 2);
            }
        }
        return sum;
    }

    public static float calculateGradesAvg(float[] list) {
        float numList = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > 0) {
                numList += list[i];
            }
        }

        return numList / list.length;
    }

}
