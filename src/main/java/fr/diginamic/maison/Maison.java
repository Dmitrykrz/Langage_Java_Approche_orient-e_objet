package fr.diginamic.maison;

import java.util.ArrayList;
import java.util.List;

public class Maison {

    private List<Piece> pieces;

    public Maison() {
        this.pieces = new ArrayList<>();
    }

    public void ajouterPiece(Piece piece) {
        if (piece == null) {
            throw new IllegalArgumentException("error creating empty object");
        }
        this.pieces.add(piece);
    }

    public double getSuperficieTotale() {
        double superficieTotale = 0;
        for (Piece piece : pieces) {
            superficieTotale += piece.getSuperficie();
        }
        return superficieTotale;
    }

    public double getSuperficieParEtage(int numeroEtage) {

        double superficieEtage = 0;
        for (Piece piece : pieces) {
            if (piece.getNumeroEtage() == numeroEtage) {
                superficieEtage += piece.getSuperficie();
            }
        }
        return superficieEtage;
    }


    public double surfaceByRoomType(Class<? extends Piece> roomToSearch) {
        double area = 0;
        for (Piece piece : pieces) {
            if (roomToSearch.isInstance(piece)) {
                area += piece.getSuperficie();
            }
        }
        return area;
    }


    public int numberByRoomType(Class<? extends Piece> roomToSearch) {
        int numberOfRooms=0;
        for (Piece piece : pieces) {
            if (roomToSearch.isInstance(piece)) {
                numberOfRooms++;
            }
        }
        return numberOfRooms;
    }
}