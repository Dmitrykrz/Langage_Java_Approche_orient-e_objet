package JAVA23;

import java.util.ArrayList;
import java.util.Collection;


public class Dessin {

    private ArrayList<Figure> figures;
    public Collection<Figure> getFigures() {
        return figures;
    }

    public Dessin() {
        figures = new ArrayList<>();
    }

    public Dessin(Collection<Figure> figures) {
        this.figures = new ArrayList<>(figures);
    }

    public boolean add(Figure f) {
        return figures.add(f);
    }




    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Figure f : figures) {
            result.append(f.toString()).append("\n");
        }
        return result.toString();
    }
}


