package fr.diginamic.maison;

public abstract class Piece {

    double superficie;
    int numeroEtage;

    public Piece(double superficie, int numeroEtage) {
        if (superficie <= 0 ) {
            throw new IllegalArgumentException("Cannot create room with negative area");
        }
        this.superficie = superficie;
        this.numeroEtage = numeroEtage;
    }
    double getSuperficie(){
        return this. superficie;
    }
    double getNumeroEtage(){
        return this.numeroEtage;
    }


}
