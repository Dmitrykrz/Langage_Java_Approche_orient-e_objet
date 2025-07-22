package ExerciceNote;
import ExerciceNote.Vehicules.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Port {
    private int maxVoiture;
    private int maxMoto;
    private int maxMaritime;


    private static final int MAX_VOITURE_DEFAULT = 10;
    private static final int MAX_MOT0_DEFAULT = 5;
    private static final int MAX_MARITIME_DEFAULT = 20;
    private static final double MAX_RESERVOIR_DEFAULT = 500;

    private double essenceReservoir;
    private double carburantRestant;

    private Collection<Voiture> voituresGarer;
    private Collection<Moto> motosGarer;
    private Collection<Maritime> maritimesAmarer;



    public Port() throws Exception {
              this(MAX_VOITURE_DEFAULT,MAX_MOT0_DEFAULT,MAX_MARITIME_DEFAULT,MAX_RESERVOIR_DEFAULT);

    }


    public Port(int max_voiture, int max_moto, int max_bateaux, double reservoir_max) throws Exception {
        if (max_voiture<0 || max_moto<0 || max_bateaux<0 || reservoir_max<=0)
            throw new Exception("Nombre de places ou taille de réservoir incorrects pour créer un port");
        else {

            this.maxVoiture = max_voiture;
            this.maxMoto = max_moto;
            this.maxMaritime = max_bateaux;
            this.voituresGarer = new ArrayList<>();
            this.motosGarer = new ArrayList<>();
            this.maritimesAmarer = new ArrayList<>();
            this.essenceReservoir = reservoir_max;
            this.remplirReservoir();
        }
    }





    public void garer(Routier vehicule) throws Exception {
        if (vehicule instanceof Voiture) {
            if (voituresGarer.size() >= maxVoiture) {
                throw new Exception("il n'y a pas de place pour garer cette voiture");
            }
            voituresGarer.add((Voiture) vehicule);
        } else if (vehicule instanceof Moto) {
            if (motosGarer.size() >= maxMoto) {
                throw new Exception("il n'y a pas de place pour garer cette moto");
            }
            motosGarer.add((Moto) vehicule);
        } else {
            throw new Exception("Cannot park this type of road vehicle.");
        }
    }

    public void amarer(Maritime vehicule) throws Exception {
        if (maritimesAmarer.size() >= maxMaritime) {
            throw new Exception("il n'y a pas de place pour amarer ce bateau");
        }
        maritimesAmarer.add(vehicule);
    }

    public void sortir(Vehicule vehicule) throws Exception {
        boolean removed = false;
        if (vehicule instanceof Voiture) {
            removed = voituresGarer.remove((Voiture) vehicule);
        } else if (vehicule instanceof Moto) {
            removed = motosGarer.remove((Moto) vehicule);
        } else if (vehicule instanceof Maritime) {
            removed = maritimesAmarer.remove((Maritime) vehicule);
        }

        if (!removed) {
            throw new Exception("il n'existe pas de tel véhicule");
        }
    }

 public void remplirReservoir(){
     this.carburantRestant=this.essenceReservoir;

 }


    public double getReservoir(){
        return this.carburantRestant;
    }

    public double getReservoirMax(){
        return this.essenceReservoir;
    }

    public void getFuelFromPort(double fuel){
        this.carburantRestant=this.carburantRestant-fuel;

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();



        sb.append("\n\n---------------------------------------------------------------\n");
        sb.append("---------------- Véhicules dans un port -----------------------\n");
        sb.append("---------------------------------------------------------------\n");
        sb.append("Nombre de voitures: ").append(voituresGarer.size()).append("\n");
        voituresGarer.forEach(i -> sb.append(i).append("\n"));
        sb.append("---------------------------------------------------------------\n");
        sb.append("Nombre de motos:").append(motosGarer.size()).append("\n");
        motosGarer.forEach(i -> sb.append(i).append("\n"));
        sb.append("---------------------------------------------------------------\n");
        sb.append("Nombre de bateaux: ").append(maritimesAmarer.size()).append("\n");
        maritimesAmarer.forEach(i -> sb.append(i).append("\n"));
        sb.append("---------------------------------------------------------------\n");
        sb.append("----------------- Carburant au port ").append(getReservoir()).append(" l--------------------\n");
        sb.append("---------------------------------------------------------------\n");
        sb.append("-------------- le réservoir est plein à ").append(getReservoir() / getReservoirMax()*100).append(" % ----------------\n");
        sb.append("---------------------------------------------------------------\n");





        return sb.toString();
    }
}