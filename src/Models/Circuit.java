package Models;

public enum Circuit {
    SPA(7.005),
    LEMANS(14.89),
    NURBURGRING(28.8),
    SUZUKA(8),
    SILVERSTONE(9.149),
    LAGUNA(38.5);

    private double longueur;

    Circuit(double longueur){
        this.longueur = longueur;
    }

//region GET/SET
//endregion

}