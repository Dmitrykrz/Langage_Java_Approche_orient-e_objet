package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

public class Recensement {
    private List<Ville> Recensement;

    public Recensement()
    {
        this.Recensement = new ArrayList<>();
        LectureFichier.read(this);
    }

    public void addVille(Ville ville) {
        this.Recensement.add(ville);

    }
    public int getSize() {
        return this.Recensement.size();
    }

    public Ville getVilleByIndex(int index) {

        if (index >= 0 && index < this.Recensement.size()) {
            return this.Recensement.get(index);
        } else {
             throw new IndexOutOfBoundsException("Invalid index in getVilleByIndex");
        }
    }
}
