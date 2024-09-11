package Models;

public enum Modele {

    GT911("Porsche",100, 310),
    WRC206("Peugeot", 40, 280),
    GTR35("Nissan", 100, 330),
    C3RALLY("Citroen", 40, 250),
    CLIOS1600("Renault", 40, 270);

    private double vitesseMin;
    private double vitesseMax;
    private String marque;
    private double chrono;

    Modele(String marque, double vitesseMin, double vitesseMax){
        this.vitesseMin = vitesseMin;
        this.vitesseMax = vitesseMax;
    }

//region GET/SET
    public double getVitesseMin() {
        return vitesseMin;
    }
    public double getVitesseMax() {
        return vitesseMax;
    }
    public double getChrono(){
        return chrono;
    }

    public void setVitesseMin(double vitesseMin) {
        this.vitesseMin = vitesseMin;
    }
    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
    public void setChrono(double chrono){
        this.chrono = chrono;
    }
//endregion

}
