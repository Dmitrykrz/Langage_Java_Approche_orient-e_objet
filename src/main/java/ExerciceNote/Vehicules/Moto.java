package ExerciceNote.Vehicules;


import ExerciceNote.Port;

public class Moto extends Routier implements AMoteur {
    private double essenceReservoir;
    private double carburantRestant;
    private static final int essenceReservoirDefault = 20;

    public Moto(String marque, String modele, String numImmat) {
        this(marque, modele, numImmat,essenceReservoirDefault);
    }

    public Moto(String marque, String modele, String numImmat, double essenceReservoirSet) {
        super(marque,modele,numImmat);
        if (essenceReservoirSet <= 0) {
            throw new IllegalArgumentException("La taille du réservoir d'essence doit être supérieure à 0.");
        }
        this.essenceReservoir=essenceReservoirSet;
        this.carburantRestant = 0; // imaginons que tous les nouveaux véhicules soient créés avec un réservoir vide
    }

    public void remplirReservoir(Port port) {
        double fuelNeededByVehicle=this.essenceReservoir-this.carburantRestant;
        if (port.getReservoir()<fuelNeededByVehicle)
            throw new IllegalArgumentException("Il n'y a pas assez de carburant dans le port");
        else {
            port.obtenirCarburant(fuelNeededByVehicle);
            this.carburantRestant=this.essenceReservoir;
        }
    }

    public double  getReservoir() {
        return this.essenceReservoir;
    }

    @Override
    public String toString() {
        return "Moto N° : " + numImmat + ", Modéle : " + marque + " " + modele;
    }
}
