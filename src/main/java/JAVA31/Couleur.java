package JAVA31;


public enum Couleur {
    Rouge("R"), Vert("V"), Bleu("B"), Jaune("J"), Noir("N"); //

    private String code;

    Couleur(String code) {
        this.code = code;
    }

    public String getShortColorCode() {
        return code;
    }

    public static Couleur getCouleurDefaut() {
        return Noir;
    }
}