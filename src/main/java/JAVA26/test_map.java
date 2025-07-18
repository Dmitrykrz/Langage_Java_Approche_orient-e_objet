package JAVA26;

import java.util.Collection;
import java.util.Map;

public class test_map {

    public static void main(String[] args) {
        System.out.println("--- Generating figures with integer keys using genere_2_with_key ---");

        Collection<Figure> generatedFigures = FigureUtil.genere_2_with_key(5);

        System.out.println("\n--- Contents of FigureUtil.figuresMap ---");

        Map<String, Figure> figuresMap = FigureUtil.getFiguresMap();

        if (figuresMap.isEmpty()) {
            System.out.println("The figures map is empty. No figures were generated or stored.");
        } else {
            // Iterate through the map and print each key-value pair
            for (Map.Entry<String, Figure> entry : figuresMap.entrySet()) {
                String key = entry.getKey();
                Figure figure = entry.getValue();
                System.out.println(   key+ " "+figure.toString());


            }
        }

        System.out.println("\n--- End of test_map demonstration ---");
    }
}
