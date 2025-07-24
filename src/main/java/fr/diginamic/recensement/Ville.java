package fr.diginamic.recensement;

public class Ville {
    //Code région;Nom de la région;    Code département;Code arrondissement;Code canton;Code commune;Nom de la commune       ;Population municipale;Population comptée à part;Population totale;
    //84         ;Auvergne-Rhône-Alpes;01              ;2                  ;08         ;001         ;L' Abergement-Clémenciat;767                  ;18                       ;785;


    private final int codeRegion;
    private final String nomDeLaRegion;
    private final String codeDepartement;
    private final int codeDeLaCommun;
    private final String nomDeLaCommun;
    private final int popTotale;

    public Ville (int codeRegion,String nomDeLaRegion, String codeDepartement, int codeDeLaCommun, String nomDeLaCommun,int popTotale){
        this.codeRegion=codeRegion;
        this.nomDeLaRegion=nomDeLaRegion;
        this.codeDepartement=codeDepartement;
        this.codeDeLaCommun=codeDeLaCommun;
        this.nomDeLaCommun=nomDeLaCommun;
        this.popTotale=popTotale;
    }

    @Override
    public String toString() {
        return this.nomDeLaCommun+ "     "+ this.nomDeLaRegion + "     pop="+this.popTotale;
    }

    public int getCodeRegion() {
        return codeRegion;
    }

    public String getNomDeLaRegion() {
        return nomDeLaRegion;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public int getCodeDeLaCommun() {
        return codeDeLaCommun;
    }

    public String getNomDeLaCommun() {
        return nomDeLaCommun;
    }

    public int getPopTotale() {
        return popTotale;
    }

}
