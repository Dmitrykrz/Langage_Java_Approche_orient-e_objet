package fr.diginamic.operations;

public class Operations {
    public double calcul (double a, double b, char c ){
        if (c=='*') return a*b;
        else if (c=='/') return a/b;
        else if (c=='-') return a-b;
        else if (c=='+') return a+b;
        else throw new IllegalArgumentException("Only * / - + are allowed");
    }
}
