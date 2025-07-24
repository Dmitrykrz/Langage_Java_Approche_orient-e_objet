package fr.diginamic.recensement;
import java.util.Scanner;
public abstract class MenuService {
   // classe MenuService abstraite
  // dont hériteront toutes les classes de services.

   public abstract void traiter(Recensement recensement, Scanner scanner);

}
