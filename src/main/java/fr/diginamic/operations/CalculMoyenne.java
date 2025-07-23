package fr.diginamic.operations;

import java.util.ArrayList;
import java.util.List;

public class CalculMoyenne {

    private List<Double> nombres;

    public CalculMoyenne() {
        this.nombres = new ArrayList<>();
    }

    public void ajout(double i) {
        nombres.add(i);
    }

    public double calcul() {
        if (nombres.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Double nombre : nombres) {
            sum += nombre;
        }
        return sum / nombres.size();
    }
}
