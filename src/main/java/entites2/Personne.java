package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale address;

    public Personne(){
    }

    public Personne(String nom, String prenom){
        this.nom= nom;
        this.prenom=prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adressePostale){
        this.nom= nom;
        this.prenom=prenom;
        this.address=adressePostale;
    }
     public void show (){
         System.out.println(this.nom.toUpperCase()+" "+ this.prenom);
     }


    public void change_name (String new_name){
        this.nom= new_name;
    }

    public void change_first_name (String new_first_name){
        this.prenom= new_first_name;
    }

    public void change_address(AdressePostale new_addr){
        this.address= new_addr;
    }

    public void show_name (){
        System.out.println(this.prenom);
    }


    public void show_last_name (){
        System.out.println(this.nom.toUpperCase());
    }
    public void show_address() {
        System.out.println(address.print_address());
    }


}
