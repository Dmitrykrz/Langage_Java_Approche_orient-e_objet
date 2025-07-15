package entites;

public class AdressePostale {
    int numeroRue;
    String libelleRue;
    int codePostal;
    String ville;

    AdressePostale(){


    }

    AdressePostale(int numeroRue, String libelleRue,int codePostal,String ville){
     this.numeroRue=numeroRue;
     this.libelleRue=libelleRue;
     this.codePostal=codePostal;
     this.ville=ville;


    }
    public String print_address() {
        return numeroRue + " " + libelleRue + ", " + codePostal + " " + ville;
    }
}
